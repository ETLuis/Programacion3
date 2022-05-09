package com.company.Boletin34;


import java.util.ArrayList;


public class Boletin34 {


    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<SeleccionFutbol> lista= new ArrayList();

        lista.add(new Futbolista(1,"portero",973412,20,"Edeerson","Moraes"));
        lista.add(new Entrenador(123214,791,40,"Pepe","Botella"));
        lista.add(new Masaxista("Masaxista homologado",4,12307,34,"Ramón","Cabanillas"));



        for(SeleccionFutbol x:lista){
            System.out.println(x.toString());
        }







    }

}