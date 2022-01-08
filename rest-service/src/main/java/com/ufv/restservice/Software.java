package com.ufv.restservice;

import java.util.ArrayList;

public class Software {

    public Licencia_libre Libre;
    public Licencia_de_pago Pago;

    public Software(){

    }

    public Software(Licencia_libre libre, Licencia_de_pago pago) {
        Libre = libre;
        Pago = pago;
    }

    @Override
    public String toString() {
        return "Software{" +
                "Libre=" + Libre +
                ", Pago=" + Pago +
                '}';
    }
}
