package com.example.windows.home.RecyclerPalavras;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.windows.home.ClassCard.Card;
import com.example.windows.home.ClassCard.ListaDeCards;
import com.example.windows.home.ClassPalavra.Palavra;
import com.example.windows.home.MainActivity;
import com.example.windows.home.R;
import com.example.windows.home.DialogWord.WordDialog;
import com.example.windows.home.Teste.Cartao;
import com.example.windows.home.Teste.Word;
import com.example.windows.home.praticar;

import java.util.ArrayList;
import java.util.List;

public class PalavrasActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.LayoutManager manager;
    private RecyclerView.Adapter adapter;
    private List<String> dataset;
    private ArrayList<Cartao> listaDeCartao;
    private Card card;
    private Cartao cartao;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palavras);
        recycler = (RecyclerView) findViewById(R.id.my_recycler_view);

        manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recycler.setLayoutManager(manager);

        cartao = (Cartao) getIntent().getSerializableExtra("cartao");

        //listaDeCartao.get(position).setWords(new ArrayList<Word>());

        adapter = new AdapterPalavras(cartao.getWords(),this);
        recycler.setAdapter(adapter);
    }

    public void abrirDialogo (View view){
        WordDialog dialog = new WordDialog(this, cartao);
        dialog.show();
    }

    public void proxima_pag (View view){
        Log.d("card prox pag ",card.toString());

        Intent in = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("card", card);
        in.putExtras(bundle);
    }


}

