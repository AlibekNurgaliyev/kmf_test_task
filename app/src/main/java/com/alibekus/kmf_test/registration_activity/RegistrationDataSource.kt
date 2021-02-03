package com.alibekus.kmf_test.registration_activity

import com.alibekus.kmf_test.models.UserNameData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RegistrationDataSource {

    @GET("/{username}")
    fun getInfo(
        @Path(value = "username") username: String
    ): Call<List<UserNameData>>
}
