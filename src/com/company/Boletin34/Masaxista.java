package com.company.Boletin34;

public class Masaxista extends SeleccionFutbol{
    String titulacion;
    int aniosExperiencia;

    public Masaxista(String titulacion, int aniosExperiencia, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }





    public void darMasaxe(){



    }

    @Override
    public String toString() {
        return super.toString() + " titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia;
    }







}