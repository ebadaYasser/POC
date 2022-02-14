package com.check.presenter

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.check.domain.models.newestresponse.NewField
import com.check.domain.models.newestresponse.WorkItem
import com.check.domain.usecase.FormUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class FormViewModel(private val formUseCase: FormUseCase) : BaseViewModel() {
    private val workItem = MutableLiveData<WorkItem>()
    private val foundedItemInAdapterList = MutableLiveData<Int>()


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

    fun getSavedWorkItem(formId: String) {
        compositeDisposable.add(
            formUseCase.getWorkitem(formId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Log.d("flknfl", "getSavedWorkItem: $it")
                }, {
                })
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

}