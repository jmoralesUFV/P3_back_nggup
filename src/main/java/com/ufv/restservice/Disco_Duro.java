package com.ufv.restservice;

public class Disco_Duro {
    public String tipo;
    public String capacidad;

    public Disco_Duro() {
    }

    public Disco_Duro(String tipo, String capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Disco_Duro{" +
                "tipo='" + tipo + '\'' +
                ", capacidad='" + capacidad + '\'' +
                '}';
    }
}
