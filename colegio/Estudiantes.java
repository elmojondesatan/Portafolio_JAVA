package colegio;

public class Estudiantes {
    String Nombre;
    String Correo;
    String Grado;
    String Edad;
    String Solvencia;

    //Metodo Constructor
    public Estudiantes(String Nombre, String Correo,String Grado,String Edad,String Solvencia){
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Grado = Grado;
        this.Edad = Edad;
        this.Solvencia = Solvencia;



    }

    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getGrado() {
        return Grado;
    }
    public String getEdad() {
        return Edad;
    }
    public String getSolvencia() {
        return Solvencia;
    }



    public void setNombre(String nombre){
        this.Nombre = Nombre;
    }

    public void setCorreo(String correo){
        this.Correo= Correo;
    }

    public void setGrado(String grado){
        this.Grado = Grado;
    }
    public void setEdad(String edad){
        this.Edad = Edad;
    }
    public void setSolvencia(String solvencia){
        this.Solvencia = Solvencia;
    }


    @Override
    public String toString(){
        return "Nombre: " + Nombre + " Correo: " + Correo + ",Grado : " + Grado + "Edad :" + Edad + "Solvenica :" + Solvencia;
    }

    }



