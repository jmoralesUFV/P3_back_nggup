package com.ufv.restservice;

public class Hardware {
    public String procesador;
    public double Cantidad_memoria_GB;
    public double velocidad_memoria_GBs;
    public Disco_Duro HDD=new Disco_Duro();
    public Pantalla pantalla=new Pantalla();

    public Hardware() {
    }

    public Hardware(String procesador, double cantidad_memoria_GB, double velocidad_memoria_GBs, Disco_Duro HDD, Pantalla pantalla) {
        this.procesador = procesador;
        Cantidad_memoria_GB = cantidad_memoria_GB;
        this.velocidad_memoria_GBs = velocidad_memoria_GBs;
        this.HDD = HDD;
        this.pantalla = pantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public double getCantidad_memoria_GB() {
        return Cantidad_memoria_GB;
    }

    public void setCantidad_memoria_GB(float cantidad_memoria_GB) {
        Cantidad_memoria_GB = cantidad_memoria_GB;
    }

    public double getVelocidad_memoria_GBs() {
        return velocidad_memoria_GBs;
    }

    public void setVelocidad_memoria_GBs(float velocidad_memoria_GBs) {
        this.velocidad_memoria_GBs = velocidad_memoria_GBs;
    }

    public Disco_Duro getHDD() {
        return HDD;
    }

    public void setHDD(Disco_Duro HDD) {
        this.HDD = HDD;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "procesador='" + procesador + '\'' +
                ", Cantidad_memoria_GB=" + Cantidad_memoria_GB +
                ", velocidad_memoria_GBs=" + velocidad_memoria_GBs +
                ", HDD=" + HDD +
                ", pantalla=" + pantalla +
                '}';
    }
}
