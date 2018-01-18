package com.roix.chadchan.utils.general

/**
 * Created by roix on 18.01.2018.
 */
object GeneralUtils {

    fun isVideoUrl(url:String):Boolean{
        return url.contains(".mp4",true)||url.contains(".webm",true)
    }
}