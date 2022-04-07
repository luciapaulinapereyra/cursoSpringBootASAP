package es.edu.alter.practica0.modelo.spring.test;

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
		lagarto = null;
		spock = null;
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
	void testPapelGanaASpock_comparar() {
		assertEquals(1, papel.comparar(spock));
	}
	
	@Test
	void testPapelPierdeConTijera_comparar() {
		assertEquals(-1, papel.comparar(tijera));
	}
	
	@Test
	void testPapelPierdeConLagarto_comparar() {
		assertEquals(-1, papel.comparar(lagarto));
	}
	
	@Test
	void testPapelEmpataConPapel_comparar() {
		assertEquals(0, papel.comparar(papel));
	}
	
	//descripcion resultados
	@Test
	void testPapelGanaAPiedra_comparar_DescripcionResultado() {
		@SuppressWarnings("unused")
		int result = papel.comparar(piedra);
		assertEquals("papel le gana a piedra" , papel.getDescripcionResultado());
	}
	
	@Test
	void testPapelGanaASpock_comparar_DescripcionResultado() {
		int result = papel.comparar(spock);
		assertEquals("papel le gana a spock" , papel.getDescripcionResultado());
	}
	
	@Test
	void testPapelPierdeConTijera_comparar_DescripcionResultado() {
		int result = papel.comparar(tijera);
		assertEquals("papel pierde con tijera" , papel.getDescripcionResultado());
	}
	
	@Test
	void testPapelPierdeConLagarto_comparar_DescripcionResultado() {
		int result = papel.comparar(lagarto);
		assertEquals("papel pierde con lagarto" , papel.getDescripcionResultado());
	}
	
	@Test
	void testPapelEmpataConPapel_comparar_DescripcionResultado() {
		int result = papel.comparar(papel);
		assertEquals("papel empata con papel" , papel.getDescripcionResultado());
	}
	
	//instancia
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
	void testTijeraGanaALagarto_comparar() {
		assertEquals(1, tijera.comparar(lagarto));
	}
	
	@Test
	void testTijeraPierdeConPiedra_comparar() {
		assertEquals(-1, tijera.comparar(piedra));
	}
	
	@Test
	void testTijeraPierdeConSpock_comparar() {
		assertEquals(-1, tijera.comparar(spock));
	}
	
	@Test
	void testTijeraEmpataConTijera_comparar() {
		assertEquals(0, tijera.comparar(tijera));
	}
	
	

	// descripcion resultado
	@Test
	void testTijeralGanaAPapel_comparar_DescripcionResultado() {
		int result = tijera.comparar(papel);
		assertEquals("tijera le gana a papel" , tijera.getDescripcionResultado());
	}
	
	@Test
	void testTijeralGanaALagarto_comparar_DescripcionResultado() {
		int result = tijera.comparar(lagarto);
		assertEquals("tijera le gana a lagarto" , tijera.getDescripcionResultado());
	}
	
	@Test
	void testTijeraPierdeConPiedra_comparar_DescripcionResultado() {
		int result = tijera.comparar(piedra);
		assertEquals("tijera pierde con piedra" , tijera.getDescripcionResultado());
	}
	
	@Test
	void testTijeraPierdeConSpock_comparar_DescripcionResultado() {
		int result = tijera.comparar(spock);
		assertEquals("tijera pierde con spock" , tijera.getDescripcionResultado());
	}
	
	@Test
	void testTijeraEmpataConTijera_comparar_DescripcionResultado() {
		int result = tijera.comparar(tijera);
		assertEquals("tijera empata con tijera" , tijera.getDescripcionResultado());
	}
	
	//instancia
	@Test
	void testGetInstanceTijera() {
		assertEquals("tijera",PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.TIJERA).getNombre());
	}


	
	
	//Lagarto
	@Test
	void testLagartoGanaASpock_comparar() {
		assertEquals(1, lagarto.comparar(spock));
	}
	
	@Test
	void testLagartoGanaAPapel_comparar() {
		assertEquals(1, lagarto.comparar(papel));
	}
	
	@Test
	void testLagartoPierdeConTijera_comparar() {
		assertEquals(-1, lagarto.comparar(tijera));
	}
	
	@Test
	void testLagartPierdeConPiedra_comparar() {
		assertEquals(-1, lagarto.comparar(piedra));
	}
	
	@Test
	void testLagartoEmpataConLagarto_comparar() {
		assertEquals(0, lagarto.comparar(lagarto));
	}
	
	
	// descripcion resultado
	@Test
	void testLagartoGanaASpock_comparar_DescripcionResultado() {
		int result = lagarto.comparar(spock);
		assertEquals("lagarto le gana a spock" , lagarto.getDescripcionResultado());
	}
	
	@Test
	void testLagartoGanaAPapel_comparar_DescripcionResultado() {
		int result = lagarto.comparar(papel);
		assertEquals("lagarto le gana a papel" , lagarto.getDescripcionResultado());
	}
	
	@Test
	void testLagartoPierdeConTijera_comparar_DescripcionResultado() {
		int result = lagarto.comparar(tijera);
		assertEquals("lagarto pierde con tijera" , lagarto.getDescripcionResultado());
	}
	
	@Test
	void testLagartoPierdeConPiedra_comparar_DescripcionResultado() {
		int result = lagarto.comparar(piedra);
		assertEquals("lagarto pierde con piedra" , lagarto.getDescripcionResultado());
	}
	@Test
	void testLagartoEmpataConLagarto_comparar_DescripcionResultado() {
		int result = lagarto.comparar(lagarto);
		assertEquals("lagarto empata con lagarto" , lagarto.getDescripcionResultado());
	}
	
	//instancia
	@Test
	void testGetInstanceLagarto() {
		assertEquals("lagarto",PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.LAGARTO).getNombre());
	}
	
	
	
	//Spock
		@Test
		void testSpockGanaATijera_comparar() {
			assertEquals(1, spock.comparar(tijera));
		}
		
		@Test
		void testSpockGanaAPiedra_comparar() {
			assertEquals(1, spock.comparar(piedra));
		}
		
		@Test
		void testSpockPierdeConPapel_comparar() {
			assertEquals(-1, spock.comparar(papel));
		}
		
		@Test
		void testSpockPierdeLagarto_comparar() {
			assertEquals(-1, spock.comparar(lagarto));
		}
		
		@Test
		void testSpockEmpataConSpock_comparar() {
			assertEquals(0, spock.comparar(spock));
		}
	
		
		
		// descripcion resultado
		@Test
		void testSpockGanaATijera_comparar_DescripcionResultado() {
			int result = spock.comparar(tijera);
			assertEquals("spock le gana a tijera" , spock.getDescripcionResultado());
		}
		
		@Test
		void testSpockGanaAPiedra_comparar_DescripcionResultado() {
			int result = spock.comparar(piedra);
			assertEquals("spock le gana a piedra" , spock.getDescripcionResultado());
		}
		
		@Test
		void testSpockPierdeConPapel_comparar_DescripcionResultado() {
			int result = spock.comparar(papel);
			assertEquals("spock pierde con papel" , spock.getDescripcionResultado());
		}
		
		@Test
		void testSpockPierdeConLagarto_comparar_DescripcionResultado() {
			int result = spock.comparar(lagarto);
			assertEquals("spock pierde con lagarto" , spock.getDescripcionResultado());
		}
		
		@Test
		void testSpockEmpataConSpock_comparar_DescripcionResultado() {
			int result = spock.comparar(spock);
			assertEquals("spock empata con spock" , spock.getDescripcionResultado());
		}
		
		//instancia
		@Test
		void testGetInstanceSpock() {
			assertEquals("spock",PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.SPOCK).getNombre());
		}

}
