package com.example.prueba1androi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usua;
    EditText contra;
    Button buton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usua = (EditText) findViewById(R.id.id_usuario);
        contra = (EditText) findViewById(R.id.id_contraseña);
        buton = (Button) findViewById(R.id.id_conectar);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usua.getText().toString().isEmpty() || contra.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "PORFAVOR INGRESE SU Usuario y Contraseña", Toast.LENGTH_LONG).show();

                }
                String usr = usua.getText().toString();
                String ctn = contra.getText().toString();
                if (usr.equals("adm123") & ctn.equals("adm123")) {
                    Intent I = new Intent(getApplicationContext(), censo.class);
                    I.putExtra("usuario", usr);
                    I.putExtra("contraseña", ctn);
                    startActivity(I);
                } else {
                    Toast.makeText(getApplicationContext(), "SE INGRESARON LOS Datos Incorrectos REVISE PORFAVOR", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

