package com.roix.chadchan.ui.thread_list.views

import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.RecyclerView
import com.roix.chadchan.R
import com.roix.chadchan.data.models.ThreadItem
import com.roix.chadchan.databinding.FragmentThreadListBinding
import com.roix.chadchan.databinding.ItemThreadBinding
import com.roix.chadchan.ui.common.fragments.BaseListFragment
import com.roix.chadchan.ui.common.view.ToolbarType
import com.roix.chadchan.ui.thread_list.viewmodels.ThreadListViewModel

/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */

class ThreadListFragment : BaseListFragment<ThreadListViewModel, FragmentThreadListBinding, ItemThreadBinding, ThreadItem>() {


    override fun getRecyclerView(): RecyclerView = binding.rv

    override fun getSwipeToRefreshLayout(): SwipeRefreshLayout? = binding.srl

    override fun getLayoutId(): Int = R.layout.fragment_thread_list

    override fun getItemLayoutId(): Int = R.layout.item_thread

    override fun handleProgress(isProgress: Boolean) {
    }

}

