package com.company.Boletin32;

public abstract class Barco {

    int mastiles, potencia, camarotes,eslora;

    public Barco() {
    }

    public Barco(int mastiles, int potencia, int camarotes, int eslora) {
        this.mastiles = mastiles;
        this.potencia = potencia;
        this.camarotes = camarotes;
        this.eslora = eslora;
    }


    public abstract int calcularPrecio();

    @Override
    public String toString() {
        return "mastiles=" + mastiles + ", potencia=" + potencia + ", camarotes=" + camarotes;
    }

}