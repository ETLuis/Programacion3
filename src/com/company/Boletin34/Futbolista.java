package com.company.Boletin34;

public class Futbolista extends SeleccionFutbol{
    int dorsal;
    String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }




    public void entrevista(){

    }

    @Override
    public String toString() {
        return super.toString() + " dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }







}
