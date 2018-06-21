package com.example.windows.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridLayout;

import com.example.windows.home.ClassCard.Card;
import com.example.windows.home.ClassCard.ListaDeCards;
import com.example.windows.home.DialogCard.CardDialog;
import com.example.windows.home.RecyclerCard.CardAdapter;
import com.example.windows.home.Teste.CardsList;
import com.example.windows.home.Teste.Cartao;
import com.example.windows.home.Teste.Word;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCard;
    private RecyclerView.Adapter adapterCard;
    private RecyclerView.LayoutManager layoutManagerCard;
    private ListaDeCards listaDeCards;
    private CardsList cardsList;
    private List<Cartao>  listaDeCartao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCard = (RecyclerView) findViewById(R.id.recyclerViewCard);

        layoutManagerCard = new GridLayoutManager(this, 2, GridLayout.VERTICAL, false);
        recyclerViewCard.setLayoutManager(layoutManagerCard);

        //listaDeCards = new ListaDeCards();
        listaDeCartao =  new ArrayList<>();


        adapterCard = new CardAdapter(listaDeCartao, this);
        recyclerViewCard.setAdapter(adapterCard);

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        CardDialog cardDialog = new CardDialog(this, listaDeCartao);
        cardDialog.show();

        return super.onOptionsItemSelected(item);
    }



    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Card card = getIntent().getParcelableExtra("card");
        if(card!=null){
            Log.d("original: ", card.getPalavras().toString());
        }
        //this.listaDeCards.getListCards().get(0).setPalavras(card.getPalavras());

    }


}



