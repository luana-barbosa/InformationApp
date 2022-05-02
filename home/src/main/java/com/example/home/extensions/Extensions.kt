package com.example.home

fun String?.orEmptyName(): String? { return if (this?.isEmpty() == true) "No Name" else this}

fun String?.orEmptyPhone(): String? { return if (this?.isEmpty() == true) "No Phone" else this}

fun String?.orEmptyEmail(): String? { return if (this?.isEmpty() == true) "No Email" else this}

fun String?.orEmptyStatus(): String? { return if (this?.isEmpty() == true) "No Status" else this}

fun String?.orEmptyLink(): String? { return if (this?.isEmpty() == true) "No Link" else this}
