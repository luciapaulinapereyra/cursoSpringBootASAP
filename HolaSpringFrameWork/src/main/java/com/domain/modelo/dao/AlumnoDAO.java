package com.domain.modelo.dao;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.domain.modelo.Alumno;
import com.domain.modelo.Model;
import com.domain.util.ConnectionManager;

public class AlumnoDAO implements DAO {
	private Connection conexion;

	public AlumnoDAO() throws ClassNotFoundException, SQLException {
	}

	@Override
	public void agregar(Model pModel) throws ClassNotFoundException, SQLException {
		ConnectionManager.conectar();
		conexion = ConnectionManager.getConection();

		StringBuilder sql = new StringBuilder("insert into alumnos (ALU_NOMBRE, ALU_APELLIDO ,ALU_EMAIL, ");
		sql.append("ALU_CONOCIMIENTOS, ALU_GIT) ").append("values (?,?,?,?,?)");

		// downCast
		Alumno alu = (Alumno) pModel;

		PreparedStatement stm = conexion.prepareStatement(sql.toString());
		stm.setString(1, alu.getNombre());
		stm.setString(2, alu.getApellido());
		stm.setString(3, alu.getEmail());
		stm.setString(4, alu.getEstudios());
		stm.setString(5, alu.getLinkArepositorio());

		stm.execute();

		ConnectionManager.desConectar();
	}

	@Override
	public void modificar(Model pModel) throws ClassNotFoundException, SQLException {
		ConnectionManager.conectar();
		conexion = ConnectionManager.getConection();

		StringBuilder sql = new StringBuilder("update  alumnos set ALU_NOMBRE		=?");
		sql.append(" , ALU_APELLIDO		=?").append(" , ALU_EMAIL 			=?").append(" , ALU_CONOCIMIENTOS 	=?")
				.append(" , ALU_GIT			=?").append(" WHERE ALU_ID 		=?");

		// downCast
		Alumno alu = (Alumno) pModel;

		PreparedStatement stm = conexion.prepareStatement(sql.toString());
		stm.setString(1, alu.getNombre());
		stm.setString(2, alu.getApellido());
		stm.setString(3, alu.getEmail());
		stm.setString(4, alu.getEstudios());
		stm.setString(5, alu.getLinkArepositorio());
		stm.setInt(6, alu.getCodigo());
		stm.execute();

		ConnectionManager.desConectar();

	}

	@Override
	public void eliminar(Model pModel) throws ClassNotFoundException, SQLException {
		ConnectionManager.conectar();
		conexion = ConnectionManager.getConection();

		StringBuilder sql = new StringBuilder("delete from  alumnos ");
		sql.append(" WHERE ALU_ID 		=?");

		// downCast
		Alumno alu = (Alumno) pModel;

		PreparedStatement stm = conexion.prepareStatement(sql.toString());
		stm.setInt(1, alu.getCodigo());

		stm.execute();

		ConnectionManager.desConectar();

	}

	@Override
	public List<Model> leer(Model pModel) throws ClassNotFoundException, SQLException {
		ConnectionManager.conectar();
		conexion = ConnectionManager.getConection();

		List<Model> alumnos = new ArrayList<Model>();

		StringBuilder sql = new StringBuilder("select  ALU_ID, ALU_NOMBRE, ALU_APELLIDO ,ALU_EMAIL, ");
		sql.append("ALU_CONOCIMIENTOS, ALU_GIT ").append(" FROM ALUMNOS  ");
		// downCast
		Alumno alu = (Alumno) pModel;

		PreparedStatement stm = null;
		// para mejorar
		if (alu != null && !alu.isEmpty()) {
			if (alu.getCodigo() > 0) {
				sql.append("Where alu_id=?");
				stm = conexion.prepareStatement(sql.toString());
				stm.setInt(1, alu.getCodigo());
			} else if (alu.getNombre() != null && !alu.getNombre().isEmpty()) {
				sql.append("Where alu_nombre =?");
				stm = conexion.prepareStatement(sql.toString());
				stm.setString(1, alu.getNombre());
			}

		} else {
			stm = conexion.prepareStatement(sql.toString());
		}

		ResultSet rs = stm.executeQuery();
		while (rs.next()) {
			alumnos.add(new Alumno(rs.getInt("ALU_ID"), rs.getString("ALU_NOMBRE"), rs.getString("ALU_APELLIDO"),
					rs.getString("ALU_EMAIL"), rs.getString("ALU_CONOCIMIENTOS"), rs.getString("ALU_GIT")));
		}

		ConnectionManager.desConectar();

		return alumnos;
	}

}
