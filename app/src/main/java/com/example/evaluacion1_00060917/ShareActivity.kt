package com.example.evaluacion1_00060917

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_share.*

class ShareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)
        val mIntentShare = intent

        val sharedText = intent.getStringExtra(Intent.EXTRA_TEXT)
        if (mIntentShare != null) {
            tv_shared_info.text = mIntentShare.getStringExtra("extraTextKey")
        }
        if (sharedText != null) {
            tv_shared_info.text = intent.getStringExtra(Intent.EXTRA_TEXT)
        }
    }
}
