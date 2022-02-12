package com.example.android.modern.androidcomlpetearchitecture.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelLiveData : ViewModel(){
    var someLiveData : LiveData<String> = MutableLiveData()

    fun saveSomeData(someValue:String){
        (someLiveData as MutableLiveData).value = someValue
    }
}