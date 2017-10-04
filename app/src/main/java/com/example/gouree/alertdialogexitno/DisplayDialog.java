package com.example.gouree.alertdialogexitno;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by omsai on 04/10/2017.
 */

public class DisplayDialog extends DialogFragment
{

    LayoutInflater inflater;
    View view;

    TextView txt;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        //inflate the layout for dialog
        inflater = getActivity().getLayoutInflater();
        view =inflater.inflate(R.layout.display_screen,null);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());


        //setting positive and negative buttons
        builder.setView(view).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {

                Toast.makeText(getActivity(), "Deleted Succesfully", Toast.LENGTH_SHORT).show();




            }
        }) .setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        return builder.create();

    }

}
