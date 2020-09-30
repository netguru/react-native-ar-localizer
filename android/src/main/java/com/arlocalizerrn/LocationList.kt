package com.arlocalizerrn
import java.io.Serializable


class LocationList(locationArray: java.util.ArrayList<Any>) : Serializable {
    var locations: java.util.ArrayList<HashMap<String,Double>> = locationArray as java.util.ArrayList<HashMap<String,Double>>

}

