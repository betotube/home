package com.example.windows.home.RecyclerPalavras;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.windows.home.ClassPalavra.Palavra;
import com.example.windows.home.R;
import com.example.windows.home.Teste.Word;

import java.util.List;

public class AdapterPalavras extends RecyclerView.Adapter {

    private Context context;
    private List<Word> lista;
    private View view;

    public AdapterPalavras(List<Word>lista, Context context) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(context).inflate(R.layout.text,parent,false
        );

        ViewHolder viewholder = new ViewHolder (view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        final ViewHolder variavel = (ViewHolder) holder;
        variavel.texto.setText(lista.get(position).getOri());
        variavel.texto2.setText(lista.get(position).getTradu());
        //variavel.texto2.setText(lista.get(position));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
