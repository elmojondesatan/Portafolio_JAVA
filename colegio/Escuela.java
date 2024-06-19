package colegio;

public class Escuela {
    public static void programa() {
        System.out.println("Primaria:");

        //Estudiantes
        Estudiantes estudiante1 = new Estudiantes("Diego", "davillatoro@scl.edu.gt", "1ero Primaria", "7","T");
        Estudiantes estudiante2 = new Estudiantes("Samuel", "samuel0230@scl.edu.gt", "1ero Primaria", "8","F");
        Estudiantes estudiante3 = new Estudiantes("Pablo", "pabloGh24@scl.edu.gt", "1ero Primaria", "6","T");
        Estudiantes estudiante4 = new Estudiantes("Camila", "cami2016@scl.edu.gt", "1ero Primaria", "8","T");
        Estudiantes estudiante5 = new Estudiantes("Jose", "joseee9@scl.edu.gt", "1ero Primaria", "7","F");

        //Nombre y correo
        System.out.println(estudiante1.getNombre() +"           "+ estudiante1.getCorreo());
        System.out.println(estudiante2.getNombre() +"           "+ estudiante2.getCorreo());
        System.out.println(estudiante3.getNombre() +"           "+ estudiante3.getCorreo());
        System.out.println(estudiante4.getNombre() +"           "+ estudiante4.getCorreo());
        System.out.println(estudiante5.getNombre() +"           "+ estudiante5.getCorreo());

        //Cursos
        Cursos c1 = new Cursos("Matematicas", "Ciencias" , "1" );
        Cursos c2 = new Cursos("Expresion Artistica", "Artes Visuales" , "1" );
        Cursos c3 = new Cursos("Ciencias Sociales", "Ciencia Politica" , "2" );
        Cursos c4 = new Cursos("Ciencias Naturales", "Fisica" , "3" );
        Cursos c5 = new Cursos("Comunicacion y Lenguaje", "Literatura" , "2" );

        System.out.println("\n----------------------------------------------------------------------------\n");
        System.out.println("Cursos:");
        System.out.println(c1.getNombre());
        System.out.println(c2.getNombre());
        System.out.println(c3.getNombre());
        System.out.println(c4.getNombre());
        System.out.println(c5.getNombre());



    }

}


