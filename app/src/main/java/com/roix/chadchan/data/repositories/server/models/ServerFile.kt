package com.roix.chadchan.data.repositories.server.models

import com.roix.chadchan.data.common.Parseble
import com.roix.chadchan.data.models.FileItem

/**
 * Created by belyalov on 26.12.2017.
 */
class ServerFile : Parseble<FileItem> {

    var path: String? = null
    var thumbnail: String? = null

    override fun isValid(): Boolean = path!=null

    override fun parse(): FileItem = FileItem(path!!,thumbnail)


}