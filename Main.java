import IMC.ProgramasIMC;
import Lista.ListaDeCompras;
import MisMetodos.MisMetodos;
import interfazgrafica.Baner;
import calculadora.Mate;
import conversor.grados;
import conversor.Funciones;
import MisMetodos.ListaOpciones;
import conversor.Conversor;
import libros.Biblioteca;
import colegio.Escuela;

import javax.swing.*;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

//Importar de nombreLibreria.nombrePaquete.nombreClase
import java.util.Scanner;

public class Main {
    //Metodo Main
    public static void main(String[] args) {

        //Lista de opciones
        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit / Celsius", "Calcular edad",
                "Grados", "Lista de Compras",
                "Conversor de Monedas", "Biblioteca",
                "Escuela", "Salir"};

        JFrame miventana = new JFrame();
        miventana.setBounds(0, 0, 500, 600);
        miventana.setLayout(null);

        miventana.setTitle("Mi Aplicación");
        miventana.setLocationRelativeTo(null);

        JPanel banner = new JPanel();

        miventana.add(banner);
        banner.setBackground(Color.BLUE);
        banner.setBounds(0, 0, 500, 300);


        miventana.add(banner);


        JLabel label = new JLabel("Rockema");
        label.setForeground(Color.WHITE);
        label.setBounds(0, 0, 0, 0);


        JLabel option1 = new JLabel("[1]-------------");
        option1.setForeground(Color.WHITE);
        option1.setBounds(50, 50, 150, 30);

        JLabel option2 = new JLabel("[2]---------------");
        option2.setForeground(Color.WHITE);
        option2.setBounds(300, 50, 150, 30);

        JLabel option3 = new JLabel("[3]-------------");
        option3.setForeground(Color.WHITE);
        option3.setBounds(50, 150, 150, 30);

        JLabel option4 = new JLabel("[4]---------------");
        option4.setForeground(Color.WHITE);
        option4.setBounds(300, 150, 150, 30);

        JLabel option5 = new JLabel("[5]-------------");
        option5.setForeground(Color.WHITE);
        option5.setBounds(50, 250, 150, 30);

        JLabel option6 = new JLabel("[6]-------------");
        option6.setForeground(Color.WHITE);
        option6.setBounds(300, 250, 150, 30);


        JButton boton = new JButton("Click Me");
        boton.setBounds(200,500,100,30);


        miventana.add(option1);
        miventana.add(option2);
        miventana.add(option3);
        miventana.add(option4);
        miventana.add(option5);
        miventana.add(option6);
        miventana.add(boton);




        banner.add(label);
        miventana.add(banner);
        miventana.setVisible(true);



        boolean programa = true;

        do {
            //nombreClase.nombreMetodo
            MisMetodos.LimpiarConsola();
            Baner.mensaje();
            MisMetodos.imprimirLinea();
            ListaOpciones.cargarOpciones(listaDeOpciones);



            Scanner intOpciones = new Scanner(System.in);
            System.out.print("[?]: ");
            int opcion = intOpciones.nextInt();
            MisMetodos.imprimirLinea();


            ProgramasIMC.pIMC(180,40);


//Cargar Opcion del Usuario
            switch (opcion){
                case 1:
                    Mate.programa();
                    break;
                case 2:
                    ProgramasIMC.programaIMC();
                    break;
                case 3:
                    grados.programa_grados();
                    break;
                case 4:
                    Funciones.programa_unidades();
                    break;
                case 5:
                    grados.programa_grados();
                    break;
                case 6:
                    ListaDeCompras.programa();
                    break;
                case 7:
                    Conversor.programaMonedas();
                    break;
                case 8:
                    Biblioteca.programa();
                    break;
                case 9:
                    Escuela.programa();
                    break;
                case 10:
                    System.out.println("FINAL DEL PROGRAMA");
                    programa=false;
                    break;
            }

        }while (programa);

        MisMetodos.imprimirLinea();


    }

}