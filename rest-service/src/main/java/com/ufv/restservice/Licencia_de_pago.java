package com.ufv.restservice;

public class Licencia_de_pago extends Licencia{
    public String tipo;

    public Licencia_de_pago() {
    }

    public Licencia_de_pago(String nombre_software, String version,String tipo) {

        this.tipo = tipo;
        set_nombre(nombre_software);
        set_version(version);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Licencia_de_pago{" +
                "nombre_software='" + nombre_software + '\'' +
                ", version='" + version + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
