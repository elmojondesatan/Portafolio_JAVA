package conversor;

import MisMetodos.ListaOpciones;

import java.util.Scanner;

public class Conversor {
    public static String[] opcioneMonedas = {"Q/D", "D/Q", "Q/Pesos", "Pesos/Q"};

    public static void programaMonedas() {
        ListaOpciones.cargarOpciones(opcioneMonedas);

        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int r = opcion.nextInt();

        Scanner numero = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double num1 = numero.nextDouble();

        switch (r) {
            case 1:
                System.out.println("Resultado Q/D: " + QaD(num1));
                break;

            case 2:
                System.out.println("Resultado D/Q: " + DaQ(num1));
                break;
            case 3:
                System.out.println("Resultado Q/Pesos: " + QaPesos(num1));
                break;
            case 4:
                System.out.println("Resultado Pesos/Q: " + PesosaQ(num1));
                break;
            case 5:
                System.out.println("Salir");
                break;
        }
    }


    public static double QaD(double num1) {
        double Quetzales = num1 / 7.80;
        return Quetzales;
    }

    public static double DaQ(double num1) {
        double Dolares = num1 * 7.80;
        return Dolares;
    }

    public static double QaPesos(double num1){
        double QPesos = num1 * 2.39;
        return QPesos;
    }

    public static double PesosaQ(double num1){
        double  Pesos = num1 / 2.39;
        return Pesos;

    }
}