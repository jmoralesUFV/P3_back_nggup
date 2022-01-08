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
        /*
        this.agendaU = new Agenda();
        this.agendaE = new Agenda();
        this.agendaP = new Agenda();

        this.agendaU.addUser(new Usuario(12340, "Demetrio Cansalmas", "Drenaje de almas", "654654654", "demetriocansalmas@hotmail.com", "Alcafrán"));
        this.agendaU.addUser(new Usuario(12341, "Blasa Jiménez", "Astrofísica", "456456456", "lablasaAF@hotmail.com", "Alcafrán"));
        this.agendaU.addUser(new Usuario(12342, "Vieja del visilló", "Enteramiento de to' lo vivo", "13321123", "viejalvisillo@hotmail.com", "Iglesia de Alcafrán"));

        this.agendaE.addEquipo(new Equipo(4, "Gratificante", "MSI", "Muchos y muy variados", new SO("MAC", "2"), new Hardware("Pentium",3.5,3.5,new Disco_Duro("HDD","Demasiada"),new Pantalla(23.4,32.3)),new Software(new Licencia_libre("Paint","2021"),new Licencia_de_pago("Powerpoint","2016","Presentaciones"))));
        this.agendaE.addEquipo(new Equipo(7, "Gratis", "OpenAI", "NFTS", new SO("Musk", "200"), new Hardware("pentium",1.000,4322.2,new Disco_Duro("SSD","Tanta que da miedo"),new Pantalla(23.4,32.3)),new Software(new Licencia_libre("GPT3","2021"),new Licencia_de_pago("Codex","2020","Vida"))));
        this.agendaE.addEquipo(new Equipo(5, "culero", "Manzanita", "Multiusos", new SO("windows", "10"), new Hardware("hola",34,35,new Disco_Duro("ss","ff"),new Pantalla(23.4,32.3)),new Software(new Licencia_libre("hh","ff"),new Licencia_de_pago("hh","!dd","hh"))));

        this.agendaP.addPrestamo(new Prestamos(01, 12340, 0010, "12/12/2012", "13/12/2012", "13/12/2012", "Puta clase equipo"));
        this.agendaP.addPrestamo(new Prestamos(02, 12341, 0013, "11/11/2012", "12/12/2012", "13/12/2012", "Ya llevamos 3 putos días"));
        this.agendaP.addPrestamo(new Prestamos(03, 12342, 0015, "10/12/2021", "11/12/2012", "13/12/2012", "La ventana de clase me dice que me tire por elksdjfhuikaerywgfyuwebfuhwrbehfg59yhgv"));
          */
    }

    /*
    public static void main(String[] args) {

        Agenda agendaUP;
        agendaUP = new Agenda();

        Agenda agendaEP;
        agendaEP = new Agenda();

        Agenda agendaPP;
        agendaPP = new Agenda();

        agendaUP.addUser(new Usuario(12340, "Demetrio Cansalmas", "Drenaje de almas", "654654654", "demetriocansalmas@hotmail.com", "Alcafrán"));
        agendaUP.addUser(new Usuario(12341, "Blasa Jiménez", "Astrofísica", "456456456", "lablasaAF@hotmail.com", "Alcafrán"));
        agendaUP.addUser(new Usuario(12342, "Vieja del visilló", "Enteramiento de to' lo vivo", "13321123", "viejalvisillo@hotmail.com", "Iglesia de Alcafrán"));

        agendaPP.addPrestamo(new Prestamos(01, 12340, 0010, "12/12/2012", "13/12/2012", "13/12/2012", "Puta clase equipo"));
        agendaPP.addPrestamo(new Prestamos(02, 12341, 0013, "11/11/2012", "12/12/2012", "13/12/2012", "Ya llevamos 3 putos días"));
        agendaPP.addPrestamo(new Prestamos(03, 12342, 0015, "10/12/2021", "11/12/2012", "13/12/2012", "La ventana de clase me dice que me tire por elksdjfhuikaerywgfyuwebfuhwrbehfg59yhgv"));

        agendaEP.addEquipo(new Equipo(7, "Gratis", "OpenAI", "NFTS", new SO("Musk", "200"), new Hardware("pentium",1.000,4322.2,new Disco_Duro("SSD","Tanta que da miedo"),new Pantalla(23.4,32.3)),new Software(new Licencia_libre("GPT3","2021"),new Licencia_de_pago("Codex","2020","Vida"))));
        agendaEP.addEquipo(new Equipo(4, "Gratificante", "MSI", "Muchos y muy variados", new SO("MAC", "2"), new Hardware("Pentium",3.5,3.5,new Disco_Duro("HDD","Demasiada"),new Pantalla(23.4,32.3)),new Software(new Licencia_libre("Paint","2021"),new Licencia_de_pago("Powerpoint","2016","Presentaciones"))));
        agendaEP.addEquipo(new Equipo(5, "culero", "Manzanita", "Multiusos", new SO("windows", "10"), new Hardware("hola",34,35,new Disco_Duro("ss","ff"),new Pantalla(23.4,32.3)),new Software(new Licencia_libre("hh","ff"),new Licencia_de_pago("hh","!dd","hh"))));

        // Imprimo por defecto los equipos.

        for(int i = 0; i < 3; i++)
        {
            System.out.println(agendaUP.getUserById(i));
        }

        System.out.println(" ");

        for(int i = 0; i < 3; i++)
        {
            System.out.println(agendaEP.getEquipoById(i));
        }

        System.out.println(" ");


        for(int i = 0; i < 3; i++)
        {
            System.out.println(agendaPP.getPrestamoById(i));
        }


        System.out.println("Probamos a editar a uno de los equipos desde el local: \n");
        System.out.println(agendaEP.getEquipoById(1));


        agendaEP.updateEquipoById(1,new Equipo(4, "Portatil", "MSI", "Muchos y muy variados", new SO("MAC", "2"), new Hardware("Pentium",3.5,3.5,new Disco_Duro("SDD","250GB"),new Pantalla(23.4,32.3)),new Software(new Licencia_libre("Paint","2021"),new Licencia_de_pago("OFFICE 365","2021","Presentaciones y documentación"))));

        System.out.println("Probamos a imprimir el nuevo editado, el del centro: \n");

        System.out.println(agendaEP.getEquipoById(1));

        System.out.println("Probamos a borrar el ultimo insertado: \n");

        agendaEP.removeEquipoById(1);

        System.out.println("El Arraylist editado: ");

        for(int i = 0; i < 2; i++)
        {
            System.out.println(agendaEP.getEquipoById(i));
        }

    }

    */

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
