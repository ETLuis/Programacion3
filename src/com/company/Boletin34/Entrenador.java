package com.company.Boletin34;

public class Entrenador extends SeleccionFutbol{

    int idFederacion;

    public Entrenador(int idFederacion, int id, int edad, String nombre, String apellidos) {
        super(id, edad, nombre, apellidos);
        this.idFederacion = idFederacion;
    }




    public void panificarEntrenamiento(){

    }

    @Override
    public String toString() {
        return super.toString() + " idFederacion=" + idFederacion;
    }






}
