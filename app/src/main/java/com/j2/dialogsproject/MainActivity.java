package com.j2.dialogsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dialogs.confirmSuccessDialog(MainActivity.this);
        Dialogs.errorDialog(MainActivity.this);
        Dialogs.loadingDialog(MainActivity.this);
        Dialogs.successDialog(this);
        Dialogs.warningDialog(this);
    }
}