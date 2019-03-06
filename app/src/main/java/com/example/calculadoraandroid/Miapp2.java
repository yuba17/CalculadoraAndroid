package com.example.calculadoraandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Miapp2 extends AppCompatActivity {


    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miapp2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        et1 = (EditText)findViewById(R.id.txt_economia);
        et2 = (EditText)findViewById(R.id.txt_fis);
        et3 = (EditText)findViewById(R.id.txt_si);
        et4 = (EditText)findViewById(R.id.txt_pca);
        et5 = (EditText)findViewById(R.id.txt_estadistica);
        tv1 = (TextView)findViewById(R.id.tv_estatus);

    }

    public void status(View view){
        String economia = et1.getText().toString();
        String fis = et2.getText().toString();
        String si = et3.getText().toString();
        String pca = et4.getText().toString();
        String estadistica = et5.getText().toString();

        int economia_int = Integer.parseInt(economia);
        int fis_int = Integer.parseInt(fis);
        int si_int = Integer.parseInt(si);
        int pca_int = Integer.parseInt(pca);
        int estadistica_int = Integer.parseInt(estadistica);

        int media = (economia_int+fis_int+si_int+pca_int+estadistica_int)/;

        if (media >= 5){
            tv1.setText("Su media es de: "+media);
        } else if (media < 5){
            tv1.setText("Su media es de: "+media);
        }

    }

}
