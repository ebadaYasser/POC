package com.check.presenter

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.check.domain.models.newestresponse.NewField
import com.check.domain.models.newestresponse.WorkItem
import com.check.domain.usecase.FormUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class FormViewModel(private val formUseCase: FormUseCase) : BaseViewModel() {
    private val fieldData = MutableLiveData<List<NewField>>()
    private val workItem = MutableLiveData<WorkItem>()
    private val foundedItemInAdapterList = MutableLiveData<Int>()

    fun getForm() {
//        fieldData.postValue(checkFieldsForFirstTime(formUseCase.getForm()))
    }


    fun saveValue(
        values: MutableList<String>?,
        formId: String?,
        fieldId: String?
    ) {
        compositeDisposable.add(
            formUseCase.saveValue(values, formId, fieldId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({}, {})

        )
    }


    fun observe(
        lifecycleOwner: LifecycleOwner,
        observer: Observer<List<NewField>>
    ) {
        fieldData.observe(lifecycleOwner, observer)
    }

    fun observeFoundedItemInAdapterList(
        lifecycleOwner: LifecycleOwner,
        observer: Observer<Int>
    ) {
        foundedItemInAdapterList.observe(lifecycleOwner, observer)
    }


    fun observeWorkItem(
        lifecycleOwner: LifecycleOwner,
        observer: Observer<WorkItem>
    ) {
        workItem.observe(lifecycleOwner, observer)
    }


    fun getWorkItem() {
        compositeDisposable.add(
            formUseCase.getWorkItem()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    workItem.value = it
                }, {

                })
        )
    }

    fun saveWorkItem(workItem: WorkItem) {
        compositeDisposable.add(
            formUseCase.saveWorkItem(workItem)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({}, {})

        )
    }

    fun saveForm(form: List<NewField>) {
        compositeDisposable.add(
            formUseCase.saveForm(form)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({}, {})

        )
    }


    fun afterNotifiedParentChanged(parent: NewField, items: List<NewField>, isComputing: Boolean) {
//        for (childFieldId in parent.childFields ?: mutableListOf()) {
//            val foundItemInAdapter = items.find { it.id == childFieldId }
//            val updateDependencyHelper = CalculateDependencyHelper(foundItemInAdapter!!, parent)
//            val index = items.indexOf(foundItemInAdapter)
//            updateDependencyHelper.isThereAnyDependencyValidated()
//            if (isComputing)
//                foundedItemInAdapterList.value = index
//        }
    }

//    private fun checkFieldsForFirstTime(items: List<NewField>): List<NewField> {
//        for (parent in items) {
//            for (childFieldId in parent.childFields ?: mutableListOf()) {
//                val foundItemInAdapter = items.find { it.id == childFieldId }
//                val updateDependencyHelper = CalculateDependencyHelper(foundItemInAdapter!!, parent)
//                updateDependencyHelper.isThereAnyDependencyValidated()
//
//            }
//
//        }
//        return items
//    }

}