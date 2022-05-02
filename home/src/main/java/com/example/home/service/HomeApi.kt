package com.example.home.service

import com.example.home.data.response.InformationListResponse
import retrofit2.Response
import retrofit2.http.GET

interface HomeApi {
    @GET("newloran2/testApp/main/service.json")
    suspend fun getHomeInformation(): Response <InformationListResponse>
}
