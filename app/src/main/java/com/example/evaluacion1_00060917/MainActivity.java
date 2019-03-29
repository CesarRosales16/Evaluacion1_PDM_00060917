package com.example.evaluacion1_00060917;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0, contProductos = 0;
    private LinearLayout prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9;
    private TextView tv_prod1, tv_prod2, tv_prod3, tv_prod4, tv_prod5, tv_prod6, tv_prod7, tv_prod8, tv_prod9;
    private EditText user, email;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prod1 = findViewById(R.id.prod_1);
        prod2 = findViewById(R.id.prod_2);
        prod3 = findViewById(R.id.prod_3);
        prod4 = findViewById(R.id.prod_4);
        prod5 = findViewById(R.id.prod_5);
        prod6 = findViewById(R.id.prod_6);
        prod7 = findViewById(R.id.prod_7);
        prod8 = findViewById(R.id.prod_8);
        prod9 = findViewById(R.id.prod_9);
        tv_prod1 = findViewById(R.id.cont_prod1);
        tv_prod2 = findViewById(R.id.cont_prod2);
        tv_prod3 = findViewById(R.id.cont_prod3);
        tv_prod4 = findViewById(R.id.cont_prod4);
        tv_prod5 = findViewById(R.id.cont_prod5);
        tv_prod6 = findViewById(R.id.cont_prod6);
        tv_prod7 = findViewById(R.id.cont_prod7);
        tv_prod8 = findViewById(R.id.cont_prod8);
        tv_prod9 = findViewById(R.id.cont_prod9);
        user = findViewById(R.id.et_user);
        email = findViewById(R.id.et_email);
        btn_send = findViewById(R.id.btn_send);

        prod1.setOnClickListener(v -> {
            cont1++;
            contProductos++;
            tv_prod1.setText(Integer.toString(cont1));
        });
        prod2.setOnClickListener(v -> {
            cont2++;
            contProductos++;
            tv_prod2.setText(Integer.toString(cont2));
        });
        prod3.setOnClickListener(v -> {
            cont3++;
            contProductos++;
            tv_prod3.setText(Integer.toString(cont3));
        });
        prod4.setOnClickListener(v -> {
            cont4++;
            contProductos++;
            tv_prod4.setText(Integer.toString(cont4));
        });
        prod5.setOnClickListener(v -> {
            cont5++;
            contProductos++;
            tv_prod5.setText(Integer.toString(cont5));
        });
        prod6.setOnClickListener(v -> {
            cont6++;
            contProductos++;
            tv_prod6.setText(Integer.toString(cont6));
        });
        prod7.setOnClickListener(v -> {
            cont7++;
            contProductos++;
            tv_prod7.setText(Integer.toString(cont7));
        });
        prod8.setOnClickListener(v -> {
            cont8++;
            contProductos++;
            tv_prod8.setText(Integer.toString(cont8));
        });
        prod9.setOnClickListener(v -> {
            cont9++;
            contProductos++;
            tv_prod9.setText(Integer.toString(cont9));
        });
        btn_send.setOnClickListener(v -> {
            Intent mIntent = new Intent(MainActivity.this, Main2Activity.class);
            mIntent.putExtra("nameKey", user.getText().toString());
            mIntent.putExtra("emailKey", email.getText().toString());
            mIntent.putExtra("totalKey", Integer.toString(contProductos));
            mIntent.putExtra("prod1Key", Integer.toString(cont1));
            mIntent.putExtra("prod2Key", Integer.toString(cont2));
            mIntent.putExtra("prod3Key", Integer.toString(cont3));
            mIntent.putExtra("prod4Key", Integer.toString(cont4));
            mIntent.putExtra("prod5Key", Integer.toString(cont5));
            mIntent.putExtra("prod6Key", Integer.toString(cont6));
            mIntent.putExtra("prod7Key", Integer.toString(cont7));
            mIntent.putExtra("prod8Key", Integer.toString(cont8));
            mIntent.putExtra("prod9Key", Integer.toString(cont9));
            startActivity(mIntent);
        });
    }
}
