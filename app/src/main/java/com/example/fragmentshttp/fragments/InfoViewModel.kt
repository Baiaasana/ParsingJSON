package com.example.fragmentshttp.fragments

import android.util.Log.d
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fragmentshttp.RetrofitClient
import com.example.fragmentshttp.data.InfoModel

import kotlinx.coroutines.launch

class InfoViewModel : ViewModel() {

    fun getInfo() {

        viewModelScope.launch {
            val response = RetrofitClient.infoService().getInfo()
            if (response.isSuccessful) {
                val body: InfoModel? = response.body()!!
                d("body", "$body")

            } else {
                val errorBody = response.errorBody()
            }
        }
    }
}

