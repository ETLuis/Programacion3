package com.company.Boletin32;

public class Veleros extends Barco{

    int mastiles;

    public Veleros() {
    }

    public Veleros(int mastiles) {
        this.mastiles = mastiles;
    }

    public Veleros(int mastiles, int potencia, int camarotes, int eslora) {
        super(mastiles, potencia, camarotes, eslora);
        this.mastiles = mastiles;
    }



    public int calcularPrecio(int dias){

        return ((10*eslora)*(2*potencia)*dias);

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int calcularPrecio() {
        return 0;
    }




}