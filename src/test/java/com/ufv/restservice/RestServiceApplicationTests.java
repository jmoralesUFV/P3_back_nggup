package com.ufv.restservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RestServiceApplicationTests {

	@Test
	public void contextLoads() {

	}

}


class TestUsuario{
	@Test
	public void getidU(){
		Usuario user=new Usuario(1,"Juana","patatas","666","a@gmail.com","su casa");
		int resultado=user.getId();
		int expected=1;
		assertEquals(resultado,expected);
	}
	@Test
	public void getNombreU(){
		Usuario user=new Usuario(1,"Juana","patatas","666","a@gmail.com","su casa");
		String resultado=user.getNombre();
		String expected="Juana";
		assertEquals(resultado,expected);
	}
	@Test
	public void getDepartamentoU(){
		Usuario user=new Usuario(1,"Juana","patatas","666","a@gmail.com","su casa");
		String resultado=user.getDepartamento();
		String expected="patatas";
		assertEquals(resultado,expected);
	}
	@Test
	public void getTelefono(){
		Usuario user=new Usuario(1,"Juana","patatas","666","a@gmail.com","su casa");
		String resultado=user.getTlf();
		String expected="666";
		assertEquals(resultado,expected);
	}
	@Test
	public void getEmailU(){
		Usuario user=new Usuario(1,"Juana","patatas","666","a@gmail.com","su casa");
		String resultado=user.getEmailContact();
		String expected="a@gmail.com";
		assertEquals(resultado,expected);
	}
	@Test
	public void getUbicacion(){
		Usuario user=new Usuario(1,"Juana","patatas","666","a@gmail.com","su casa");
		String resultado=user.getUbicacion();
		String expected="su casa";
		assertEquals(resultado,expected);
	}
}

class TestEquipo{
	@Test
	public void getIdE(){
		Equipo device =new Equipo(5, "culero", "Manzanita", "Multiusos", new SO("windows", "10"), new Hardware("hola",34,35,new Disco_Duro("ss","ff"),new Pantalla(23.4,32.3)),new Software(new Licencia_libre("hh","ff"),new Licencia_de_pago("hh","!dd","hh")));
		Integer resultado=device.getId_del_equipo();
		int expected=5;
		assertEquals(resultado,expected);
	}
	@Test
	public void gettipoE(){
		Equipo device =new Equipo(5, "culero", "Manzanita", "Multiusos", new SO("windows", "10"), new Hardware("hola",34,35,new Disco_Duro("ss","ff"),new Pantalla(23.4,32.3)),new Software(new Licencia_libre("hh","ff"),new Licencia_de_pago("hh","!dd","hh")));
		String resultado=device.getTipo_de_equipo();
		String expected="culero";
		assertEquals(resultado,expected);
	}

	@Test
	public void getMarcaE(){
		Equipo device =new Equipo(5, "culero", "Manzanita", "Multiusos", new SO("windows", "10"), new Hardware("hola",34,35,new Disco_Duro("ss","ff"),new Pantalla(23.4,32.3)),new Software(new Licencia_libre("hh","ff"),new Licencia_de_pago("hh","!dd","hh")));
		String resultado=device.getMarca_del_equipo();
		String expected="Manzanita";
		assertEquals(resultado,expected);
	}
	@Test
	public void getusoE(){
		Equipo device =new Equipo(5, "culero", "Manzanita", "Multiusos", new SO("windows", "10"), new Hardware("hola",34,35,new Disco_Duro("ss","ff"),new Pantalla(23.4,32.3)),new Software(new Licencia_libre("hh","ff"),new Licencia_de_pago("hh","!dd","hh")));
		String resultado=device.getUso_del_equipo();
		String expected="Multiusos";
		assertEquals(resultado,expected);
	}

