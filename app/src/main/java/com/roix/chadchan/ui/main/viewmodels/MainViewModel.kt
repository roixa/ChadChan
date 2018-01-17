package com.roix.chadchan.ui.main.viewmodels

import com.roix.chadchan.buissness.main.IMainInteractor
import com.roix.chadchan.toothpick.main.MainModule
import com.roix.chadchan.ui.common.viewmodels.BaseLifecycleViewModel
import javax.inject.Inject
import toothpick.config.Module

/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */
class MainViewModel : BaseLifecycleViewModel() {

    @Inject
    protected lateinit var mainInteractor: IMainInteractor

    override fun getModule(): Module = MainModule()
}
