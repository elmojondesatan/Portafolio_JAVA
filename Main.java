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
import colegio.Cursos;
import colegio.Estudiantes;

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
                "Escuela", "Salir" };

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