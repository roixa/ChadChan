package com.roix.chadchan.ui.common.activities

import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.RecyclerView
import com.roix.chadchan.ui.common.adapters.BaseObservableAdapter
import com.roix.chadchan.ui.common.viewmodels.BaseListViewModel

/**
 * Created by roix template
 * https://github.com/roixa/RoixArchitectureTemplates
 */
abstract class BaseListActivity<ViewModel : BaseListViewModel<Item>, DataBinding : ViewDataBinding, ItemDataBinding : ViewDataBinding, Item>
    : BaseToolbarActivity<ViewModel, DataBinding>() {


    @LayoutRes
    protected abstract fun getItemLayoutId(): Int

    protected abstract fun getRecyclerView(): RecyclerView

    protected abstract fun getSwipeToRefreshLayout(): SwipeRefreshLayout?

    override fun setupUi() {
        super.setupUi()
        viewModel.setupRecyclerView(getRecyclerView(),
                BaseObservableAdapter<Item, ItemDataBinding>(viewModel.items, getItemLayoutId()),
                getSwipeToRefreshLayout()
        )
    }

}
