package com.example.home.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.home.data.response.HomeInformationModel
import com.example.home.domain.GetHomeInformationUseCase
import kotlinx.coroutines.launch

class HomeInformationViewModel(
    private val getHomeInformationUseCase: GetHomeInformationUseCase
) : ViewModel() {

    private val _homeInformationModel = MutableLiveData<List<HomeInformationModel>>()
    val homeInformationModel = _homeInformationModel  as LiveData<List<HomeInformationModel>>

    fun getHomeInformation() {
        viewModelScope.launch {
            val getInformation = getHomeInformationUseCase()

            _homeInformationModel.value = getInformation.customers
        }
    }
}
