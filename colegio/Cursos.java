package colegio;

import sun.management.counter.perf.PerfInstrumentation;

public class Cursos {
    private String Nombre;
    private String Categoria;
    private String Periodo;

    //Metodo Constructor
    public Cursos(String Nombre, String Categoria,String Periodo){
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Periodo = Periodo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setNombre(String nombre){
        this.Nombre = Nombre;
    }

    public void setCategoria(String categoria){
        this.Categoria= Categoria;
    }

    public void setPeriodo(String periodo){
        this.Periodo = Periodo;
    }


    @Override
    public String toString(){
        return "Nombre :" + Nombre + ", Categoria :" + Categoria + ",Periodo: " + Periodo;
    }

}

