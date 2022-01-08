package com.ufv.restservice;

public class Pantalla {
    public double diagonal;
    public double resolucion;

    public Pantalla(double diagonal, double resolucion) {
        this.diagonal = diagonal;
        this.resolucion = resolucion;
    }

    public Pantalla() {
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "diagonal=" + diagonal +
                ", resolucion=" + resolucion +
                '}';
    }
}
