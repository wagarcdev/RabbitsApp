package com.arcieri.wagner.rabbitsapp.data

import retrofit2.http.GET

interface RabbitsAPI {

    @GET("/random_rabbit")
    suspend fun getRandomRabbit(): Rabbit

    companion object {

        //Use "http://10.0.2.2:8080" for testing with AVD
        //For test with Real Devices use IPv4 of Local Machine Ethernet adapter
        // ( cmd -> ipconfig -> 192.168.43.212 -> Use ex: "http://192.168.43.212:8080")
        // remember to change configuration in server

        const val BASE_URL = "http://192.168.43.212:8080"
    }

}