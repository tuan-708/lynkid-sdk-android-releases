package com.lynkid_sdk_android.example

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import vn.linkid.sdk.LynkiD_SDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<AppCompatButton>(R.id.btnOpen).setOnClickListener {
            LynkiD_SDK.start(
                this,
                findViewById<AppCompatEditText>(R.id.edtPartnerCode).text.toString(),
                findViewById<AppCompatEditText>(R.id.edtPhoneNumber).text.toString(),
                findViewById<AppCompatEditText>(R.id.edtCIF).text.toString(),
                findViewById<AppCompatEditText>(R.id.edtName).text.toString(),
                findViewById<AppCompatEditText>(R.id.edtAppName).text.toString(),
            )
        }
    }
}