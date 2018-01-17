package com.roix.chadchan.ui.main.views

import android.support.v7.widget.Toolbar
import com.roix.chadchan.R
import com.roix.chadchan.databinding.ActivityMainBinding
import com.roix.chadchan.ui.common.activities.BaseSingleFragmentActivity
import com.roix.chadchan.ui.common.view.ToolbarType
import com.roix.chadchan.ui.main.viewmodels.MainViewModel

/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */

class MainActivity : BaseSingleFragmentActivity<MainViewModel, ActivityMainBinding>() {

    override fun getFragmentContainerId(): Int = R.id.container

    override fun getToolbar(): Toolbar? = binding.toolbar!!.tb

    override fun getLayoutId(): Int = R.layout.activity_main

}

