package com.ufv.restservice;


import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jsonreadernew {

    Gson gson =new Gson();
    public Jsonreadernew() {

    }
    public ArrayList<Usuario> leerUsuarios(){
        Gson gson =new Gson();
        int contador=0;
        ArrayList<Usuario> usuarios=new ArrayList<>();
        Usuario[] lista_users2=null;
        try (Reader reader = new FileReader("rest-service/Jsons/Usuarios.json")) {

            // Convert JSON File to Java Object
            lista_users2=gson.fromJson(reader,Usuario[].class);

            // print staff
            if(lista_users2!=null) {
                for (Usuario user :
                        lista_users2
                ) {
                    usuarios.add(user);
                    contador=contador+1;

                }
            }
            else
                System.out.println("vacio maquina ");
        } catch (IOException e) {
            return null ;
        }

        return usuarios;
    }

    public ArrayList<Equipo> leerEquipos(){
        Gson gson =new Gson();
        ArrayList<Equipo> Equipos=new ArrayList<>();
        Equipo[] lista_equipos=null;
        try (Reader reader = new FileReader("rest-service/Jsons/Equipos.json")) {

            // Convert JSON File to Java Object
            lista_equipos=gson.fromJson(reader,Equipo[].class);

            // print staff
            if (lista_equipos!=null) {
                for (Equipo team :
                        lista_equipos
                ) {
                    Equipos.add(team);

                }
            }
        } catch (IOException e) {
            return null ;
        }
        return Equipos;
    }

    public ArrayList<Prestamos> leePrestamos(){
        Gson gson =new Gson();
        ArrayList<Prestamos> prestamos=new ArrayList<>();
        Prestamos[] lista_prestamos=null;
        try (Reader reader = new FileReader("rest-service/Jsons/Prestamos.json")) {

            // Convert JSON File to Java Object
            lista_prestamos=gson.fromJson(reader,Prestamos[].class);

            // print staff
            if(lista_prestamos!=null) {
                for (Prestamos prestamo :
                        lista_prestamos
                ) {
                    prestamos.add(prestamo);

                }
            }
        } catch (IOException e) {
            return null ;
        }
        return prestamos;
    }

    public boolean EscribirUsers(ArrayList<Usuario> U){
        Gson gson=new Gson();
        FileWriter fichero = null;
        PrintWriter pw = null;
        String usuarios=gson.toJson(U);
        try
        {
            fichero = new FileWriter("rest-service/Jsons/Usuarios.json");
            pw = new PrintWriter(fichero);


            pw.println(usuarios);

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

    public boolean EscribirEquipos(ArrayList<Equipo> E){
        Gson gson=new Gson();
        FileWriter fichero = null;
        PrintWriter pw = null;
        String equipos=gson.toJson(E);
        try
        {
            fichero = new FileWriter("rest-service/Jsons/Equipos.json");
            pw = new PrintWriter(fichero);


            pw.println(equipos);

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

    public boolean EscribirPrestamos(ArrayList<Prestamos> P){
        Gson gson=new Gson();
        FileWriter fichero = null;
        PrintWriter pw = null;
        String prestamos=gson.toJson(P);
        try
        {
            fichero = new FileWriter("rest-service/Jsons/Prestamos.json");
            pw = new PrintWriter(fichero);


            pw.println(prestamos);

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

