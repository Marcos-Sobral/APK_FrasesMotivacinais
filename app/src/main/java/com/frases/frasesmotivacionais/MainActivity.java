package com.frases.frasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView frases;
    private Button gerarFrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frases = findViewById(R.id.frases);
        gerarFrases = findViewById(R.id.gerarFrases);

        getSupportActionBar().hide();

        gerarFrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] frasesMotivacionais = {"Os limites só existem se você os deixar existir - By: Dragonball",
                        "O Naruto pode ser um pouco duro as vezes, talvez você não saiba mas ele também cresceu sem pai e nunca teve nenhum amigo em nossa aldeia, na verdade ele nunca conheceu nenhum de seus pais, mas eu nunca vi ele chorar meu palpite... Ele se cansou de chorar - By Kakashi",
                        "A vida das pessoas não acaba quando elas morrem, mas sim quando perdem a fé - bY Itachi"};

                frases.setText(frasesMotivacionais[2]);

            }

        });

    }
}