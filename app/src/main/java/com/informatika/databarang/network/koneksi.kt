package com.informatika.databarang.network

import  retrofit2.Retrofit
import  retrofit2.converter.gson.GsonConverterFactory

class koneksi {
    companion object{
        val BaseUrl = "http://192.168.43.196/dabar/api//"
        var retrofit = Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var service: ApiService = retrofit.create(ApiService::class.java)
    }
}