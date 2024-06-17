package libros;

public class Biblioteca {


    public static void programa() {
        System.out.println("Biblioteca");


        Libro libro1 = new Libro("Principito", "PEPE","1996");
        Libro libro2 = new Libro("El gran Gatsby", "F. Scott Fitzgerald","1949");
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez","1967");
        Libro libro4 = new Libro("Matar a un ruiseñor", "Harper Lee","1960");
        Libro libro5 = new Libro("Crimen y castigo", "Fiódor Dostoyevski","1866");
        Libro libro6 = new Libro("Orgullo y prejuicio", "Jane Austen","1813");
        Libro libro7 = new Libro("En busca del tiempo perdido", " Marcel Proust","1913");
        Libro libro8 = new Libro("Ulises", "James Joyce","1922");
        Libro libro9 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes","1615");
        Libro libro10 = new Libro("La metamorfosis", "Franz Kafka","1915");







        //Titulo
        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());
        System.out.println(libro3.getTitulo());
        System.out.println(libro4.getTitulo());
        System.out.println(libro5.getTitulo());
        System.out.println(libro6.getTitulo());
        System.out.println(libro7.getTitulo());
        System.out.println(libro8.getTitulo());
        System.out.println(libro9.getTitulo());
        System.out.println(libro10.getTitulo());

        //Autor
        libro1.setAutor("Diego");
        System.out.println(libro1.getAutor());
        System.out.println(libro2.getAutor());
        System.out.println(libro3.getAutor());
        System.out.println(libro4.getAutor());
        System.out.println(libro5.getAutor());
        System.out.println(libro6.getAutor());
        System.out.println(libro7.getAutor());
        System.out.println(libro8.getAutor());
        System.out.println(libro9.getAutor());
        System.out.println(libro10.getAutor());

        //Fecha
        System.out.println(libro1.getFecha());
        System.out.println(libro2.getFecha());
        System.out.println(libro3.getFecha());
        System.out.println(libro4.getFecha());
        System.out.println(libro5.getFecha());
        System.out.println(libro6.getFecha());
        System.out.println(libro7.getFecha());
        System.out.println(libro8.getFecha());
        System.out.println(libro9.getFecha());
        System.out.println(libro10.getFecha());

        System.out.println(libro1.toString());

    }
}
