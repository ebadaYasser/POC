package com.check.fullcycklepoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.check.cache.db.FieldDataBase
import com.check.domain.models.newestresponse.NewField
import com.check.domain.models.newestresponse.WorkItem
import com.check.fullcycklepoc.ui.adapter.FormBuilderAdapter
import com.check.fullcycklepoc.ui.adapter.OnParentChanges
import com.check.presenter.FormViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(), OnParentChanges {

    private val formViewModel: FormViewModel by viewModel()
    private lateinit var formAdapter: FormBuilderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FieldDataBase.getInstance(application).getRunDao()

        formAdapter = FormBuilderAdapter(this)
        initObservers()
        formViewModel.getWorkItem()
        getData.setOnClickListener {
            formViewModel.getSavedWorkItem("form1")
        }


    }

    private fun initObservers() {
        formViewModel.apply {
            observeWorkItem(this@MainActivity, { handleWorkItems(it) })
        }
    }


    private fun handleWorkItems(work: WorkItem) {
        formAdapter.setData(work.fields!!)
        formRv.adapter = formAdapter
    }

    private fun foundedItemInAdapterList(foundedItemInAdapterList: Int) {
        if (::formAdapter.isInitialized) {
            formAdapter.notifyItemChanged(foundedItemInAdapterList)
        }
    }

    override fun onParentChanges(parentField: NewField) {
        if (::formAdapter.isInitialized) {
            formViewModel.saveValue(parentField.values, parentField.workItemId, parentField.id)
            formViewModel.afterNotifiedParentChanged(
                parentField,
                formAdapter.getCurrentList(),
                !formRv.isComputingLayout
            )
        }
    }

//    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
}