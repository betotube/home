package com.example.windows.home.DialogCard;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.widget.Button;

import com.example.windows.home.R;

/**
 * Created by windows on 22/03/2018.
 */

public class HomeDialogAlert extends DialogFragment {


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Dialog onCreateDialog(Bundle savedInstanceState){
       AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

       builder.setView(R.layout.dialog_lay);
       return builder.create();
    }

}
