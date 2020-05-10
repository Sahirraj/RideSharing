package com.mindorks.ridesharing.ui.maps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.mindorks.ridesharing.R
import com.mindorks.ridesharing.data.network.NetworkService
import com.mindorks.ridesharing.utils.ViewUtils

class MapsActivity : AppCompatActivity(),MapsView, OnMapReadyCallback {

    companion object {
        private const val TAG = "MapsActivity"
        //private const val LOCATION_PERMISSION_REQUEST_CODE = 999
        //private const val PICKUP_REQUEST_CODE = 1
        //private const val DROP_REQUEST_CODE = 2
    }

    private lateinit var presenter: MapsPresenter

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        ViewUtils.enableTransparentStatusBar(window)
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        presenter = MapsPresenter(NetworkService())
        presenter.onAttach(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
    }
}
