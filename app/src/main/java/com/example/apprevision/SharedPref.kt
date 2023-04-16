package com.example.apprevision

import android.content.Context
import android.content.SharedPreferences

object SharedPref {
    var sharedPref: SharedPreferences? = null

    fun initsharedpref(context: Context) {
        sharedPref = context.getSharedPreferences(Constants.SHAREDPREF, Context.MODE_PRIVATE)
    }

    var username: String?
        get() = sharedPref?.getString(Constants.USERNAMEKEY, null)
        set(value) {
            sharedPref?.edit()?.putString(Constants.USERNAMEKEY, value)?.apply()
        }
}