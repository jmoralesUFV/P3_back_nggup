package com.ufv.restservice;

public class Equipo {
    public int id_del_equipo;
    public String tipo_de_equipo;
    public String marca_del_equipo;
    public String uso_del_equipo;
    public SO sistema_operativo=new SO();
    public Hardware hardware=new Hardware();
    public Software lista_software=new Software();

    public Equipo() {
    }

    public Equipo(int id_del_equipo, String tipo_de_equipo, String marca_del_equipo, String uso_del_equipo, SO sistema_operativo, Hardware hardware, Software lista_software) {
        this.id_del_equipo = id_del_equipo;
        this.tipo_de_equipo = tipo_de_equipo;
        this.marca_del_equipo = marca_del_equipo;
        this.uso_del_equipo = uso_del_equipo;
        this.sistema_operativo = sistema_operativo;
        this.hardware = hardware;
        this.lista_software = lista_software;
    }

    public int getId_del_equipo() {
        return id_del_equipo;
    }

    public void setId_del_equipo(int id_del_equipo) {
        this.id_del_equipo = id_del_equipo;
    }

    public String getTipo_de_equipo() {
        return tipo_de_equipo;
    }

    public void setTipo_de_equipo(String tipo_de_equipo) {
        this.tipo_de_equipo = tipo_de_equipo;
    }

    public String getMarca_del_equipo() {
        return marca_del_equipo;
    }

    public void setMarca_del_equipo(String marca_del_equipo) {
        this.marca_del_equipo = marca_del_equipo;
    }

    public String getUso_del_equipo() {
        return uso_del_equipo;
    }

    public void setUso_del_equipo(String uso_del_equipo) {
        this.uso_del_equipo = uso_del_equipo;
    }

    public SO getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(SO sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    public Software getLista_software() {
        return lista_software;
    }

    public void setLista_software(Software lista_software) {
        this.lista_software = lista_software;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id_del_equipo=" + id_del_equipo +
                ", tipo_de_equipo='" + tipo_de_equipo + '\'' +
                ", marca_del_equipo='" + marca_del_equipo + '\'' +
                ", uso_del_equipo='" + uso_del_equipo + '\'' +
                ", sistema_operativo=" + sistema_operativo +
                ", hardware=" + hardware +
                ", lista_software=" + lista_software +
                '}';
    }
}

