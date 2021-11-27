package com.example.fest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    Button btnEmp;
    Button btnProdu;
    Button btnServi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*---------------------------------------------------------------------------------------------*/
        btnEmp = (Button) findViewById(R.id.btnfest);
        btnEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaEmp = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(pantallaEmp);
            }
        });

        btnProdu = (Button) findViewById(R.id.btnprod);
        btnProdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaEmp = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(pantallaEmp);
            }
        });

        btnServi = (Button) findViewById(R.id.btnserv);
        btnServi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaEmp = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(pantallaEmp);
            }
        });
/*---------------------------------------------------------------------------------------------*/
    }
/*----------------------------------------------------------------*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menufest, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.itemempresa){
            Intent pantallaEmp = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(pantallaEmp);
        }
        if(id == R.id.itemprod){
            //Toast.makeText(this, "Seleccionó opción Productos", Toast.LENGTH_LONG).show();
            Intent pantallaEmp = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(pantallaEmp);
        }
        if(id == R.id.itemserv){
            //Toast.makeText(this, "Seleccionó opción servicios", Toast.LENGTH_LONG).show();
            Intent pantallaEmp = new Intent(getApplicationContext(), MainActivity4.class);
            startActivity(pantallaEmp);
        }
        return super.onOptionsItemSelected(item);
    }
}