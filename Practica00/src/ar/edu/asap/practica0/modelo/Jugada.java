package ar.edu.asap.practica0.modelo;

import java.util.Date;
import java.util.Objects;

public class Jugada {
	  private  int codigo;
      private  Date fechaHora;
      private  Jugador jugador1;
      private Jugador jugador2;
      
	public Jugada() {
		
	}

	public Jugada(int codigo, Date fechaHora, Jugador jugador1, Jugador jugador2) {
		super();
		this.codigo = codigo;
		this.fechaHora = fechaHora;
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Jugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
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
		Jugada other = (Jugada) obj;
		return codigo == other.codigo;
	}
	
	
	public String getDescripcionDelResultado() {
		PiedraPapelTijeraFactory jugadaElegida1 = jugador1.getJugadaElegida();
		PiedraPapelTijeraFactory jugadaElegida2= jugador2.getJugadaElegida();
		
		jugadaElegida1.comparar(jugadaElegida2);
		return jugadaElegida1.getDescripcionResultado();
	}

	@Override
	public String toString() {
		return "Jugada [codigo=" + codigo + ", fechaHora=" + fechaHora + ", jugador1=" + jugador1 + ", jugador2="
				+ jugador2 + "]";
	}
	
	

}
