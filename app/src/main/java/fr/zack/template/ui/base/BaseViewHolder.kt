package fr.zack.template.ui.base

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

abstract class BaseViewHolder<ViewModel>(parent: ViewGroup, layoutId: Int) :
    RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(layoutId, parent, false)) {

    protected val context: Context
        get() = itemView.context

    abstract fun bind(item: ViewModel)
}