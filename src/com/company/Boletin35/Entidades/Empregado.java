package com.company.Boletin35.Entidades;

public class Empregado {
    float soldoBasico, porcentaxeAdicional;
    int tempoTraballado;

    public Empregado(float soldoBasico, float porcentaxeAdicional, int tempoTraballado) {
        this.soldoBasico = soldoBasico;
        this.porcentaxeAdicional = porcentaxeAdicional;
        this.tempoTraballado = tempoTraballado;
    }

    public Empregado() {
    }

    public float getSoldoBasico() {
        return soldoBasico;
    }

    public void setSoldoBasico(float soldoBasico) {
        this.soldoBasico = soldoBasico;
    }

    public float getPorcentaxeAdicional() {
        return porcentaxeAdicional;
    }

    public void setPorcentaxeAdicional(float porcentaxeAdicional) {
        this.porcentaxeAdicional = porcentaxeAdicional;
    }

    public int getTempoTraballado() {
        return tempoTraballado;
    }

    public void setTempoTraballado(int tempoTraballado) {
        this.tempoTraballado = tempoTraballado;
    }




}