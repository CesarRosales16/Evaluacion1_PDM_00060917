package com.example.evaluacion1_00060917

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val mIntent = getIntent()
        if (mIntent != null) {
            tv_usuario.text = mIntent.getStringExtra("nameKey")
            tv_correo.text = mIntent.getStringExtra("emailKey")
            tv_total.text = mIntent.getStringExtra("totalKey")
            cont_prod1.text = mIntent.getStringExtra("prod1Key")
            cont_prod2.text = mIntent.getStringExtra("prod2Key")
            cont_prod3.text = mIntent.getStringExtra("prod3Key")
            cont_prod4.text = mIntent.getStringExtra("prod4Key")
            cont_prod5.text = mIntent.getStringExtra("prod5Key")
            cont_prod6.text = mIntent.getStringExtra("prod6Key")
            cont_prod7.text = mIntent.getStringExtra("prod7Key")
            cont_prod8.text = mIntent.getStringExtra("prod8Key")
            cont_prod9.text = mIntent.getStringExtra("prod9Key")
        }
        btn_share.setOnClickListener() {
            val mIntentShare = Intent()
            mIntentShare.type = "text/plain"
            mIntentShare.action = Intent.ACTION_SEND
            val infoToShare = "User: " + mIntent.getStringExtra("nameKey") +
                    "\nEmail: " + mIntent.getStringExtra("emailKey") +
                    "\nTotal de producto: " + mIntent.getStringExtra("totalKey") +
                    "\nCantidad producto 1: " + mIntent.getStringExtra("prod1Key") +
                    "\nCantidad producto 2: " + mIntent.getStringExtra("prod2Key") +
                    "\nCantidad producto 3: " + mIntent.getStringExtra("prod3Key") +
                    "\nCantidad producto 4: " + mIntent.getStringExtra("prod4Key") +
                    "\nCantidad producto 5: " + mIntent.getStringExtra("prod5Key") +
                    "\nCantidad producto 6: " + mIntent.getStringExtra("prod6Key") +
                    "\nCantidad producto 7: " + mIntent.getStringExtra("prod7Key") +
                    "\nCantidad producto 8: " + mIntent.getStringExtra("prod8Key") +
                    "\nCantidad producto 9: " + mIntent.getStringExtra("prod9Key")
            mIntentShare.putExtra("extraTextKey", infoToShare)
            startActivity(mIntentShare)
        }
    }
}