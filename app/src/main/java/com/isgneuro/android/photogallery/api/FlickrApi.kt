package com.isgneuro.android.photogallery.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
//    @GET("/")
//    fun fetchContents(): Call<String>

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
        "&api_key=41f346f52bf678f61533df891b862ce3" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
}