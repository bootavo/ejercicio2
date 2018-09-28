package com.practica.ejercicio_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mSueldoBase;
    private EditText mCantidadHijos;

    private TextView mSueldoTotal;

    private Button btnCalcular;

    private double nota1;
    private double nota2;
    private double nota3;

    private int cantidad_hijos = 0;
    private double sueldo_total = 0;
    private double sueldo_base = 0;

    private int multiplicador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSueldoBase = (EditText) findViewById(R.id.sueldo_base);
        mCantidadHijos = (EditText) findViewById(R.id.cantidad_hijos);

        mSueldoTotal = (TextView) findViewById(R.id.st);

        btnCalcular = (Button) findViewById(R.id.btn_calcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSueldoTotal.setText("Sueldo Total: "+getSueldoTotal());
            }
        });

    }
    public double getSueldoTotal(){

        sueldo_base = Double.parseDouble(mSueldoBase.getText().toString());
        cantidad_hijos = Integer.parseInt(mCantidadHijos.getText().toString());

        if (cantidad_hijos > 5){
            multiplicador = 200;
        }else{
            multiplicador = 100;
        }

        sueldo_total = (cantidad_hijos*multiplicador);
        return sueldo_total;
    }

}
