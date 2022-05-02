package com.example.home.data.response

import java.io.Serializable

data class InformationListResponse(val customers: List<HomeInformationModel>)

data class HomeInformationModel(
    val status: String = "",
    val profileImage: String = "",
    val profileLink: String = "",
    val phone: String = "",
    val email: String = "",
    val name: String = "",
    val id: String = ""
) : Serializable
