package com.example.windows.home.RecyclerCard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.windows.home.ClassCard.Card;
import com.example.windows.home.MainActivity;
import com.example.windows.home.R;
import com.example.windows.home.RecyclerPalavras.PalavrasActivity;
import com.example.windows.home.Teste.Cartao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CardAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<Cartao> cardList;
    private View view;

    public CardAdapter(List<Cartao> datasetCard, Context context) {
        this.context = context;
        this.cardList = datasetCard;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(context).inflate(R.layout.card_list_layout, parent,false);

        ViewHolderCard viewHolder = new ViewHolderCard(view);


        return viewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        final ViewHolderCard viewHolderCard = (ViewHolderCard) holder;
        viewHolderCard.texto.setText(cardList.get(position).getNome());

        ((ViewHolderCard) holder).parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PalavrasActivity.class);

                //Bundle bundle = new Bundle();
                //bundle.putParcelable("card",cardList.get(position));
                intent.putExtra("cartão", (Serializable) cardList.get(position));
                Log.d("Nome CardAdapter", cardList.get(0).getNome());
                intent.putExtra("position", position);

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() { return cardList.size(); }
}
