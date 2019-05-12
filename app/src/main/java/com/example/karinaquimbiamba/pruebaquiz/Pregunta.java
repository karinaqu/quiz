package com.example.karinaquimbiamba.pruebaquiz;

public class Pregunta {

    /*public String mPreguntas[]={
            "Cuanto suma 2+2",
            "Cuanto resta 4-4"

    };*/

    public int mPreguntas[]={R.drawable.apple2,R.drawable.apple3};

    /*public int mRespuestas[][]={
            {R.drawable.apple2,R.drawable.apple3}};*/


    public String mRespuestas[][]={
            {"2","4","5"},
            {"5","2","4"},

    };

    public int mRespuestasImagenes[][]={
            {R.drawable.apple2,R.drawable.apple3, R.drawable.apple5},
            {R.drawable.apple5,R.drawable.apple2, R.drawable.apple3}};

    public String mRespuestasCorrecta[]={"2","4"};
    public int mRespuestaCorrectaImagen[]={R.drawable.apple2,R.drawable.apple3};


    public int getPreguntas(int a) {
        Integer preguntas=mPreguntas[a];
        return preguntas;
    }

    public String getRespuesta1(int a) {
        String opncion=mRespuestas[a][0];
        return opncion;
    }
    public int getRespuestaimagen1(int a) {
        Integer opncion=mRespuestasImagenes[a][0];
        return opncion;
    }

    public String getRespuesta2(int a) {
        String opcion=mRespuestas[a][1];
        return opcion;
    }
    public int getRespuestaimagen2(int a) {
        Integer opncion=mRespuestasImagenes[a][1];
        return opncion;
    }
    public String getRespuesta3(int a) {
        String opcion=mRespuestas[a][2];
        return opcion;
    }
    public int getRespuestaimagen3(int a) {
        Integer opncion=mRespuestasImagenes[a][2];
        return opncion;
    }

    public String getRespuestaCorrecta(int a) {
        String respuesta=mRespuestasCorrecta[a];
        return respuesta;
    }

    public int getRespuestaCorrectaImagen(int a) {
        Integer respuesta=mRespuestaCorrectaImagen[a];
        return respuesta;
    }

}
