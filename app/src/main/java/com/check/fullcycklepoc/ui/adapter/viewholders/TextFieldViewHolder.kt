package com.check.fullcycklepoc.ui.adapter.viewholders

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.check.core.base.DependencyActions.HIDDEN
import com.check.domain.models.newestresponse.NewField
import com.check.fullcycklepoc.R
import com.check.fullcycklepoc.ui.adapter.OnParentChanges
import com.check.fullcycklepoc.ui.base.RecyclerAdapter


class TextFieldViewHolder(
    private val onParentChanges: OnParentChanges,
    view: View
) : RecyclerAdapter.BaseViewHolder<NewField>(view) {

    private val label = itemView.findViewById<TextView>(R.id.label_tv)
    private val textArea = itemView.findViewById<EditText>(R.id.text_box_et)

    override fun bind(item: NewField, isLast: Boolean) {
        label.text = item.enLabel
        if (item.values == null)
            item.values = mutableListOf()

        if (item.values != null && item.values?.isNotEmpty() == true)
            item.values?.get(0)?.let { textArea.setText(it.toString()) }
        else
            textArea.setText("")

        val isFieldHasDependencies = item.conditionalView?.conditions?.isEmpty() ?: false
        val action = item.conditionalView?.action

        if (action == HIDDEN)
            showItem(isFieldHasDependencies)
        else
            showItem(!isFieldHasDependencies)
        val obj = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s?.length == 0)
                    item.values?.clear()
                else {
                    item.values?.clear()
                    item.values?.add(s?.toString() as String)
                }
                onParentChanges.onParentChanges(item)

            }
        }
        textArea.setOnFocusChangeListener { _, b ->
            if (b)
                textArea.addTextChangedListener(obj)
            else
                textArea.removeTextChangedListener(obj)
        }

    }
}