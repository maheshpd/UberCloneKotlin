package com.createsapp.uberclonekotlin

import com.createsapp.uberclonekotlin.model.DriverInfoModel

object Common {
    fun buildWelcomeMessage(): String {
        return StringBuilder("Welcome, ")
            .append(currentUser!!.firstname)
            .append(" ")
            .append(currentUser!!.lastName)
            .toString()
    }

    val DRIVER_LOCATION_REFERENCE: String = "DriversLocation"
    var currentUser: DriverInfoModel? = null
    val DRIVER_INFO_REFERENCE: String = "DriverInfo"
}