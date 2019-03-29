package com.example.evaluacion1_00060917;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView tv_user, tv_email, tv_total, num_prod1, num_prod2, num_prod3, num_prod4, num_prod5, num_prod6, num_prod7, num_prod8, num_prod9;
    private Button btn_share;
    private TextView tv_shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_user = findViewById(R.id.tv_usuario);
        tv_email = findViewById(R.id.tv_correo);
        tv_total = findViewById(R.id.tv_total);
        num_prod1 = findViewById(R.id.cont_prod1);
        num_prod2 = findViewById(R.id.cont_prod2);
        num_prod3 = findViewById(R.id.cont_prod3);
        num_prod4 = findViewById(R.id.cont_prod4);
        num_prod5 = findViewById(R.id.cont_prod5);
        num_prod6 = findViewById(R.id.cont_prod6);
        num_prod7 = findViewById(R.id.cont_prod7);
        num_prod8 = findViewById(R.id.cont_prod8);
        num_prod9 = findViewById(R.id.cont_prod9);
        btn_share = findViewById(R.id.btn_share);
        tv_shared = findViewById(R.id.tv_shared_info);
        Intent mIntent = getIntent();
        if (mIntent != null) {
            tv_user.setText(mIntent.getStringExtra("nameKey"));
            tv_email.setText(mIntent.getStringExtra("emailKey"));
            tv_total.setText(mIntent.getStringExtra("totalKey"));
            num_prod1.setText(mIntent.getStringExtra("prod1Key"));
            num_prod2.setText(mIntent.getStringExtra("prod2Key"));
            num_prod3.setText(mIntent.getStringExtra("prod3Key"));
            num_prod4.setText(mIntent.getStringExtra("prod4Key"));
            num_prod5.setText(mIntent.getStringExtra("prod5Key"));
            num_prod6.setText(mIntent.getStringExtra("prod6Key"));
            num_prod7.setText(mIntent.getStringExtra("prod7Key"));
            num_prod8.setText(mIntent.getStringExtra("prod8Key"));
            num_prod9.setText(mIntent.getStringExtra("prod9Key"));

        }
        btn_share.setOnClickListener(v -> {
            Log.d("xd", "click share");
            Intent mIntentShare = new Intent();
            mIntentShare.setType("text/plain");
            mIntentShare.setAction(Intent.ACTION_SEND);
            String infoToShare = "User: " + mIntent.getStringExtra("nameKey") + "\nEmail: " + mIntent.getStringExtra("emailKey") + "\nTotal de producto: " + mIntent.getStringExtra("totalKey") + "\nCantidad producto 1: " + mIntent.getStringExtra("prod1Key") + "\nCantidad producto 2: " + mIntent.getStringExtra("prod2Key") + "\nCantidad producto 3: " + mIntent.getStringExtra("prod3Key") +
                    "\nCantidad producto 4: " + mIntent.getStringExtra("prod4Key") +
                    "\nCantidad producto 5: " + mIntent.getStringExtra("prod5Key") +
                    "\nCantidad producto 6: " + mIntent.getStringExtra("prod6Key") +
                    "\nCantidad producto 7: " + mIntent.getStringExtra("prod7Key") +
                    "\nCantidad producto 8: " + mIntent.getStringExtra("prod8Key") +
                    "\nCantidad producto 9: " + mIntent.getStringExtra("prod9Key");
            mIntentShare.putExtra("extraTextKey", infoToShare);
            startActivity(mIntentShare);
        });
    }
}
