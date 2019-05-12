package com.example.karinaquimbiamba.pruebaquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RadioButton respuesta1, respuesta2, respuesta3;
    Button brespuesta1, brespuesta2, brespuesta3;
    ImageView imgrespuesta1, imgrespuesta2, imgrespuesta3;
    TextView puntaje;
    ImageView pregunta;
    int contadorPuntaje=0;

    private Pregunta mPreguntas= new Pregunta();
    private String mRespuesta;

    private int mPreguntasLenght= mPreguntas.mPreguntas.length;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r=new Random();

        respuesta1= findViewById(R.id.rrespuesta1);
        respuesta2=  findViewById(R.id.rrespuesta2);
        respuesta3=  findViewById(R.id.rrespuesta3);

        brespuesta1= findViewById(R.id.respuesta1);
        brespuesta2=  findViewById(R.id.respuesta2);
        brespuesta3=  findViewById(R.id.respuesta3);

        imgrespuesta1= findViewById(R.id.imgRespuesta1);
        imgrespuesta2=  findViewById(R.id.imgRespuesta2);
        imgrespuesta3=  findViewById(R.id.imgRespuesta3);

        puntaje= findViewById(R.id.puntaje);
        pregunta= findViewById(R.id.pregunta);
        updateQuestion(r.nextInt(mPreguntasLenght));





        respuesta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (respuesta1.getText()==mRespuesta){
                    updateQuestion(r.nextInt(mPreguntasLenght));
                    contadorPuntaje++;
                    puntaje.setText(""+contadorPuntaje);
                    //Toast.makeText(MainActivity.this, "Completado", Toast.LENGTH_SHORT).show();
                }  else {
                    gameOver();
                     //Toast.makeText(MainActivity.this, "Te equivocaste", Toast.LENGTH_SHORT).show();
                }

            }
        });

        brespuesta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (brespuesta1.getText()==mRespuesta){
                    updateQuestion(r.nextInt(mPreguntasLenght));
                    contadorPuntaje++;
                    //Toast.makeText(MainActivity.this, "Completado", Toast.LENGTH_SHORT).show();

                    puntaje.setText(""+contadorPuntaje);

                }  else {
                    gameOver();
                    //Toast.makeText(MainActivity.this, "Te equivocaste", Toast.LENGTH_SHORT).show();
                }

            }
        });
        imgrespuesta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (brespuesta1.getText()==mRespuesta){
                    updateQuestion(r.nextInt(mPreguntasLenght));
                    contadorPuntaje++;
                    puntaje.setText(""+contadorPuntaje);

                    //Toast.makeText(MainActivity.this, "Completado", Toast.LENGTH_SHORT).show();
                }  else {
                    gameOver();
                    //Toast.makeText(MainActivity.this, "Te equivocaste", Toast.LENGTH_SHORT).show();
                }

            }
        });
        respuesta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if (respuesta2.getText()==mRespuesta){
                     updateQuestion(r.nextInt(mPreguntasLenght));
                     contadorPuntaje++;
                     puntaje.setText(""+contadorPuntaje);

                 }
                 else {
                     gameOver();

                 }

            }
        });

        imgrespuesta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (brespuesta2.getText()==mRespuesta){
                    updateQuestion(r.nextInt(mPreguntasLenght));
                    contadorPuntaje++;
                    puntaje.setText(""+contadorPuntaje);

                }
                else {
                    gameOver();

                }

            }
        });

        brespuesta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (brespuesta2.getText()==mRespuesta){
                    updateQuestion(r.nextInt(mPreguntasLenght));
                    contadorPuntaje++;
                    puntaje.setText(""+contadorPuntaje);
                }
                else {
                    gameOver();

                }

            }
        });

        respuesta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 if (respuesta3.getText()==mRespuesta){
                     updateQuestion(r.nextInt(mPreguntasLenght));
                     contadorPuntaje++;
                     puntaje.setText(""+contadorPuntaje);
                 }  else {
                     gameOver();
                 }

            }
        });

        brespuesta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (brespuesta3.getText()==mRespuesta){
                    updateQuestion(r.nextInt(mPreguntasLenght));
                    contadorPuntaje++;
                    puntaje.setText(""+contadorPuntaje);

                }  else {
                    gameOver();
                }

            }
        });
        imgrespuesta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (brespuesta3.getText()==mRespuesta){
                    updateQuestion(r.nextInt(mPreguntasLenght));
                    contadorPuntaje++;
                    puntaje.setText(""+contadorPuntaje);
                }  else {
                    gameOver();
                }

            }
        });


    }

    private void updateQuestion(int num){
        pregunta.setImageResource(mPreguntas.getPreguntas((num)));
            //pregunta.setText(mPreguntas.getPreguntas((num)));
            respuesta1.setText(mPreguntas.getRespuesta1(num));
            respuesta2.setText(mPreguntas.getRespuesta2(num));
            respuesta3.setText(mPreguntas.getRespuesta3(num));

            brespuesta1.setText(mPreguntas.getRespuesta1(num));
            brespuesta2.setText(mPreguntas.getRespuesta2(num));
            brespuesta3.setText(mPreguntas.getRespuesta3(num));


            imgrespuesta1.setImageResource(mPreguntas.getRespuestaimagen1(num));
            imgrespuesta2.setImageResource(mPreguntas.getRespuestaimagen2(num));
            imgrespuesta3.setImageResource(mPreguntas.getRespuestaimagen3(num));

            mRespuesta =mPreguntas.getRespuestaCorrecta(num);



    }
    private void gameOver(){

        AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage("Game Over").
                setCancelable(false).setPositiveButton("NEW GAME",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    }
                }).setNegativeButton("EXIT",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

        AlertDialog alertDialog  =     alertDialogBuilder.create();
        alertDialog.show();


    }

}
