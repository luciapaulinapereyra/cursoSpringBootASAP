package es.edu.alter.practica0.modelo.spring.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.edu.alter.practica0.modelo.Jugador;
import es.edu.alter.practica0.modelo.*;
class JugadorTest {
  
	ClassPathXmlApplicationContext context = null, context2 = null, context3 = null;
	Jugador jug1 = null; 
	Jugador jug2= null;
	Jugada jugada = null;
	Autoria auditoria = null;
	@BeforeEach
	void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("META-INF/juego/Jugador.xml");
		jug1 = context.getBean(Jugador.class);
		context2 = new ClassPathXmlApplicationContext("META-INF/juego/Jugador2.xml");
		jug2 = context2.getBean(Jugador.class);
		context3 = new ClassPathXmlApplicationContext("META-INF/juego/Jugada.xml");
		jugada = context3.getBean(Jugada.class);
		auditoria = context3.getBean(Autoria.class);
	}

	@AfterEach
	void tearDown() throws Exception {
		context = null;
		jug1 = null;
		jug2 = null;
		context2= null;
		context3= null;
		auditoria= null;
		jugada = null;
	}

	@Test
	void testGetBeanAttributes() {
		assertEquals(1, jug1.getCodigo());
		assertEquals("Lucia", jug1.getNombre());
		assertEquals("lulonga", jug1.getNickname());
		assertEquals("piedra", jug1.getJugadaElegida().getNombre());
	}
	
	@Test
	void testGetBeanAttributes2() {
		assertEquals(2, jug2.getCodigo());
		assertEquals("Maria", jug2.getNombre());
		assertEquals("mamasa", jug2.getNickname());
		assertEquals("spock", jug2.getJugadaElegida().getNombre());
	}
	
	@Test
	void testAuditoriaGetCantidad() {
		jugada.getDescripcionDelResultado();
		jugada.getDescripcionDelResultado();
		jugada.getDescripcionDelResultado();
		assertEquals(3, auditoria.getCantidadJugadas());
	}

}
