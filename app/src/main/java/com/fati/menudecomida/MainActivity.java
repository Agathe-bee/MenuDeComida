package com.fati.menudecomida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaracion de objetos

    CheckBox chb1, chb2, chb3, chb4, chb5, chb6;
    Button button1, button2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chb1 = findViewById(R.id.chbHuevos);
        chb2 = findViewById(R.id.chbBarbacoa);
        chb3 = findViewById(R.id.chbChiles);
        chb4 = findViewById(R.id.chbCarne);
        chb5 = findViewById(R.id.chbMole);
        chb6 = findViewById(R.id.chbTampi);

        button1 = findViewById(R.id.buttonOrden);
        button2 = findViewById(R.id.buttonSalir);

        res = findViewById(R.id.txtOrden);

        button1.setOnClickListener(V->{

            String milista = "";

            if(chb1.isChecked()){

                milista += " " + chb1.getText().toString();

            }
            if(chb2.isChecked()){

                milista += " " + chb2.getText().toString();

            }
            if(chb3.isChecked()){

                milista += " " + chb3.getText().toString();

            }
            if(chb4.isChecked()){

                milista += " " + chb4.getText().toString();

            }
            if(chb5.isChecked()){

                milista += " " + chb5.getText().toString();

            }
            if(chb6.isChecked()){

                milista += " " + chb6.getText().toString();

            }

            res.setText(milista);

        });

        button2.setOnClickListener(V->finish());

    }
}