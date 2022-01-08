package com.ufv.restservice;

public class Licencia_libre extends Licencia{

    public Licencia_libre(){

    }
    public Licencia_libre(String nombre,String version){
        set_nombre(nombre);
        set_version(version);
    }

    @Override
    public String toString() {
        return "Licencia_libre{" +
                "nombre_software='" + nombre_software + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
