package com.company.Boletin32;

public class Boletin32 {


    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList <Barco> lista=new ArrayList<>();

        Veleros obx1 = new Veleros(1,1,1,1);
        Deportivas obx2 = new Deportivas(2,2,2,2);
        Yates obx3 = new Yates(3,3,3,3);

        metodos.engadir(lista, obx1);
        metodos.engadir(lista, obx2);
        metodos.engadir(lista, obx3);
        metodos.amosar(lista);


        for (Barco Obxeto:lista){
            System.out.println(Obxeto.getClass()+ "\n"+ Obxeto.calcularPrecio());

        }

    }

}