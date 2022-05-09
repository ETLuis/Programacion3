package com.company.Boletin35.Datos;

import javax.swing.JOptionPane;


public class ListaEmpleados {


    int numeroDNI, dataIngreso;
    String nome, apelidos;


    public void datos(){
        Integer.parseInt(JOptionPane.showInputDialog(this, numeroDNI));
        Integer.parseInt(JOptionPane.showInputDialog(this, dataIngreso));
        JOptionPane.showInputDialog(this, nome);
        JOptionPane.showInputDialog(this, apelidos);
    }


}
