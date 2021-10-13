package com.example.prueba1androi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class CENSO2022 extends AppCompatActivity {
 Spinner menu;
 ArrayList <String>Menus= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_censo2022);
        menu=(Spinner)findViewById(R.id.spinner);
        Menus.add("......");
        Menus.add("hombre");
        Menus.add("mujer");

        ArrayAdapter<String>adaptazo=new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Menus);
        menu.setAdapter(adaptazo);





    }
}