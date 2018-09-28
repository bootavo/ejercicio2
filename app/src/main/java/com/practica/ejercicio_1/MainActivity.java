package com.practica.ejercicio_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private EditText n3;
    private EditText ep;
    private EditText ef;

    private TextView PP;
    private TextView PF;

    private Button btnCalcular;

    private double nota1;
    private double nota2;
    private double nota3;

    private double e_parcial;
    private double e_final;

    private double promedio_practicas = 0;
    private double promedio_final = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        n3 = (EditText) findViewById(R.id.n3);

        ep = (EditText) findViewById(R.id.ep);
        ef = (EditText) findViewById(R.id.ef);

        PP = (TextView) findViewById(R.id.pp);
        PF = (TextView) findViewById(R.id.pf);

        btnCalcular = (Button) findViewById(R.id.btn_calcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PP.setText("Promedio Practicas: "+getPromPra());
                PF.setText("Promedio Final: "+getPromFinal());
            }
        });

    }

    public double getPromFinal(){
        if(promedio_practicas > 0 ){

            e_parcial = Double.parseDouble(ep.getText().toString());
            e_final = Double.parseDouble(ef.getText().toString());

            promedio_final = e_parcial + e_final + promedio_practicas / 3;
        }

        return promedio_final;
    }

    public double getPromPra(){

        nota1 = Double.parseDouble(n1.getText().toString());
        nota2 = Double.parseDouble(n2.getText().toString());
        nota3 = Double.parseDouble(n3.getText().toString());

        promedio_practicas = (nota1+nota2+nota3) / 3;
        return promedio_practicas;
    }

}
