package com.isgneuro.android.photogallery.api

import com.google.gson.annotations.SerializedName
import com.isgneuro.android.photogallery.GalleryItem

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
}