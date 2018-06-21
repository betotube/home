package com.example.windows.home.DialogCard;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.windows.home.ClassCard.ListaDeCards;
import com.example.windows.home.MainActivity;
import com.example.windows.home.R;
import com.example.windows.home.Teste.CardsList;
import com.example.windows.home.Teste.Cartao;

import java.util.ArrayList;
import java.util.List;


public class CardDialog extends Dialog
        implements View.OnClickListener {

    private Button confirmar;
    private Button cancelar;
    private EditText edt;
    //private ListaDeCards lista;
    private CardsList cardsList;
    private List<Cartao> cartoes;

    public CardDialog(@NonNull Context context, List<Cartao> cartoes) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_lay);

        confirmar = (Button) findViewById(R.id.confirmar);
        confirmar.setOnClickListener(this);
        cancelar = (Button) findViewById(R.id.cancelar);
        cancelar.setOnClickListener(this);
        edt = (EditText) findViewById(R.id.edtNomCard);
        //this.lista = lista;
        this.cartoes = cartoes;
    }

    @Override
    public void onClick(View view) {
        if(view == cancelar){
            dismiss();
        }else{
            //lista.addCard(edt.getText().toString());
            cartoes.add(new Cartao(edt.getText().toString()));
            Log.d("CardDialog Nome:", cartoes.get(0).getNome());
            dismiss();
        }
    }


}
