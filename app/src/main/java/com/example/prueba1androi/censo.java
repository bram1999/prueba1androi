package com.example.prueba1androi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class censo extends AppCompatActivity {
    ImageButton BUTON1;
    TextView TOTY;
    TextView MACHO;
    TextView HEMBRA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_censo);
        TOTY =(TextView) findViewById(R.id.totality);
        MACHO =(TextView) findViewById(R.id.macho);
        HEMBRA =(TextView) findViewById(R.id.dama);
        BUTON1 =(ImageButton) findViewById(R.id.cosita_con_verde);

        Bundle b = getIntent().getExtras();
        Integer franchescototy = b.getInt("bonus");
        Integer mac = b.getInt("bonusM");
        Integer hem = b.getInt("bonusH");

        TOTY.setText(""+franchescototy);
        MACHO.setText(""+mac);
        HEMBRA.setText(""+hem);



    }
    public void f(View v){
        BUTON1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),CENSO2022.class);
                startActivity(I);
            }
        });
    }
}