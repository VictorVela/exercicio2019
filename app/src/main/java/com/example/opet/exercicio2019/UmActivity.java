package com.example.opet.exercicio2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class UmActivity extends AppCompatActivity {

    private EditText editExercicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_um);

        editExercicio = findViewById(R.id.editExercicio);
    }

    public void palindromo(View v) {
        String usuario = editExercicio.getText().toString();
        String reverso = new StringBuilder(usuario).reverse().toString();

        if (reverso.equals(usuario)) {
            Toast.makeText(this, "Palindromo", Toast.LENGTH_SHORT);
        } else {
            Toast.makeText(this, "Nâo é Palindromo", Toast.LENGTH_SHORT);
        }
    }

    public void contador(View v) {
        String frase = editExercicio.getText().toString().toUpperCase();
        frase = frase.replace(",", "");
        String palavras[] = frase.split(",");

        Toast.makeText(this, String.valueOf(palavras.length), Toast.LENGTH_SHORT);

    }

    public void rolagemDados(View v) {
        Integer qtdDados = Integer.parseInt(editExercicio.getText().toString());
        Integer total = 0;

        for (int i = 0; i < qtdDados; i++) {
            Random random = new Random();

            total += random.nextInt(6) + 1;
        }

        editExercicio.setText(total.toString());
    }
}
