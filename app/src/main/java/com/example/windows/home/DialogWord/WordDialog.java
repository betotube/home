package com.example.windows.home.DialogWord;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.windows.home.ClassCard.Card;
import com.example.windows.home.ClassPalavra.Palavra;
import com.example.windows.home.R;
import com.example.windows.home.Teste.Cartao;

import java.util.List;

/**
 * Created by windows on 23/03/2018.
 */

public class WordDialog extends Dialog
        implements View.OnClickListener {

    private Button confirmar;
    private Button cancelar;
    private EditText edtO;
    private EditText edtT;
    private Cartao card;

    public WordDialog(@NonNull Context context, Cartao card) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_lay2);

        edtO = findViewById(R.id.edtWord);
        edtT = findViewById(R.id.edtTrad);
        confirmar = findViewById(R.id.btnCon);
        confirmar.setOnClickListener(this);
        cancelar = findViewById(R.id.btnCanc);
        cancelar.setOnClickListener(this);

        this.card = card;
    }


    @Override
    public void onClick(View v) {
        if (v == cancelar){
            dismiss();
        }else{
            card.addWord(edtO.getText().toString(),
                            edtT.getText().toString());
            dismiss();
        }
    }
}
