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

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_ar)

    // val backBtn = findViewById<Button>(R.id.back_btn)
    val arView = findViewById<ARLocalizerView>(R.id.arLocalizer)
    arView.onCreate(this)
    arView.setDestinations(listOf(LocationData(56.3435, 45.32434)))
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