		@Test
		public void testSONombre(){
		SO sistema=new SO("windows", "10");
		String resultado=sistema.getNombre();
		String expected="windows";
		assertEquals(resultado,expected);

		}
		@Test
		public void tesSOVersion() {
			SO sistema=new SO("windows", "10");
			String resultado=sistema.getNombre();
			String expected="windows";
			assertEquals(resultado,expected);
		}
		@Test
		public void getHardwareprocesador(){
			Hardware duro=new Hardware("hola",34,35,new Disco_Duro("ss","ff"),new Pantalla(23.4,32.3));
			String resultado=duro.getProcesador();
			String expected="hola";
			assertEquals(resultado,expected);
		}
		@Test
			public void getHardwareCantidadMEspacio(){
			Hardware duro=new Hardware("hola",34,35,new Disco_Duro("ss","ff"),new Pantalla(23.4,32.3));
			double resultado=duro.getCantidad_memoria_GB();
			double expected=34;
			assertEquals(resultado,expected);
		}
		@Test
			public void getHardwareCantidadMVelocidad(){
			Hardware duro=new Hardware("hola",34,35,new Disco_Duro("ss","ff"),new Pantalla(23.4,32.3));
			double resultado=duro.getVelocidad_memoria_GBs();
			double expected=35;
			assertEquals(resultado,expected);
		}
			@Test
			public void getHDDtipo(){
				Disco_Duro hdd=new Disco_Duro("ss","ff");
				String resultado=hdd.getTipo();
				String expected="ss";
				assertEquals(resultado,expected);
			}
			@Test
			public void getPantallaDiagonal(){
				Pantalla screen=new Pantalla(23.4,32.3);
				double resultado=screen.getDiagonal();
				double expected=23.4;
				assertEquals(resultado,expected);
			}
			@Test
			public void getPantallaResolucion(){
				Pantalla screen=new Pantalla(23.4,32.3);
				double resultado=screen.getResolucion();
				double expected=32.3;
				assertEquals(resultado,expected);
			}
		@Test
		public void getLLnombre(){
			Licencia_libre LL=new Licencia_libre("hh","ff");
			String resultado=LL.get_nombre();
			String expected="hh";
			assertEquals(resultado,expected);
		}
		@Test
		public void getLLversion(){
			Licencia_libre LL=new Licencia_libre("hh","ff");
			String resultado=LL.get_version();
			String expected="ff";
			assertEquals(resultado,expected);
		}
		@Test
		public void getLPnombre(){
			Licencia_de_pago Lp=new Licencia_de_pago("hh","ff","jj");
			String resultado=Lp.get_nombre();
			String expected="hh";
			assertEquals(resultado,expected);
		}
		@Test
		public void getLPversion(){
			Licencia_de_pago LP=new Licencia_de_pago("hh","ff","jj");
			String resultado=LP.get_version();
			String expected="ff";
			assertEquals(resultado,expected);
		}
		@Test
		public void getLPTipo(){
			Licencia_de_pago LP=new Licencia_de_pago("hh","ff","jj");
			String resultado=LP.getTipo();
			String expected="jj";
			assertEquals(resultado,expected);
		}
}

class TestPrestamos{
	@Test
	public void getIdP(){
		Prestamos prestamo = new Prestamos(1,2,2,"ayer","hoy","mañana","patata");
		Integer resultado=prestamo.getId();
		int expected=1;
		assertEquals(resultado,expected);
	}
	@Test
	public void getIdPUser(){
		Prestamos prestamo = new Prestamos(1,2,2,"ayer","hoy","mañana","patata");
		Integer resultado=prestamo.getUserID();
		int expected=2;
		assertEquals(resultado,expected);
	}
	@Test
	public void getIdPEquipo(){
		Prestamos prestamo = new Prestamos(1,2,2,"ayer","hoy","mañana","patata");
		Integer resultado=prestamo.getEquipoID();
		int expected=2;
		assertEquals(resultado,expected);
	}
	@Test
	public void getFinicioPrestamo(){
		Prestamos prestamo = new Prestamos(1,2,2,"ayer","hoy","mañana","patata");
		String resultado=prestamo.getFiniPrestamo();
		String expected="ayer";
		assertEquals(resultado,expected);
	}
	@Test
	public void getFinPrestamo(){
		Prestamos prestamo = new Prestamos(1,2,2,"ayer","hoy","mañana","patata");
		String resultado=prestamo.getFfinPrestamo();
		String expected="hoy";
		assertEquals(resultado,expected);
	}
	@Test
	public void getFRealPrestamo(){
		Prestamos prestamo = new Prestamos(1,2,2,"ayer","hoy","mañana","patata");
		String resultado=prestamo.getFrealPrestanmo();
		String expected="mañana";
		assertEquals(resultado,expected);
	}
	@Test
	public void getcomentariosP(){
		Prestamos prestamo = new Prestamos(1,2,2,"ayer","hoy","mañana","patata");
		String resultado=prestamo.getComentarios();
		String expected="patata";
		assertEquals(resultado,expected);
	}
}



