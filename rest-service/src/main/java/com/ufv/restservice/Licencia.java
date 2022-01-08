package com.ufv.restservice;

import java.util.ArrayList;

public class Licencia  {
    public String nombre_software;
    public String version;

    public Licencia() {

    }


    public Licencia(String nombre_software, String version){
        this.nombre_software=nombre_software;
        this.version=version;
    }
    public void set_nombre(String nombre){
        nombre_software=nombre;
    }
    public void set_version(String version){
        this.version=version;
    }
    public String get_version(){
        return version;
    }
    public String get_nombre(){

        return nombre_software;
    }

    @Override
    public String toString() {
        return "Licencia{" +
                "nombre_software='" + nombre_software + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
