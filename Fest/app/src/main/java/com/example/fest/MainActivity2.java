package com.example.fest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button btnIni;
    Button btnProdu2;
    Button btnServi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnIni = (Button) findViewById(R.id.btninicio2);
        btnIni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaEmpresa = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(pantallaEmpresa);
            }
        });
        btnProdu2 = (Button) findViewById(R.id.btnprod2);
        btnProdu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaEmpresa = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(pantallaEmpresa);
            }
        });
        btnServi2 = (Button) findViewById(R.id.btnserv2);
        btnServi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaEmpresa = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(pantallaEmpresa);
            }
        });

    }
}