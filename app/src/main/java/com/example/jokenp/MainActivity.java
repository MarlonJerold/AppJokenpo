package com.example.jokenp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada(1);
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada(2);
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada(3);
    }

    public void opcaoSelecionada(int opcaoSelecionada) {

        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(3);
        int[] op = {1,2,3};
        int opApp = op[numero];


        switch (opApp) {
            case 1:
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case 2:
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case 3:
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if (
                (opApp == 3 && opcaoSelecionada == 2) ||
                (opApp == 2 && opcaoSelecionada == 1) ||
                (opApp == 1 && opcaoSelecionada == 3)
        ){
            textResultado.setText("Você perdeu ");
        }else if(
                (opcaoSelecionada == 3 && opApp == 2) ||
                (opcaoSelecionada == 2 && opApp == 1) ||
                (opcaoSelecionada == 1 && opApp == 3)
        ) {
            textResultado.setText("Você ganhou ");
        }else{
            textResultado.setText("Empatamos");
        }

        System.out.println("item clicado: " + opApp);



    }

}