package com.example1.androidfrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Evento do botão.
    public void gerarFrases(View view) {

        // Array de frases.
        String[] frases = {
                "O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis.",
                "Determinação, coragem e autoconfiança são fatores decisivos para o sucesso. Se estamos possuídos por uma inabalável determinação, conseguiremos superá-los. Independentemente das circunstâncias, devemos ser sempre humildes, recatados e despidos de orgulho.",
                "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas acima de tudo, seja você sempre.",
                "Só existe um êxito: a capacidade de levar a vida que se quer.",
                "A vitalidade é demonstrada não apenas pela persistência, mas pela capacidade de começar de novo.",
                "A coragem não é ausência do medo; é a persistência apesar do medo.",
                "Só se pode alcançar um grande êxito quando nos mantemos fiéis a nós mesmos.",
                "Lute com determinação, abrace a vida com paixão, perca com classe e vença com ousadia, porque o mundo pertence a quem se atreve e a vida é muito para ser insignificante.",
                "Você tem que acordar cada manhã com determinação se você pretende ir para a cama com satisfação."
        };

        // Faz a randomizção da variável até 9 (0-8).
        int numero = new Random().nextInt(9);

        // Recebe o resultado pelo id da classe R.
        TextView texto = findViewById(R.id.txtResultado);
        // Insere a frase no TextView conforme a randomização.
        texto.setText(frases[numero]);
    }
}