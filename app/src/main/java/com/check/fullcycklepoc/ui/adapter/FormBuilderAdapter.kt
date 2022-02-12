package com.check.fullcycklepoc.ui.adapter

import android.view.View
import androidx.recyclerview.widget.DiffUtil
import com.check.core.base.FieldTypes.CALENDAR
import com.check.core.base.FieldTypes.TEXT_FIELD
import com.check.core.base.FieldsAdapterViewTypes.CALENDAR_TYPE
import com.check.core.base.FieldsAdapterViewTypes.TEXT_BOX_TYPE
import com.check.domain.models.newestresponse.NewField
import com.check.fullcycklepoc.R
import com.check.fullcycklepoc.ui.adapter.viewholders.CalendarViewHolder
import com.check.fullcycklepoc.ui.adapter.viewholders.TextFieldViewHolder
import com.check.fullcycklepoc.ui.base.RecyclerAdapter


class FormBuilderAdapter(private val onParentChanges: OnParentChanges) :
    RecyclerAdapter<NewField, RecyclerAdapter.BaseViewHolder<NewField>>() {

    override fun getLayoutId(viewType: Int): Int = when (viewType) {
        TEXT_BOX_TYPE -> R.layout.item_edit_text
        CALENDAR_TYPE -> R.layout.item_calendar
        else -> R.layout.item_calendar
    }

    override fun setData(newItems: List<NewField>) {
//        items.addAll(newItems)
        differAsync.submitList(newItems)

    }

    override fun instantiateViewHolder(itemView: View, viewType: Int): BaseViewHolder<NewField> {
        return when (viewType) {
            TEXT_BOX_TYPE -> TextFieldViewHolder(onParentChanges, itemView)
            CALENDAR_TYPE -> CalendarViewHolder(onParentChanges, itemView)
            else -> TextFieldViewHolder(onParentChanges, itemView)
        }
    }

    override fun generateAsyncDifferCallback(): DiffUtil.ItemCallback<NewField> {
        return object : DiffUtil.ItemCallback<NewField>() {
            override fun areItemsTheSame(oldItem: NewField, newItem: NewField): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: NewField, newItem: NewField): Boolean {
                return oldItem == newItem
            }

        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (differAsync.currentList[position].controlType) { //   items[position].controlTyp
            TEXT_FIELD -> TEXT_BOX_TYPE
            CALENDAR -> CALENDAR_TYPE
            else -> TEXT_BOX_TYPE
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder<NewField>, position: Int) {
        when (holder) {
            is TextFieldViewHolder -> holder.bind(
                differAsync.currentList[position],
                itemCount - 1 == position
            ) //holder.bind(items[position], position == items.size)//
            is CalendarViewHolder -> holder.bind(
                differAsync.currentList[position],
                itemCount - 1 == position
            )//holder.bind(items[position], position == items.size)//
        }
    }

    fun getCurrentList(): List<NewField> {
        return differAsync.currentList
    }
}