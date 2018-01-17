package com.roix.chadchan.toothpick.common

import android.content.Context
import com.roix.chadchan.application.CommonApplication
import com.roix.chadchan.utils.rx.general.RxSchedulers
import com.roix.chadchan.utils.rx.general.RxSchedulersAbs
import toothpick.config.Module

/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */
class ApplicationModule(val application: CommonApplication) : Module() {
    init {
        bind(Context::class.java).toInstance(application.applicationContext)
        bind(RxSchedulersAbs::class.java).toInstance(RxSchedulers())
    }
}