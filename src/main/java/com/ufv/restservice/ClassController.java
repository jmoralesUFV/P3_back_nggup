package com.ufv.restservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ClassController {

    private Agenda agendaU;
    private Agenda agendaE;
    private Agenda agendaP;

    private final String urlU = "/users";
    private final String urlE = "/devices";
    private final String urlP = "/loans";


    public ClassController()
    {
        this.agendaU = new Agenda();
        this.agendaE = new Agenda();
        this.agendaP = new Agenda();


    }

    /*
        -------------------------------------------------
        CJTO DE FUNCIONES PARA EL LLAMAMIENTO DE USUARIOS
        -------------------------------------------------
    */

    @GetMapping("/")
    public String saludar() {
        // ---
        return "Hola!";
    }

    @GetMapping(urlU+"/{id}")
    public Usuario getUserByIdREST(@PathVariable int id) {
        //
        return this.agendaU.getUserById(id);
    }

    @GetMapping(urlU)
    public ArrayList<Usuario> getAllUsers() {
        //
        return this.agendaU.getAllUsers();
    }

    @PostMapping(urlU)
    public Usuario addUser(@RequestBody Usuario c) {

        // Recoger el contacto del request

        // Guardo el contacto
        this.agendaU.addUser(c);

        // Devolver el contacto creado (Buena práctica)
        return c;
    }

    @PutMapping(urlU+"/{id}")
    public Usuario updateUserByIdREST(@RequestBody Usuario c, @PathVariable int id) {
        //
        return this.agendaU.updateUserById(id, c);
    }


    @DeleteMapping(urlU+"/{id}")
    public Usuario deleteUserByIdREST(@PathVariable int id) {
        //
        return this.agendaU.removeUserById(id);
    }

    /*
        -------------------------------------------------
        CJTO DE FUNCIONES PARA EL LLAMAMIENTO DE EQUIPOS
        -------------------------------------------------
    */

    @GetMapping(urlE+"/{id}")
    public Equipo getEquipoByIdREST(@PathVariable int id) {
        //
        return this.agendaE.getEquipoById(id);
    }

    @GetMapping(urlE)
    public ArrayList<Equipo> getEquipos() {
        //
        return this.agendaE.getAllEquipos();
    }

    @PostMapping(urlE)
    public Equipo addEquipo(@RequestBody Equipo e) {

        // Recoger el contacto del request

        // Guardo el contacto
        this.agendaE.addEquipo(e);

        // Devolver el préstamo creado (Buena práctica)
        return e;
    }

    @PutMapping(urlE+"/{id}")
    public Equipo updateEquipoByIdREST(@RequestBody Equipo e, @PathVariable int id) {
        //
        return this.agendaE.updateEquipoById(id, e);
    }


    @DeleteMapping(urlE+"/{id}")
    public Equipo deleteEquipoByIdREST(@PathVariable int id) {
        //
        return this.agendaE.removeEquipoById(id);
    }


    /*
        -------------------------------------------------
        CJTO DE FUNCIONES PARA EL LLAMAMIENTO DE PRÉSTAMOS
        -------------------------------------------------
    */

    @GetMapping(urlP+"/{id}")
    public Prestamos getPrestamoByIdREST(@PathVariable int id) {
        //
        return this.agendaP.getPrestamoById(id);

    }

    @GetMapping(urlP)
    public ArrayList<Prestamos> getPrestamos() {
        //
        return this.agendaP.getAllPrestamos();
    }

    @PostMapping(urlP)
    public Prestamos addPrestamo(@RequestBody Prestamos p) {

        // Recoger el contacto del request

        // Guardo el contacto
        this.agendaP.addPrestamo(p);

        // Devolver el préstamo creado (Buena práctica)
        return p;
    }

    @PutMapping(urlP+"/{id}")
    public Prestamos updatePrestamoByIdREST(@RequestBody Prestamos p, @PathVariable int id) {
        //
        return this.agendaP.updatePrestamoById(id, p);
    }


    @DeleteMapping(urlP+"/{id}")
    public Prestamos deletePrestamoByIdREST(@PathVariable int id) {
        //
        return this.agendaP.removePrestamoById(id);
    }

  
}
