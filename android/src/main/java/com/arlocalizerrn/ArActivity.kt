package com.arlocalizerrn

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.LifecycleOwner
import com.netguru.arlocalizerview.ARLocalizerDependencyProvider
import com.netguru.arlocalizerview.arview.ARLocalizerView
import com.netguru.arlocalizerview.location.LocationData


class ArActivity : AppCompatActivity(), ARLocalizerDependencyProvider {

    private fun getPoints():MutableList<LocationData>{
        val locationData = intent.getSerializableExtra("locations") as? LocationList
        val points = mutableListOf<LocationData>()

        val locations = locationData?.locations

        if (locations != null) {
            for (location in locations) {
                points.add(LocationData(location["latitude"] as Double, location["longitude"] as Double))
            }
        }
        return points

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ar)

        // val backBtn = findViewById<Button>(R.id.back_btn)
        val arView = findViewById<ARLocalizerView>(R.id.arLocalizer)
        arView.onCreate(this);
        arView.setDestinations(this.getPoints())
        // backBtn.text="<"
        // backBtn.setOnClickListener {
        //   onBackClicked()
        // }
    }
//   private fun onBackClicked() {
//       super.finish()
//   }

    override fun getSensorsContext() = this
    override fun getARViewLifecycleOwner() = this
    override fun getPermissionActivity() = this
}
