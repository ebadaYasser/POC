package com.check.fullcycklepoc.ui.adapter.viewholders

import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.check.core.base.DependencyActions
import com.check.domain.models.Field
import com.check.fullcycklepoc.R
import com.check.fullcycklepoc.ui.adapter.OnParentChanges
import com.check.fullcycklepoc.ui.base.RecyclerAdapter
import com.check.fullcycklepoc.ui.base.openCalendarAndSetTextInResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class CalendarViewHolder(
    private val onParentChanges: OnParentChanges,
    private val view: View
) : RecyclerAdapter.BaseViewHolder<Field>(view) {

    private val title = itemView.findViewById<TextView>(R.id.label_tv_date)
    private val textArea = itemView.findViewById<EditText>(R.id.text_box_et_date_date)
    override fun bind(item: Field, isLast: Boolean) {
        val isFieldHasDependencies = item.conditionalView?.conditions?.isEmpty() ?: false
        val action = item.conditionalView?.action
        if (action == DependencyActions.HIDDEN)
            showItem(isFieldHasDependencies)
        else
            showItem(!isFieldHasDependencies)

        title.text = item.enLabel
        itemView.context.openCalendarAndSetTextInResult(item, textArea) {

            GlobalScope.launch (Dispatchers.Main) {
            onParentChanges.onParentChanges(it)
            }
        }

    }
}