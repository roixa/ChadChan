package com.roix.chadchan.utils.binding

import android.databinding.BindingAdapter
import android.databinding.BindingConversion
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.v4.content.ContextCompat
import android.support.v4.widget.SwipeRefreshLayout
import android.text.Html
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.roix.chadchan.BuildConfig
import com.roix.chadchan.data.models.FileItem
import com.roix.chadchan.ui.common.viewmodels.BaseListViewModel
import com.squareup.picasso.Picasso

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
    Picasso.with(imageView.context).load(url).into(imageView)
}

@BindingAdapter("bind:imageUrlList")
fun setImageUrlList(imageView: ImageView, files: List<FileItem>?) {
    Log.d("boux","files null"+ (files==null).toString())
    if (files != null && !files.isEmpty()) {
        Log.d("boux","files size"+ (files.size).toString())
        Log.d("boux","files url "+ (BuildConfig.SERVER_ENDPOINT+files[0].thumbnail))

        Picasso.with(imageView.context).load(BuildConfig.SERVER_ENDPOINT+files[0].thumbnail).into(imageView)
    }
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

