package ar.edu.asap.practica0.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.asap.practica0.modelo.Lagarto;
import ar.edu.asap.practica0.modelo.Papel;
import ar.edu.asap.practica0.modelo.Piedra;
import ar.edu.asap.practica0.modelo.PiedraPapelTijeraFactory;
import ar.edu.asap.practica0.modelo.Spock;
import ar.edu.asap.practica0.modelo.Tijera;

class PiedraPapelTijeraFactoryTest {
	Piedra piedra;
	Papel papel;
	Tijera tijera;
	Lagarto lagarto;
	Spock spock;

	@BeforeEach
	void setUp() throws Exception {
		//antes de cada test
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
		lagarto = new Lagarto();
		spock = new Spock();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		//despues de cada test
		piedra = null;
		papel = null;
		tijera = null;
	}
	
	//PIEDRA
	@Test
	void testPiedraGanaATijera_comparar() {
		assertEquals(1, piedra.comparar(tijera));
	}
	
	@Test
	void testPiedraGanaALagarto_comparar() {
		assertEquals(1, piedra.comparar(lagarto));
	}
	
	@Test
	void testPiedraPierdeConPapel_comparar() {
		assertEquals(-1, piedra.comparar(papel));
	}
	
	@Test
	void testPiedraPierdeConSpock_comparar() {
		assertEquals(-1, piedra.comparar(spock));
	}
	
	@Test
	void testPiedraEmpataConPiedra_comparar() {
		assertEquals(0, piedra.comparar(piedra));
	}
	

	//descripcion resultados
	

	@Test
	void testPiedraGanaATijera_comparar_DescripcionResultado() {
		int result = piedra.comparar(tijera);
		assertEquals("piedra le gana a tijera" , piedra.getDescripcionResultado());
	}
	
	@Test
	void testPiedraGanaALagarto_comparar_DescripcionResultado() {
		int result = piedra.comparar(lagarto);
		assertEquals("piedra le gana a lagarto" , piedra.getDescripcionResultado());
	}

	@Test
	void testPiedraPierdeConPapel_comparar_DescripcionResultado() {
		int result = piedra.comparar(papel);
		assertEquals("piedra pierde con papel" , piedra.getDescripcionResultado());
	}
	
	@Test
	void testPiedraPierdeConSpock_comparar_DescripcionResultado() {
		int result = piedra.comparar(spock);
		assertEquals("piedra pierde con spock" , piedra.getDescripcionResultado());
	}
	
	@Test
	void testPiedraEmpataConPiedra_comparar_DescripcionResultado() {
		int result = piedra.comparar(piedra);
		assertEquals("piedra empata con piedra" , piedra.getDescripcionResultado());
	}
	
	
	
	//instancia
	@Test
	void testGetInstancePiedra() {
		assertEquals("piedra",PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA).getNombre());
	}
	
	
	
	
	
	//PAPEL
	@Test
	void testPapelGanaAPiedra_comparar() {
		assertEquals(1, papel.comparar(piedra));
	}
	
	@Test
	void testPapelPierdeConTijera_comparar() {
		assertEquals(-1, papel.comparar(tijera));
	}
	
	@Test
	void testPapelEmpataConPapel_comparar() {
		assertEquals(0, papel.comparar(papel));
	}
	
	
	@Test
	void testPapelGanaAPiedra_comparar_DescripcionResultado() {
		int result = papel.comparar(piedra);
		assertEquals("papel le gana a piedra" , papel.getDescripcionResultado());
	}
	

	
	@Test
	void testPapelPierdeConTijera_comparar_DescripcionResultado() {
		int result = papel.comparar(tijera);
		assertEquals("papel pierde con tijera" , papel.getDescripcionResultado());
	}
	
	@Test
	void testPapelEmpataConPapel_comparar_DescripcionResultado() {
		int result = papel.comparar(papel);
		assertEquals("papel empata con papel" , papel.getDescripcionResultado());
	}
	
	
	@Test
	void testGetInstancePapel() {
		assertEquals("papel",PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PAPEL).getNombre());
	}
	
	
	
	
	
	
	
	
	
	//TIJERA
	@Test
	void testTijeraGanaAPapel_comparar() {
		assertEquals(1, tijera.comparar(papel));
	}
	
	@Test
	void testTijeraPierdeConPiedra_comparar() {
		assertEquals(-1, tijera.comparar(piedra));
	}
	
	@Test
	void testTijeraEmpataConTijera_comparar() {
		assertEquals(0, tijera.comparar(tijera));
	}
	
	

	
	@Test
	void testTijeralGanaAPapel_comparar_DescripcionResultado() {
		int result = tijera.comparar(papel);
		assertEquals("tijera le gana a papel" , tijera.getDescripcionResultado());
	}
	

	
	@Test
	void testTijeraPierdeConPiedra_comparar_DescripcionResultado() {
		int result = tijera.comparar(piedra);
		assertEquals("tijera pierde con piedra" , tijera.getDescripcionResultado());
	}
	
	@Test
	void testTijeraEmpataConTijera_comparar_DescripcionResultado() {
		int result = tijera.comparar(tijera);
		assertEquals("tijera empata con tijera" , tijera.getDescripcionResultado());
	}
	
	
	@Test
	void testGetInstanceTijera() {
		assertEquals("tijera",PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.TIJERA).getNombre());
	}



}
