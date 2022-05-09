package com.company.Boletin35.Entidades;

public class EContratado extends Empregado{


    public EContratado() {
    }

    public EContratado(float porcentaxeAdicional, int tempoTraballado, float soldoBasico) {
        super(soldoBasico, porcentaxeAdicional, tempoTraballado);
        this.soldoBasico = soldoBasico;
        this.porcentaxeAdicional = porcentaxeAdicional;
        this.tempoTraballado = tempoTraballado;
    }

    public void setSoldoBasico(float soldoBasico) {
        this.soldoBasico = soldoBasico;
    }

    public void setPorcentaxeAdicional(float porcentaxeAdicional) {
        this.porcentaxeAdicional = porcentaxeAdicional;
    }


    public void setTempoTraballado(int tempoTraballado) {
        this.tempoTraballado = tempoTraballado;
    }


    public void porcentaxeAdicional(){

        if(tempoTraballado<3){
            System.out.println("+ 5 porcento"+ soldoBasico*5/100);

        }
        if(tempoTraballado<7 && tempoTraballado>4){
            System.out.println("+ 10 porcento"+ soldoBasico*10/100);
        }

        if(tempoTraballado>8 && tempoTraballado<15){
            System.out.println("+ 5 porcento"+ soldoBasico*15/100);
        }
        if(tempoTraballado>15){
            System.out.println("+ 5 porcento"+ soldoBasico*20/100);

        }
    }



}