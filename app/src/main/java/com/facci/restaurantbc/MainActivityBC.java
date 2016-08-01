package com.facci.restaurantbc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityBC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_bc);
    }

    public void click1 (View v){
        Toast.makeText(MainActivityBC.this,"Seco de Pollo",Toast.LENGTH_SHORT).show();

    }
    public void click2 (View v){
        Toast.makeText(MainActivityBC.this,"Tonga",Toast.LENGTH_SHORT).show();

    }
    public void click3 (View v){
        Toast.makeText(MainActivityBC.this,"Chame frito con ensalada\n",Toast.LENGTH_SHORT).show();

    }
    public void click4 (View v){
        Toast.makeText(MainActivityBC.this,"Cevivhe de Camaron con Patacones",Toast.LENGTH_SHORT).show();

    }
    public void click5 (View v){
        Toast.makeText(MainActivityBC.this,"Conchitas Asadas",Toast.LENGTH_SHORT).show();

    }
    public void click6 (View v){
        Toast.makeText(MainActivityBC.this,"Pulpo asado con pure de patatas e hinojo",Toast.LENGTH_SHORT).show();

    }
    public void click7 (View v){
        Toast.makeText(MainActivityBC.this,"Arroz con carne",Toast.LENGTH_SHORT).show();

    }

}
