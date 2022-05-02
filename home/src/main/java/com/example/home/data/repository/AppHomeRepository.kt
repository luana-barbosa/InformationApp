package com.example.home.data.repository

import com.example.home.data.response.InformationListResponse
import com.example.home.service.HomeApi
import com.example.network.response.Output
import com.example.network.response.parseResponse

class AppHomeRepository(
    private val service: HomeApi
) : HomeRepository {

    override suspend fun getHomeInformation(): InformationListResponse {
        return when (val homeWidgets = service.getHomeInformation().parseResponse()) {
            is Output.Success -> {
                homeWidgets.body
            }
            is Output.Failure -> {
                throw Exception()
            }
        }
    }
}

interface HomeRepository {
    suspend fun getHomeInformation(): InformationListResponse
}
