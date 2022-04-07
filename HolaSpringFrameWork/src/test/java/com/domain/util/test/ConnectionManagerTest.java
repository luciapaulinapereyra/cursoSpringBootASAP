package com.domain.util.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.domain.util.ConnectionManager;

class ConnectionManagerTest {
  Connection con;
	@BeforeEach
	void setUp() throws Exception {
       ConnectionManager.conectar();
       con = ConnectionManager.getConection();
	}

	@AfterEach
	void tearDown() throws Exception {
		con= null;
	}

	@Test
	void testConectar() {
		try {
			ConnectionManager.conectar();
			assertTrue(true);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			assertTrue(false);
			
		}
	}
	
	@Test
	void testDesconectar() throws SQLException {
		ConnectionManager.desConectar();
		assertTrue(con.isClosed());
	}

}
