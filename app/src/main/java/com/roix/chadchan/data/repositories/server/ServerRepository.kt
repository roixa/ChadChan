package com.roix.chadchan.data.repositories.server

import android.content.Context
import com.roix.chadchan.data.models.ThreadItem
import com.roix.chadchan.toothpick.common.ApplicationScope
import io.reactivex.Single
import javax.inject.Inject


/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */
@ApplicationScope
class ServerRepository : IServerRepository {

    private val BOARD = "b"

    private lateinit var serverApi: ServerApi

    @Inject
    fun ServerRepository(context: Context) {
        val client = ServerApi.ServerFactory.createOkHttpClient(context)
        serverApi = ServerApi.ServerFactory.createInstance(client).create(ServerApi::class.java)
    }

    override fun getThreads(page: Int): Single<List<ThreadItem>> = serverApi.getThreads(BOARD, page)
            .map { t -> ServerToDataConverter.convertToListData(t.threads) }

}
