package com.check.presenter

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.check.helper.CalculateDependencyHelper
import com.check.domain.models.Field
import com.check.domain.usecase.FormUseCase

class FormViewModel(private val formUseCase: FormUseCase) : ViewModel() {
    private val fieldData = MutableLiveData<List<Field>>()
    private val foundedItemInAdapterList = MutableLiveData<Int>()

    fun getForm() {
        fieldData.postValue(checkFieldsForFirstTime(formUseCase.getForm()))
    }

     fun saveForm(fields: List<Field>) {
        formUseCase.saveDateInCache(fields)
    }

    fun observe(
        lifecycleOwner: LifecycleOwner,
        observer: Observer<List<Field>>
    ) {
        fieldData.observe(lifecycleOwner, observer)
    }

    fun observeFoundedItemInAdapterList(
        lifecycleOwner: LifecycleOwner,
        observer: Observer<Int>
    ) {
        foundedItemInAdapterList.observe(lifecycleOwner, observer)
    }

    fun afterNotifiedParentChanged(parent: Field, items: List<Field>, isComputing: Boolean) {
        for (childFieldId in parent.childFields ?: mutableListOf()) {
            val foundItemInAdapter = items.find { it.id == childFieldId }
            val updateDependencyHelper = CalculateDependencyHelper(foundItemInAdapter!!, parent)
            val index = items.indexOf(foundItemInAdapter)
            updateDependencyHelper.isThereAnyDependencyValidated()
            if (isComputing)
                foundedItemInAdapterList.value = index
        }
    }

    private fun checkFieldsForFirstTime(items: List<Field>): List<Field> {
        for (parent in items) {
            for (childFieldId in parent.childFields ?: mutableListOf()) {
                val foundItemInAdapter = items.find { it.id == childFieldId }
                val updateDependencyHelper = CalculateDependencyHelper(foundItemInAdapter!!, parent)
                updateDependencyHelper.isThereAnyDependencyValidated()

            }

        }
        return items
    }

}