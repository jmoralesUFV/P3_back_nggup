package com.ufv.restservice;

/*
    Clase que contiene todo lo relacionado con el tratamiento de la información de la clase usuario.

    6 parámetros de tipo y nombre:

        int id;
        String Nombre;
        String Departamento;
        String Tlf;
        String EmailContact;
        String Ubicacion;

    Se acompaña a los parámetros con su constructor vacío y parametrizado junto a sus getters y setters.
    Se incluye finalmente un método ToString para su impresión completa de los datos al estilo JSON.

*/

public class Usuario {

    // Declaración de los parámetros de la clase
    private int id;
    private String Nombre;
    private String Departamento;
    private String Tlf;
    private String EmailContact;
    private String Ubicacion;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor parametrizado
    public Usuario(int id, String nombre, String departamento, String tlf, String emailContact, String ubicacion) {
        this.id = id;
        this.Nombre = nombre;
        this.Departamento = departamento;
        this.Tlf = tlf;
        this.EmailContact = emailContact;
        this.Ubicacion = ubicacion;
    }

    // Getters y Setters de la clase
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getTlf() {
        return Tlf;
    }

    public void setTlf(String tlf) {
        Tlf = tlf;
    }

    public String getEmailContact() {
        return EmailContact;
    }

    public void setEmailContact(String emailContact) {
        EmailContact = emailContact;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    // Método Override

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Departamento='" + Departamento + '\'' +
                ", Tlf='" + Tlf + '\'' +
                ", EmailContact='" + EmailContact + '\'' +
                ", Ubicacion='" + Ubicacion + '\'' +
                '}';
    }
}
