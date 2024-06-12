package conversor;

import java.util.Scanner;

public class Funciones {
    public static void programa_unidades() {

        // Crea una lista de 4 opciones
        String[] ListaOpciones = {
                "Kilometros/m", " m/kilometros",
        };
        // Imrpime las opciones de la lista
        for (int i = 0; i < ListaOpciones.length; i++) {
            System.out.printf("[%d] %s", i + 1, ListaOpciones[i]);

            for (int j = 0; j < (12 - ListaOpciones[i].length()); j++) {
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0) {
                System.out.println("");
            }
        }
        Scanner funcionPrograma = new Scanner(System.in);
        System.out.print("[?]: ");
        int p_unidades = funcionPrograma.nextInt();

        Scanner numero = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double num1  = numero.nextDouble();


        switch (p_unidades){
            case 1:
                System.out.println("metros a kilometros son: "+ unidad(num1));
                System.out.println("-----------------------------------------");
                break;
            case 2:
                System.out.println("Kilometros a metros: " + kilometro(num1));
                System.out.println("------------------------------------------");
                break;
        }
    }
    public static double unidad (double num1){
        double unidad = num1 * 1000;
        return unidad;
    }
    public static double kilometro (double num1){
        double kilometros = num1 / 1000;
        return kilometros;
    }

 }

