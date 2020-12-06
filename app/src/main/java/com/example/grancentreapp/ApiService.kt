package com.example.grancentreapp

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("api.php")
    fun getMovie(): Observable<Object>

    companion object {
        fun create(): ApiService {

            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(
                            RxJava2CallAdapterFactory.create())
                    .addConverterFactory(
                            GsonConverterFactory.create())
                    .baseUrl("https://run.mocky.io/v3/61956657-3737-470a-a617-c7c4c9dbf78b/")
                    .build()

            return retrofit.create(ApiService::class.java)
        }
    }
}