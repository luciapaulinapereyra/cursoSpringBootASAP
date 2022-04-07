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

	@BeforeEach
	void setUp() throws Exception {
		 aluDao = new AlumnoDAO();
		alu = new Alumno(0,"Lucia test", "Pereyra test", "luciapaulinapereyra@gmail.com", "java test", "github/luciapaulinapereyra");
	}

	@AfterEach
	void tearDown() throws Exception {
		aluDao = null;
		alu = null;
	}

	@Test
	void testAgregar() {
		try {
			aluDao.agregar(alu);
			assertTrue(true);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}
	}
	

 

}
	
