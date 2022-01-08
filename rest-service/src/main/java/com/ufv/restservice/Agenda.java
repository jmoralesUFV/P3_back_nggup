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

    public int varIdUsers;
    public int varIdDevices;
    public int varIdLoans;



    public Agenda()
    {
        this.usuarios = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.prestamos = new ArrayList<>();

        this.varIdUsers = leerContadorUser();
        this.varIdDevices = leerContadorDevices();
        this.varIdLoans = leerContadorLoans();
    }

    /*
        -------------------------------------------------
        CJTO DE FUNCIONES PARA EL TRATAMIENTO DE USUARIOS
        -------------------------------------------------
    */

    public Boolean addUser(Usuario U)
    {
        U.setId(varIdUsers);
        varIdUsers++;
        EscribirCUsers(varIdUsers);
        return this.usuarios.add(U);
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
        E.setId_del_equipo(varIdDevices);
        varIdDevices++;
        EscribirCDevices(varIdDevices);
        return this.equipos.add(E);
    }

    public ArrayList<Equipo> getAllEquipos()
    {
        return this.equipos;
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
        P.setId(varIdLoans);
        varIdLoans++;
        EscribirCLoans(varIdLoans);
        return this.prestamos.add(P);
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

    // Funciones para el procesamiento de los contadores (Usuarios)
    public int leerContadorUser(){

        int var;

        try (Reader reader = new FileReader("contadoresID\\contadoresIdUser.txt")) {

            // Convert JSON File to Java Object
            var = Integer.parseInt(String.valueOf(reader));

        } catch (IOException e) {
            return -1;
        }
        return var;
    }

    public boolean EscribirCUsers(int contador){

        FileWriter fichero = null;
        PrintWriter pw = null;

        try
        {
            fichero = new FileWriter("contadoresID\\contadoresIdUser.txt");
            pw = new PrintWriter(fichero);

            pw.println(contador);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    // Funciones para el procesamiento de los contadores (Equipos)
    public int leerContadorDevices(){

        int var;

        try (Reader reader = new FileReader("contadoresID\\contadoresIdDevices.txt")) {

            // Convert JSON File to Java Object
            var = Integer.parseInt(String.valueOf(reader));

        } catch (IOException e) {
            return -1;
        }
        return var;
    }

    public boolean EscribirCDevices(int contador){

        FileWriter fichero = null;
        PrintWriter pw = null;

        try
        {
            fichero = new FileWriter("contadoresID\\contadoresIdDevices.txt");
            pw = new PrintWriter(fichero);

            pw.println(contador);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    // Funciones para el procesamiento de los contadores (Préstamos)
    public int leerContadorLoans(){

        int var;

        try (Reader reader = new FileReader("contadoresID\\contadoresIdLoans.txt")) {

            // Convert JSON File to Java Object
            var = Integer.parseInt(String.valueOf(reader));

        } catch (IOException e) {
            return -1;
        }
        return var;
    }

    public boolean EscribirCLoans(int contador){

        FileWriter fichero = null;
        PrintWriter pw = null;

        try
        {
            fichero = new FileWriter("contadoresID\\contadoresIdLoans.txt");
            pw = new PrintWriter(fichero);

            pw.println(contador);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }


}
