package com.example.apprevision

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apprevision.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setup()

    }

    private fun setup() {
        SharedPref.initsharedpref(applicationContext)
        loadsharedpref()
        binding.btnsave.setOnClickListener { saveusername() }
    }

    private fun loadsharedpref() {
        /*val sharedpref = this.getSharedPreferences(SHAREDPREF, Context.MODE_PRIVATE)
        val username = sharedpref.getString(USERNAMEKEY, "")*/
        binding.textusername.text = SharedPref.username

    }

    private fun saveusername() {
        //val sharedpref = this.getSharedPreferences(SHAREDPREF, Context.MODE_PRIVATE)
        //val editor = sharedpref.edit()
        SharedPref.username = binding.edittextuser.text.toString()
        //editor.putString(USERNAMEKEY, username)
        //editor.apply()
    }


}