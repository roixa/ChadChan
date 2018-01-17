package com.roix.chadchan.ui.thread_list.viewmodels

import com.roix.chadchan.buissness.common.IBaseListInteractor
import com.roix.chadchan.buissness.thread_list.ThreadListInteractor
import com.roix.chadchan.toothpick.thread_list.ThreadListModule
import com.roix.chadchan.data.models.ThreadItem
import com.roix.chadchan.ui.common.viewmodels.BaseListViewModel
import javax.inject.Inject
import toothpick.config.Module

/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */
class ThreadListViewModel : BaseListViewModel<ThreadItem>() {

    @Inject lateinit var interactor: ThreadListInteractor

    override fun getInteractor(): IBaseListInteractor<ThreadItem> = interactor

    override fun getModule(): Module = ThreadListModule()

}
