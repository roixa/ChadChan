package com.roix.chadchan.toothpick.main

import com.roix.chadchan.buissness.main.IMainInteractor
import com.roix.chadchan.buissness.main.MainInteractor
import toothpick.config.Module

/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */
class MainModule : Module() {
    init {
        bind(IMainInteractor::class.java).to(MainInteractor::class.java).instancesInScope()
    }
}