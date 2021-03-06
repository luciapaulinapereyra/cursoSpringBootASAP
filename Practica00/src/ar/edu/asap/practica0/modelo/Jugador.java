package ar.edu.asap.practica0.modelo;

import java.util.Objects;

public class Jugador {
      private int codigo;
      private String nombre;
      private String nickname;
      private PiedraPapelTijeraFactory jugadaElegida;
	
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}


	public Jugador(int codigo, String nombre, String nickname, PiedraPapelTijeraFactory jugadaElegida) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.nickname = nickname;
		this.jugadaElegida = jugadaElegida;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public PiedraPapelTijeraFactory getJugadaElegida() {
		return jugadaElegida;
	}


	public void setJugadaElegida(PiedraPapelTijeraFactory jugadaElegida) {
		this.jugadaElegida = jugadaElegida;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return codigo == other.codigo;
	}


	@Override
	public String toString() {
		return "Jugador [codigo=" + codigo + ", nombre=" + nombre + ", nickname=" + nickname + ", jugadaElegida="
				+ jugadaElegida + "]";
	}
	
	

}
