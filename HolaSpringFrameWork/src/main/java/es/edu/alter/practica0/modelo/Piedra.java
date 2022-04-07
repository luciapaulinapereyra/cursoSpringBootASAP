
package es.edu.alter.practica0.modelo;

public class Piedra extends PiedraPapelTijeraFactory{
	 
	public Piedra() {
		this("piedra", PiedraPapelTijeraFactory.PIEDRA);
	}
	
	public Piedra (String nombre, int numero) {
		super(nombre,numero);
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPPTFact) {
		int result =0;
		switch(pPPTFact.getNumero()) {
		 
		//gana
		case PiedraPapelTijeraFactory.TIJERA:
			result=1;
			this.descripcionResultado= nombre + " le gana a " +pPPTFact.getNombre();
			break;
			
		case PiedraPapelTijeraFactory.LAGARTO:
			result=1;
			this.descripcionResultado= nombre + " le gana a " +pPPTFact.getNombre();
			break;
			
			
			//pierde
		case PiedraPapelTijeraFactory.PAPEL:
			result=-1;
			this.descripcionResultado= nombre + " pierde con " +pPPTFact.getNombre();
			break;
			
			//pierde
		case PiedraPapelTijeraFactory.SPOCK:
			result=-1;
			this.descripcionResultado= nombre + " pierde con " +pPPTFact.getNombre();
			break;
			
			//empate
		default:
			 this.descripcionResultado = nombre + " empata con " +  pPPTFact.getNombre();
			 break;
		} 
		return result;
	}

	@Override
	public boolean isMe(int pNUM) {
		// TODO Auto-generated method stub
		return pNUM == PiedraPapelTijeraFactory.PIEDRA;
	}

}