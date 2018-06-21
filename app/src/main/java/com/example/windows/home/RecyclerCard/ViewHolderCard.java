package com.example.windows.home.RecyclerCard;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.windows.home.R;
import com.example.windows.home.RecyclerPalavras.PalavrasActivity;

import static android.content.ContentValues.TAG;

class ViewHolderCard extends RecyclerView.ViewHolder{

    final TextView texto;
    final ImageView imageView;
    CardView parentLayout;

    public ViewHolderCard(View itemView) {
        super(itemView);
        texto = (TextView) itemView.findViewById(R.id.txt);
        imageView = (ImageView) itemView.findViewById(R.id.img1);
        parentLayout = itemView.findViewById(R.id.cv);

    }

}
