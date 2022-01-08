package com.ufv.restservice;

public class Prestamos {

    private int id;
    private int userID;
    private int equipoID;
    private String finiPrestamo;
    private String ffinPrestamo;
    private String frealPrestanmo;
    private String comentarios;

    public Prestamos() {
    }

    public Prestamos(int id, int userID, int equipoID, String finiPrestamo, String ffinPrestamo, String frealPrestanmo, String comentarios) {
        this.id = id;
        this.userID = userID;
        this.equipoID = equipoID;
        this.finiPrestamo = finiPrestamo;
        this.ffinPrestamo = ffinPrestamo;
        this.frealPrestanmo = frealPrestanmo;
        this.comentarios = comentarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getEquipoID() {
        return equipoID;
    }

    public void setEquipoID(int equipoID) {
        this.equipoID = equipoID;
    }

    public String getFiniPrestamo() {
        return finiPrestamo;
    }

    public void setFiniPrestamo(String finiPrestamo) {
        this.finiPrestamo = finiPrestamo;
    }

    public String getFfinPrestamo() {
        return ffinPrestamo;
    }

    public void setFfinPrestamo(String ffinPrestamo) {
        this.ffinPrestamo = ffinPrestamo;
    }

    public String getFrealPrestanmo() {
        return frealPrestanmo;
    }

    public void setFrealPrestanmo(String frealPrestanmo) {
        this.frealPrestanmo = frealPrestanmo;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Prestamos{" +
                "id=" + id +
                ", userID=" + userID +
                ", equipoID=" + equipoID +
                ", finiPrestamo='" + finiPrestamo + '\'' +
                ", ffinPrestamo='" + ffinPrestamo + '\'' +
                ", frealPrestanmo='" + frealPrestanmo + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
