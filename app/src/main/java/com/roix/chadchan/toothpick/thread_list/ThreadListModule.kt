package com.roix.chadchan.toothpick.thread_list

import com.roix.chadchan.buissness.thread_list.IThreadListInteractor
import com.roix.chadchan.buissness.thread_list.ThreadListInteractor
import toothpick.config.Module

/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */
class ThreadListModule : Module() {
    init {
        bind(IThreadListInteractor::class.java).to(ThreadListInteractor::class.java).instancesInScope()
    }
}