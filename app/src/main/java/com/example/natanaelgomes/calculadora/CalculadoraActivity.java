package com.example.natanaelgomes.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;
public class CalculadoraActivity extends Activity {
    EditText ednumero1,ednumero2;
    Button btsomar, btsubtrair, btmultiplicar, btdividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        ednumero1 = (EditText) findViewById(R.id.ednumero1);
        ednumero2 = (EditText) findViewById(R.id.ednumero2);
        btsomar = (Button) findViewById(R.id.btsomar);
        btsubtrair = (Button) findViewById(R.id.btsubtrair);
        btmultiplicar = (Button) findViewById(R.id.btmultiplicar);
        btdividir = (Button) findViewById(R.id.btdividir);
        btsomar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());

                double soma = num1 + num2;

                AlertDialog.Builder dialogo = new
                AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado soma:");
                dialogo.setMessage("A Soma é: " + soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
        btsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());

                double subtrair = num1 - num2;

                AlertDialog.Builder dialogo = new
                AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado subtração:");
                dialogo.setMessage("A Subtração é: " + subtrair);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
        btmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());

                double multiplicar = num1 * num2;

                AlertDialog.Builder dialogo = new
                AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado multiplicação:");
                dialogo.setMessage("A Multiplicação é: " + multiplicar);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
        btdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());

                double dividir = 0;
                if (num2 != 0) {
                     dividir = num1 / num2;
                    AlertDialog.Builder dialogo = new
                    AlertDialog.Builder(CalculadoraActivity.this);
                    dialogo.setTitle("Resultado divisão:");
                    dialogo.setMessage("A divisão é: " + dividir);
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                } else {
                    AlertDialog.Builder dialogo = new
                    AlertDialog.Builder(CalculadoraActivity.this);
                    dialogo.setTitle("Não é possível dividir por 0");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                }
            }
        });
    }
}

