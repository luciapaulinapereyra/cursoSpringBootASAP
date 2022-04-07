package com.domain.modelo.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.domain.modelo.Alumno;
import com.domain.modelo.dao.AlumnoDAO;

class AlumnoDAOTest {
	
	AlumnoDAO aluDao;
	Alumno alu;
	Alumno aluMod;
	Alumno aluElim;

	@BeforeEach
	void setUp() throws Exception {
		 aluDao = new AlumnoDAO();
		alu = new Alumno(0,"Lucia test", "Pereyra test", "luciapaulinapereyra@gmail.com", "java test", "github/luciapaulinapereyra");
		aluMod= new Alumno(2,"Paulina ", "a test", "a@gmail.com", "java test", "github/a");
		aluElim= new Alumno(1);
	}

	@AfterEach
	void tearDown() throws Exception {
		aluDao = null;
		alu = null;
		aluMod=null;
		aluElim=null;
	}

//	@Test
//	void testAgregar() {
//		try {
//			aluDao.agregar(alu);
//			assertTrue(true);
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			assertTrue(false);
//		}
//	}
	

//     @Test
//     void testModificar() {
//    	 
//    	 try {
//			aluDao.modificar(aluMod);
//			assertTrue(true);
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			assertTrue(false);
//		}
//    	 
//     }
     
//     @Test
//     void testEliminar() {
//    	 try {
//			aluDao.eliminar(aluElim);
//			assertTrue(true);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			assertTrue(false);
//		}
//     }
     
     @Test
     void testLeerPorCodigo() {
    	 try {
			aluDao.leer(aluElim);
			assertTrue(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
     }

}
	
