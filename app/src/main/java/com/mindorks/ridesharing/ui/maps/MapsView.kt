package com.mindorks.ridesharing.ui.maps

import com.google.android.gms.maps.model.LatLng

interface MapsView {
    fun showNearbyCabs(latlangList: List<LatLng>)

    fun showPath(latLngList : List<LatLng>)


    fun informCabBooked()
    fun updateCabLocation(latLng: LatLng)

    fun informCabIsArriving()

    fun informCabArrived()

    fun informTripStart()

    fun informTripEnd()

    fun showRoutesNotAvailableError()

    fun showDirectionApiFailedError(error : String)

}