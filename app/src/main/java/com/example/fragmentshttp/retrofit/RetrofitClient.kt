package com.example.fragmentshttp

import com.example.fragmentshttp.data.InfoModel
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

object RetrofitClient {

    private const val BASE_URL = "https://run.mocky.io/v3/"

    private val retrofitBuilder by lazy {
        Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    fun infoService() = retrofitBuilder.create(InfoService::class.java)
}

interface InfoService {

    @GET("3588163c-a9c8-488c-af9a-534b392e7128")
    suspend fun getInfo(): Response<InfoModel>

}