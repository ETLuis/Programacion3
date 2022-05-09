package com.company.Boletin33;


import java.util.ArrayList;


public class Boletin33 {


    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Integer> listaInt = new ArrayList<>();
        listaInt.add(2);
        listaInt.add(12);
        listaInt.add(20);
        listaInt.add(3);
        listaInt.add(4);
        listaInt.add(15);


        Operacions.metodoMax(listaInt);
        Operacions.metodoMin(listaInt);

        ArrayList<Object> listaObx = new ArrayList<>();
        Object a = null;
        int b=1;
        listaObx.add(a);
        listaObx.add(b);

        Operacions.metodoObxecto(listaInt);

    }
}
