package com.mindorks.ridesharing.ui.maps

import com.google.android.gms.maps.model.LatLng

interface MapsView {
    fun showNearbyCabs(latlangList: List<LatLng>)

    fun showPath(latLngList : List<LatLng>)


    fun informCabBooked()
}