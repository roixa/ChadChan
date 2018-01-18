package com.roix.chadchan.data.repositories.server

import com.roix.chadchan.data.common.Parseble

/**
 * Created by belyalov on 26.12.2017.
 */
class ServerToDataConverter {
    companion object {

        fun <T> convertToData(parseble: Parseble<T>?): T {
            if (parseble == null || !parseble.isValid()) throw Exception("invalid " + parseble?.javaClass.toString())
            else return parseble.parse()
        }

        fun <T> convertToListData(parsebleList: List<Parseble<T>>?): List<T> {
            val ret = ArrayList<T>()
            if (parsebleList == null) throw Exception("empty list ")
            for (parseble in parsebleList) {
                if (parseble.isValid()) {
                    ret.add(parseble.parse())
                }
            }
            return ret
        }

    }
}