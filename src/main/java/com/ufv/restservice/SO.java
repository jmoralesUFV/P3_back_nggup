package com.ufv.restservice;

public class SO {
    public String nombre;
    public String version;

    public SO(String nombre, String version) {
        this.nombre = nombre;
        this.version = version;
    }

    public SO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "SO{" +
                "nombre='" + nombre + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
