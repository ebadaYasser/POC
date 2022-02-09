package com.check.fullcycklepoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.check.cache.db.FieldDataBase
import com.check.domain.models.Field
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
        formViewModel.getForm()
        formViewModel.getCachedFields("1")
    }

    private fun initObservers() {
        formViewModel.apply {
            observe(this@MainActivity, { handleWeatherData(it) })
            observeFoundedItemInAdapterList(this@MainActivity, { foundedItemInAdapterList(it) })
        }
    }

    private fun handleWeatherData(fields: List<Field>) {
        formAdapter.setData(fields)
        formRv.adapter = formAdapter
    }

    private fun foundedItemInAdapterList(foundedItemInAdapterList: Int) {
        if (::formAdapter.isInitialized) {
            formAdapter.notifyItemChanged(foundedItemInAdapterList)
        }
    }

    override  fun onParentChanges(parentField: Field) {
        if (::formAdapter.isInitialized) {
            formViewModel.saveForm(parentField)
            formViewModel.afterNotifiedParentChanged(
                parentField,
                formAdapter.getCurrentList(),
                !formRv.isComputingLayout
            )
        }
    }
}