package com.roix.chadchan.data.repositories.server.models

import com.roix.chadchan.data.common.Parseble
import com.roix.chadchan.data.models.ThreadItem
import com.roix.chadchan.data.repositories.server.ServerToDataConverter

/**
 * Created by belyalov on 26.12.2017.
 */
class ServerPost : Parseble<ThreadItem> {

    var comment : String? = null
    var files : List<ServerFile>? = null

    override fun isValid(): Boolean = comment != null

    override fun parse(): ThreadItem {
        return ThreadItem(comment!!, ServerToDataConverter.convertToListData(files))
    }

}