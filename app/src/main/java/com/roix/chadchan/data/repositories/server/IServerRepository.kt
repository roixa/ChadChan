package com.roix.chadchan.data.repositories.server

import com.roix.chadchan.data.models.ThreadItem
import io.reactivex.Single

/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */
interface IServerRepository {
    fun getThreads(page: Int): Single<List<ThreadItem>>
}