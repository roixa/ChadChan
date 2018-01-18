package com.roix.chadchan.data.repositories.server.models

import com.roix.chadchan.data.common.Parseble
import com.roix.chadchan.data.models.ThreadItem
import com.roix.chadchan.data.repositories.server.ServerToDataConverter

/**
 * Created by belyalov on 26.12.2017.
 */
class ServerThreadListResponse : Parseble<List<ThreadItem>> {

    var threads: List<ServerThread>? = null

    override fun isValid(): Boolean = threads != null

    override fun parse(): List<ThreadItem> = ServerToDataConverter.convertToListData(threads)


}