package com.roix.chadchan.utils.binding

import android.databinding.BindingAdapter
import android.databinding.BindingConversion
import android.net.Uri
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.v4.content.ContextCompat
import android.support.v4.widget.SwipeRefreshLayout
import android.text.Html
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.interfaces.DraweeController
import com.facebook.drawee.view.SimpleDraweeView
import com.roix.chadchan.BuildConfig
import com.roix.chadchan.data.models.FileItem
import com.roix.chadchan.ui.common.viewmodels.BaseListViewModel
import com.facebook.imagepipeline.request.ImageRequestBuilder
import com.facebook.imagepipeline.request.ImageRequest
import android.media.ThumbnailUtils
import android.graphics.Bitmap
import android.provider.MediaStore
import android.widget.VideoView
import com.roix.chadchan.utils.general.GeneralUtils
import java.io.File


/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */
@BindingConversion
fun convertBooleanToVisibility(visible: Boolean): Int {
    return if (visible) View.VISIBLE else View.GONE
}

@BindingAdapter("bind:srcVector")
fun setSrcVector(imageView: ImageView, @DrawableRes res: Int) {
    imageView.setImageResource(res)
}

@BindingAdapter("bind:imageUrl")
fun setImageUrl(imageView: ImageView, url: String) {
    //Picasso.with(imageView.context).load(url).into(imageView)
}

@BindingAdapter("bind:imageUrlList")
        fun setImageUrlList(imageView: SimpleDraweeView, files: List<FileItem>?) {

            if (files != null && !files.isEmpty()) {
                val uriStr=BuildConfig.SERVER_ENDPOINT+files[0].path
                if(GeneralUtils.isVideoUrl(uriStr)){
                    imageView.visibility= View.GONE
                }
                else{
                    val controller = Fresco.newDraweeControllerBuilder()
                            .setUri(uriStr)
                            .setAutoPlayAnimations(true)
                            .build()
                    imageView.controller=controller

                }

    }
}

@BindingAdapter("bind:videoUrlList")
fun setImageUrlList(imageView: VideoView, files: List<FileItem>?) {

    if (files != null && !files.isEmpty()) {
        val uriStr = BuildConfig.SERVER_ENDPOINT + files[0].path
        if (GeneralUtils.isVideoUrl(uriStr)) {
            imageView.setVideoURI(Uri.parse(uriStr))
            imageView.start()

        } else {
            imageView.visibility = View.GONE
        }
    }
}


private fun calculateKind(imageRequest: ImageRequest): Int {
    return if (imageRequest.preferredWidth > 96 || imageRequest.preferredHeight > 96) {
        MediaStore.Images.Thumbnails.MINI_KIND
    } else MediaStore.Images.Thumbnails.MICRO_KIND
}


@BindingAdapter("bind:htmlText")
fun setImageUrl(textView: TextView, text: String) {
    textView.setText(Html.fromHtml(text))
}


@BindingAdapter("bind:refreshing")
fun setSrcCompatRefreshing(layout: SwipeRefreshLayout, state: BaseListViewModel.StateList) {
    layout.isRefreshing = state == BaseListViewModel.StateList.REFRESH
}


@BindingAdapter("bind:tint")
fun setTint(view: ImageView, @ColorRes colorRes: Int) {
    view.setColorFilter(ContextCompat.getColor(view.context, colorRes))
}

@BindingAdapter("bind:tintColor")
fun setTintColor(view: ImageView, color: Int) {
    view.setColorFilter(color)
}

