package com.company.Boletin32;

public class Yates extends Barco{

    int camarotes;

    public Yates() {
    }

    public Yates(int camarotes) {
        this.camarotes = camarotes;
    }

    public Yates(int camarotes, int mastiles, int potencia, int eslora) {
        super(mastiles, potencia, camarotes, eslora);
        this.camarotes = camarotes;
    }

    public int calcularPrecio(int dias){

        return ((2*potencia)+(25*camarotes)*dias);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int calcularPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }





}
