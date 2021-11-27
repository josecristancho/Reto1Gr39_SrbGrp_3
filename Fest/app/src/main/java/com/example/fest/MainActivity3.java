package com.example.fest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button btnIni2;
    Button btnEmpre3;
    Button btnServi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnIni2 = (Button) findViewById(R.id.btninicio3);
        btnIni2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaProductos = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(pantallaProductos);
            }
        });
        btnEmpre3 = (Button) findViewById(R.id.btnEmp3);
        btnEmpre3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaProductos = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(pantallaProductos);
            }
        });
        btnServi3 = (Button) findViewById(R.id.btnserv3);
        btnServi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaProductos = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(pantallaProductos);
            }
        });

    }
}