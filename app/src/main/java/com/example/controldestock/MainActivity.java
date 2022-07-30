package com.example.controldestock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void accederPrincipal(View view) {

        Intent acceder_principal= new Intent(this,PrincipalActivity.class);
        startActivity(acceder_principal);
    }
}