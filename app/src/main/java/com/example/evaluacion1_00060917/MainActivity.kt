package com.example.evaluacion1_00060917

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var cont1 = 0
    var cont2 = 0
    var cont3 = 0
    var cont4 = 0
    var cont5 = 0
    var cont6 = 0
    var cont7 = 0
    var cont8 = 0
    var cont9 = 0
    var contProductos = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prod_1.setOnClickListener() {
            cont1++
            contProductos++
            cont_prod1.text = cont1.toString()
        }
        prod_2.setOnClickListener() {
            cont2++
            contProductos++
            cont_prod2.text = cont2.toString()
        }
        prod_3.setOnClickListener() {
            cont3++
            contProductos++
            cont_prod3.text = cont3.toString()
        }
        prod_4.setOnClickListener() {
            cont4++
            contProductos++
            cont_prod4.text = cont4.toString()
        }
        prod_5.setOnClickListener() {
            cont5++
            contProductos++
            cont_prod5.text = cont5.toString()
        }
        prod_6.setOnClickListener() {
            cont6++
            contProductos++
            cont_prod6.text = cont6.toString()
        }
        prod_7.setOnClickListener() {
            cont7++
            contProductos++
            cont_prod7.text = cont7.toString()
        }
        prod_8.setOnClickListener() {
            cont8++
            contProductos++
            cont_prod8.text = cont8.toString()
        }
        prod_9.setOnClickListener() {
            cont9++
            contProductos++
            cont_prod9.text = cont9.toString()
        }
        btn_send.setOnClickListener() {
            val mIntent = Intent(this@MainActivity, Main2Activity::class.java)
            mIntent.putExtra("nameKey", et_user.text.toString())
            mIntent.putExtra("emailKey", et_email.text.toString())
            mIntent.putExtra("totalKey", contProductos.toString())
            mIntent.putExtra("prod1Key", cont1.toString())
            mIntent.putExtra("prod2Key", cont2.toString())
            mIntent.putExtra("prod3Key", cont3.toString())
            mIntent.putExtra("prod4Key", cont4.toString())
            mIntent.putExtra("prod5Key", cont5.toString())
            mIntent.putExtra("prod6Key", cont6.toString())
            mIntent.putExtra("prod7Key", cont7.toString())
            mIntent.putExtra("prod8Key", cont8.toString())
            mIntent.putExtra("prod9Key", cont9.toString())
            startActivity(mIntent)
        }
    }
}