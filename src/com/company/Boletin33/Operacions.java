package com.company.Boletin33;

import java.util.ArrayList;
import java.util.Collections;



public class Operacions <T extends Comparable>{



    public static <T extends Comparable> void metodoMax(ArrayList<T>listado){


        T maxNum = (T) Collections.max(listado);
        for (int i = 1; i<listado.size();i++){
            if(maxNum.compareTo( listado.get(i))<0)
                maxNum = listado.get(i);

        }


        System.out.println("O NUMERO MAIOR É O: "+maxNum);

    }




    public static <T extends Comparable> void metodoMin(ArrayList<T>listado){


        T minNum = (T) Collections.min(listado);
        for (int i = 1; i<listado.size();i++){
            if(minNum.compareTo( listado.get(i))>0)
                minNum = listado.get(i);

        }


        System.out.println("O NUMERO MENOR É O: "+minNum);


    }
    public static <T extends Comparable> void metodoObxecto(ArrayList<T>listado2){
        Object a = null;
        listado2.add((T) a);

        boolean existe=false;

        if(listado2.contains(a)){
            existe=true;
        }

        if(existe==true){
            for (int i = 1; i<listado2.size();i++){
                if(listado2.contains(a))
                    a = listado2.get(i);


            }
            System.out.println("A posición do obxeto é: "+a);

        }else{
            System.out.println("-1 / NON EXISTE O OBXECTO");
        }
    }

    public static <T extends Comparable> void metodoObxecto2(ArrayList<T>listado2){
        Object a = null;
        listado2.add((T) a);

        boolean existe = listado2.contains(a);

        if(existe){

            for (int i = 1; i<listado2.size();i++){

                if(listado2.contains(a)){
                    listado2.remove(a);
                }

            }


        }else{
            System.out.println("-1 / NON EXISTE O OBXECTO");
        }


    }


}

