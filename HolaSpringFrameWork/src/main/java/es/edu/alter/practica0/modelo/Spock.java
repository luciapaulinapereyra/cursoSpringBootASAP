package es.edu.alter.practica0.modelo;

public class Spock extends PiedraPapelTijeraFactory {

	public Spock() {
		this("spock", PiedraPapelTijeraFactory.SPOCK);
	}
	
	public Spock (String nombre, int numero) {
		super(nombre,numero);
	}
	
	@Override
	public boolean isMe(int pNUM) {
		return pNUM == PiedraPapelTijeraFactory.SPOCK;
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
		case PiedraPapelTijeraFactory.PIEDRA:
			result=1;
			this.descripcionResultado= nombre + " le gana a " +pPPTFact.getNombre();
			break;
			
			//pierde
		case PiedraPapelTijeraFactory.LAGARTO:
			result=-1;
			this.descripcionResultado= nombre + " pierde con " +pPPTFact.getNombre();
			break;
			
		case PiedraPapelTijeraFactory.PAPEL:
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

}
