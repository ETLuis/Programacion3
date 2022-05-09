package com.company.Boletin27;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Panel implements ActionListener{

    private JFrame marco;
    private JPanel panel,panel2;
    private JButton boton1,boton2, boton3, boton4, boton5, boton;
    private JTextField liñaTexto,liñaTexto2,liñaTexto3, linaTexto,linaTexto2;
    private JLabel etiqueta, etiqueta2;



    public void pecharVentana(){

        marco.setLocationRelativeTo(marco);// pon no medio
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// bbPecha a aplicacion co X
        marco.setVisible(true);

    }


    public void crearVentana(){
        //Instanciamos a ventana
        marco = new JFrame("**PRIMEIRA VENTA**");
        //Dámoslle caracteristicas
        marco.setBounds(100, 50, 600, 400);
        marco.setLocationRelativeTo(marco); //Aparece la ventana en medio de la pantalla
        marco.setSize(600,500);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Pecha a aplicación cando lle damos a equis
        marco.setVisible(true); // facemos visible o marco

    }
    public void crearCompoñentes(){
        //instanciamos obxetos do panel 1
        marco = new JFrame();
        panel = new JPanel();
        etiqueta = new JLabel("NOME");
        etiqueta2 = new JLabel("PASSWORD");
        liñaTexto = new JTextField();
        liñaTexto2 = new JTextField();
        liñaTexto3 = new JTextField();
        boton1 = new JButton("Premer");
        boton2 = new JButton();

        //instanciamos obxetos do panel 2
        panel2 = new JPanel();
        boton = new JButton("Premer");
        linaTexto = new JTextField();
        linaTexto2 = new JTextField();

        //dámoslle características ao panel 1
        panel.setLayout(null);
        marco.setBackground(new Color(255,255,0,255));
        panel.setBackground(new Color(255,255,0,0));
        panel.setSize(600,500);
        liñaTexto.setSize(500, 100);
        boton1.setSize(75,50);
        boton1.setToolTipText("Premer");
        boton2.setText("Limpar");
        boton2.setToolTipText("Limpar");
        boton2.setSize(75,50);
        etiqueta.setBounds(150, 50, 200, 100);
        etiqueta2.setBounds(150, 110, 200, 100);
        liñaTexto.setBounds(300, 70, 200, 50);
        liñaTexto2.setBounds(300, 135, 200, 50);
        liñaTexto3.setBounds(115, 250, 435, 100);

        boton1.setBounds(100, 400, 200, 100);
        boton2.setBounds(350, 400, 200, 100);





        // engadimos compoñentes ao panel1 e o panel1 ao marco
        panel.add(etiqueta);
        panel.add(etiqueta2);
        panel.add(liñaTexto);
        panel.add(liñaTexto2);
        panel.add(liñaTexto3);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);




        //dámoslle características ao panel 2
        panel2.setLayout(null);
        panel2.setBackground(new Color(255,255,0,0));
        panel2.setSize(600,500);
        liñaTexto.setSize(500, 100);
        boton.setSize(75,50);
        boton.setToolTipText("Premer");
        etiqueta.setBounds(150, 50, 200, 100);
        linaTexto.setBounds(300, 70, 200, 50);
        linaTexto2.setBounds(300, 135, 200, 50);

        boton.setBounds(100, 400, 200, 100);


        // engadimos compoñentes ao panel1 e o panel1 ao marco
        panel2.add(etiqueta);
        panel2.add(linaTexto);
        panel2.add(linaTexto2);
        panel2.add(boton);
        marco.add(panel2);


        this.pecharVentana();


        // xestion de eventos
        boton1.addActionListener((ActionListener) this);// this porque o ActionPerformed está na mesma clase
        boton2.addActionListener((ActionListener) this);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource(); //getSource porque é da mesma clase, senón fose da mesma clase (os botóns) sería Instance of entón non recolleríamos
        if(ob==boton1)
            liñaTexto3.setText("Hola, "+ liñaTexto.getText());
        else if(ob==boton2)
            liñaTexto3.setText("");

    }

}
