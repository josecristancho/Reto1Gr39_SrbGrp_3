package com.example.fest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button btnIni4;
    Button btnEmpre4;
    Button btnProdu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnIni4 = (Button) findViewById(R.id.btninicio4);
        btnIni4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaServicios = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(pantallaServicios);
            }
        });
        btnEmpre4 = (Button) findViewById(R.id.btnEmp4);
        btnEmpre4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaServicios = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(pantallaServicios);
            }
        });
        btnProdu4 = (Button) findViewById(R.id.btnprod4);
        btnProdu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaServicios = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(pantallaServicios);
            }
        });

    }
}