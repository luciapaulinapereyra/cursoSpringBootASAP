package com.domain.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.domain.modelo.Alumno;
import com.domain.modelo.Model;
import com.domain.util.ConnectionManager;


public class AlumnoDAO implements DAO {
      private Connection conexion;
      
	public AlumnoDAO() throws ClassNotFoundException, SQLException {
      ConnectionManager.conectar();
      conexion = ConnectionManager.getConection();
	}

	@Override
	public void agregar(Model pModel) throws ClassNotFoundException, SQLException {
		StringBuilder sql = new StringBuilder("INSERT INTO alumnos(ALU_NOMBRE, ALU_APELLIDO, ALU_EMAIL, ");
		 sql.append( "ALU_CONOCIMIENTOS, ALU_GIT)").append("values(?,?,?,?,?)");
		
		Alumno alu = (Alumno) pModel;
		PreparedStatement stm = conexion.prepareStatement(sql.toString());
		
		stm.setString(1, alu.getNombre());
		stm.setString(2, alu.getApellido());
		stm.setString(3, alu.getEmail());
		stm.setString(4, alu.getEstudios());
		stm.setString(5, alu.getLinkArepositorio());
		
		stm.execute();

	}

	@Override
	public void modificar(Model pModel) throws ClassNotFoundException,SQLException {
		StringBuilder sql = new StringBuilder("UPDATE alumnos SET ALU_NOMBRE = ?, ALU_APELLIDO= ?, ALU_EMAIL=?, ALU_CONOCIMIENTOS=?, ALU_GIT= ? WHERE ALU_ID=?");
		Alumno aluMod = (Alumno) pModel;
		PreparedStatement stm = conexion.prepareStatement(sql.toString());
		
		stm.setString(1, aluMod.getNombre());
		stm.setString(2, aluMod.getApellido());
		stm.setString(3, aluMod.getEmail());
		stm.setString(4, aluMod.getEstudios());
		stm.setString(5, aluMod.getLinkArepositorio());
		stm.setLong(6, aluMod.getCodigo());
		
		stm.executeUpdate();
	}

	@Override
	public void eliminar(Model pModel) throws SQLException {
		StringBuilder sql = new StringBuilder("DELETE FROM alumnos WHERE ALU_ID=?");
		Alumno aluMod = (Alumno) pModel;
		PreparedStatement stm = conexion.prepareStatement(sql.toString());
		stm.setLong(1, aluMod.getCodigo());
		stm.executeUpdate();
	}

	@Override
	public List<Model> leer(Model pModel) throws SQLException {
		ResultSet res;
		StringBuilder sql = new StringBuilder("SELECT*FROM alumnos WHERE ALU_ID=?");
		Alumno aluMod = (Alumno) pModel;
		PreparedStatement stm = conexion.prepareStatement(sql.toString());
		stm.setLong(1, aluMod.getCodigo());
		
		res= stm.executeQuery();
		if(res.next()) {
		   aluMod.setNombre(res.getString("ALU_NOMBRE"));
		   aluMod.setApellido(res.getString("ALU_APELLIDO"));
		   aluMod.setEmail(res.getString("ALU_EMAIL"));
		   aluMod.setEstudios(res.getString("ALU_CONOCIMIENTOS"));
		} else {
			System.out.println("no existe esa persona");
		}

		
		
		System.out.println(aluMod);
		return null;
	}

}