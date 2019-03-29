package com.example.evaluacion1_00060917;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView tv_user,tv_email,tv_total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_user = findViewById(R.id.tv_usuario);
        tv_email = findViewById(R.id.tv_correo);
        tv_total = findViewById(R.id.tv_total);
        Intent mIntent = getIntent();
        if (mIntent != null) {
            tv_user.setText(mIntent.getStringExtra("nameKey"));
            tv_email.setText(mIntent.getStringExtra("emailKey"));
            tv_total.setText(mIntent.getStringExtra("totalKey"));
            /*tvPassword.setText(mIntent.getStringExtra(AppConstants.PASSWORD_KEY));
            tvEmail.setText(mIntent.getStringExtra(AppConstants.EMAIL_KEY));
            tvGender.setText(mIntent.getStringExtra(AppConstants.GENDER_KEY));*/
        }
    }
}
