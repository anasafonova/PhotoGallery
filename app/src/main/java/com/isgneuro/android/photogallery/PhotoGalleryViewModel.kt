package com.isgneuro.android.photogallery

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.isgneuro.android.photogallery.api.FlickrFetcher

class PhotoGalleryViewModel : ViewModel() {
    val galleryItemLiveData: LiveData<List<GalleryItem>>

    init {
        galleryItemLiveData = FlickrFetcher().fetchPhotos()
        //Log.d(TAG, "Response received: $galleryItemLiveData")
    }
}