package com.roix.chadchan.application

import android.app.Application
import com.roix.chadchan.BuildConfig
import com.roix.chadchan.FactoryRegistry
import com.roix.chadchan.MemberInjectorRegistry
import com.roix.chadchan.toothpick.common.ApplicationModule
import com.roix.chadchan.toothpick.common.ApplicationScope
import toothpick.Toothpick
import toothpick.Toothpick.setConfiguration
import toothpick.configuration.Configuration.forDevelopment
import toothpick.configuration.Configuration.forProduction
import toothpick.registries.FactoryRegistryLocator
import toothpick.registries.MemberInjectorRegistryLocator
import toothpick.smoothie.module.SmoothieApplicationModule

/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */
class CommonApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        val configuration = if (BuildConfig.DEBUG) forDevelopment() else forProduction()
        setConfiguration(configuration.disableReflection())
        FactoryRegistryLocator.setRootRegistry(FactoryRegistry())
        MemberInjectorRegistryLocator.setRootRegistry(MemberInjectorRegistry())

        val appScope = Toothpick.openScope(this)
        appScope.installModules(SmoothieApplicationModule(this), ApplicationModule(this))
        appScope.bindScopeAnnotation(ApplicationScope::class.java)
    }
}