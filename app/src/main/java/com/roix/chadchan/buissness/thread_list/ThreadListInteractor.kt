package com.roix.chadchan.buissness.thread_list

import com.roix.chadchan.data.repositories.server.IServerRepository
import com.roix.chadchan.data.repositories.server.ServerRepository
import javax.inject.Inject
import com.roix.chadchan.data.models.ThreadItem
import io.reactivex.Single

/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */
class ThreadListInteractor : IThreadListInteractor {

    @Inject constructor()

    @Inject lateinit var serverRepository: ServerRepository

    override fun loadItems(page: Int): Single<List<ThreadItem>> = Single.never()


}
