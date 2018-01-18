package com.roix.chadchan.ui.common.view

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import com.facebook.drawee.view.SimpleDraweeView

/**
 * Created by roix on 18.01.2018.
 */
class SquareImageView : SimpleDraweeView {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet,
                defStyle: Int) : super(context, attrs, defStyle) {
    }

    override fun onMeasure(width: Int, height: Int) {
        super.onMeasure(width, height)
        val measuredWidth = getMeasuredWidth()
        val measuredHeight = getMeasuredHeight()
        if (measuredWidth > measuredHeight) {
            setMeasuredDimension(measuredWidth, measuredWidth)
        } else {
            setMeasuredDimension(measuredHeight, measuredHeight)

        }

    }

}
