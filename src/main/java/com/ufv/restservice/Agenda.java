package com.ufv.restservice;

import java.util.ArrayList;


/*
    Clase Agenda

    Clase que hace de gestor y control de las estructuras de datos que manejamos mediante clases.
    Instancia mediante arraylists las diferentes clases de manera que tenemos una lista de equipos, usuarios y préstamos.

    Contiene las funciones elementales del procesamiento de una API-Rest como introducir nuevos datos, consultarlos,
    modificarlos o eliminarlos.



*/


public class Agenda {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Equipo> equipos;
    private ArrayList<Prestamos> prestamos;
    public int contadorU=0;
    public int contagorE=0;
    public int contadorP=0;
    public Jsonreadernew Jsons=new Jsonreadernew();

    public Agenda()
    {
        this.usuarios = Jsons.leerUsuarios();
        contadorU=usuarios.size();
        this.equipos = Jsons.leerEquipos();
        contagorE=equipos.size();
        this.prestamos =Jsons.leePrestamos();
        contadorP=prestamos.size();

    }

    /*
        -------------------------------------------------
        CJTO DE FUNCIONES PARA EL TRATAMIENTO DE USUARIOS
        -------------------------------------------------
    */

    public Boolean addUser(Usuario U)
    {
         U.setId(contadorU);
         Boolean añadido=this.usuarios.add(U);
         Jsons.EscribirUsers(this.usuarios);
         contadorU++;
         return añadido;
    }

    public ArrayList<Usuario> getAllUsers()
    {
        return this.usuarios;
    }

    public Usuario getUserById(int id)
    {
        return this.usuarios.get(id);
    }

    public Usuario removeUserById(int id)
    {
        return this.usuarios.remove(id);
    }

    public Usuario updateUserById(int id, Usuario newContact) {

        this.usuarios.get(id).setNombre(newContact.getNombre());
        this.usuarios.get(id).setDepartamento(newContact.getDepartamento());
        this.usuarios.get(id).setTlf(newContact.getTlf());
        this.usuarios.get(id).setEmailContact(newContact.getEmailContact());
        this.usuarios.get(id).setUbicacion(newContact.getUbicacion());

        return newContact;
    }

    /*
        -------------------------------------------------
        CJTO DE FUNCIONES PARA EL TRATAMIENTO DE EQUIPOS
        -------------------------------------------------
    */

    public Boolean addEquipo(Equipo E)
    {
          E.setId_del_equipo(contagorE);
          Boolean añadido= this.equipos.add(E);
          Jsons.EscribirEquipos(this.equipos);
          contagorE++;
          return añadido;
    }

    public ArrayList<Equipo> getAllEquipos()
    {
        ArrayList<Equipo> equipo=this.equipos;

        Jsons.EscribirEquipos(equipo);
        return equipo;
    }

    public Equipo getEquipoById(int id)
    {
        return this.equipos.get(id);
    }

    public Equipo removeEquipoById(int id)
    {
        return this.equipos.remove(id);
    }

    public Equipo updateEquipoById(int id, Equipo newEquipo) {

        this.equipos.get(id).setId_del_equipo(newEquipo.getId_del_equipo());
        this.equipos.get(id).setTipo_de_equipo(newEquipo.getTipo_de_equipo());
        this.equipos.get(id).setMarca_del_equipo(newEquipo.getMarca_del_equipo());
        this.equipos.get(id).setUso_del_equipo(newEquipo.getUso_del_equipo());
        this.equipos.get(id).setSistema_operativo(newEquipo.getSistema_operativo());
        this.equipos.get(id).setHardware(newEquipo.getHardware());
        this.equipos.get(id).setLista_software(newEquipo.getLista_software());

        return newEquipo;
    }

    /*
        --------------------------------------------------
        CJTO DE FUNCIONES PARA EL TRATAMIENTO DE PRÉSTAMOS
        --------------------------------------------------
    */

    public Boolean addPrestamo(Prestamos P)
    {
        P.setId(contadorP);
        Boolean añadido= this.prestamos.add(P);
        Jsons.EscribirPrestamos(this.prestamos);
        contadorP++;
        return añadido;
    }

    public ArrayList<Prestamos> getAllPrestamos()
    {
        return this.prestamos;
    }

    public Prestamos getPrestamoById(int id)
    {
        return this.prestamos.get(id);
    }

    public Prestamos removePrestamoById(int id)
    {
        return this.prestamos.remove(id);
    }

    public Prestamos updatePrestamoById(int id, Prestamos newPrestamo) {

        this.prestamos.get(id).setId(newPrestamo.getId());
        this.prestamos.get(id).setUserID(newPrestamo.getUserID());
        this.prestamos.get(id).setEquipoID(newPrestamo.getEquipoID());
        this.prestamos.get(id).setFiniPrestamo(newPrestamo.getFiniPrestamo());
        this.prestamos.get(id).setFfinPrestamo(newPrestamo.getFfinPrestamo());
        this.prestamos.get(id).setFrealPrestanmo(newPrestamo.getFrealPrestanmo());
        this.prestamos.get(id).setComentarios(newPrestamo.getComentarios());

        return newPrestamo;
    }

}
