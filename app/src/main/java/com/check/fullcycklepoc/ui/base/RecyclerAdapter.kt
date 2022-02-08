package com.check.fullcycklepoc.ui.base

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.check.fullcycklepoc.ui.base.ext.inflate

abstract class RecyclerAdapter<T, H : RecyclerAdapter.BaseViewHolder<T>> :
    RecyclerView.Adapter<H>() {

    internal var items = mutableListOf<T>()

    /**
     * @Mandatory
     * By using this object in ChildAdapters you can submit list to AsyncListDiffer and do all stuff
     * you need with items in recycler.
     */
    @Suppress("LeakingThis")
    protected val differAsync =
        AsyncListDiffer<T>(this@RecyclerAdapter, generateAsyncDifferCallback())

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): H {
        return instantiateViewHolder(parent.inflate(getLayoutId(viewType)), viewType)
    }

    override fun getItemCount() =differAsync.currentList.size //items.size

    protected open fun getItemFrom(position: Int) = items[position]

    fun clear() {
        items.clear()
        notifyItemRangeRemoved(0, itemCount)
    }

    protected fun buildEmptyView(context: Context): View {
        val empty = View(context)
        val params = RecyclerView.LayoutParams(0, 0)
        empty.layoutParams = params
        return empty
    }

    @LayoutRes
    protected abstract fun getLayoutId(viewType: Int): Int

    abstract fun setData(newItems: List<T>)

    protected abstract fun instantiateViewHolder(itemView: View, viewType: Int): H


    abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {

        abstract fun bind(item: T, isLast: Boolean)

        fun showItem(show: Boolean) {
            var layoutParams = itemView.layoutParams
            if (itemView.layoutParams is RecyclerView.LayoutParams) {
                layoutParams = itemView.layoutParams as RecyclerView.LayoutParams
                if (!show) {
                    layoutParams.bottomMargin = 0
                    layoutParams.topMargin = 0
                }
            } else if (itemView.layoutParams is ConstraintLayout.LayoutParams) {
                layoutParams = itemView.layoutParams as ConstraintLayout.LayoutParams
                if (!show) {
                    layoutParams.bottomMargin = 0
                    layoutParams.topMargin = 0
                }
            }
            layoutParams?.let { params ->
                if (show) {
                    params.height = ViewGroup.LayoutParams.WRAP_CONTENT
                    params.width = ViewGroup.LayoutParams.MATCH_PARENT
                    itemView.visibility = View.VISIBLE
                } else {
                    itemView.visibility = View.GONE
                    params.height = 0
                    params.width = 0
                }
                itemView.layoutParams = params
            }
        }
    }

    /**
     * @Mandatory
     * This function @Must be overrode as its main object to create AsyncDiffer call back
     * For how to use it check this code snippet
     *
     *   override fun generateAsyncDifferCallback(): ItemCallback<T> {
     *  return object : DiffUtil.ItemCallback<T>() {
     * override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
     * return oldItem.hashCode() == newItem.hashCode()
     *}
     * override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
     *return oldItem == newItem}}}
     * To know more about AsyncListDiffer check the below URL
     * @https://developer.android.com/reference/androidx/recyclerview/widget/AsyncListDiffer
     */
    abstract fun generateAsyncDifferCallback(): DiffUtil.ItemCallback<T>

}