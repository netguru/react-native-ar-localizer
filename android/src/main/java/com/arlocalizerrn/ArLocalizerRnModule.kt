package com.arlocalizerrn

import android.content.Intent
import com.facebook.react.bridge.*
import java.io.Serializable

class ArLocalizerRnModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "ArLocalizerRn"
    }

    // Example method
    // See https://facebook.github.io/react-native/docs/native-modules-android
    @ReactMethod
    fun createArView(locations: ReadableArray, promise: Promise) {
        val intent = Intent(reactApplicationContext, ArActivity::class.java)
        val locations = LocationList(locations.toArrayList());

        intent.putExtra("locations",locations as Serializable)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        reactApplicationContext.startActivity(intent)
        promise.resolve(true)
    }


}
