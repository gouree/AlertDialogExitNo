package com.example.gouree.alertdialogexitno;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //method to implement the dialog
    public void login_method(View view)
    {


        DisplayDialog dialog = new DisplayDialog();
        dialog.show(getFragmentManager(),"my_dialog");



    }

}
