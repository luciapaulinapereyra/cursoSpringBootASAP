package ar.edu.asap.practica0.modelo;

public class Papel extends PiedraPapelTijeraFactory{
	public Papel() {
		this("papel", PiedraPapelTijeraFactory.PAPEL);
	}
	
	public Papel (String nombre, int numero) {
		super(nombre,numero);
	}
	@Override
	public int comparar(PiedraPapelTijeraFactory pPPTFact) {
		int result =0;
		switch(pPPTFact.getNumero()) {
		 
		//gana
		case PiedraPapelTijeraFactory.PIEDRA:
			result=1;
			this.descripcionResultado= nombre + " le gana a " +pPPTFact.getNombre();
			break;
			
		case PiedraPapelTijeraFactory.SPOCK:
			result=1;
			this.descripcionResultado= nombre + " le gana a " +pPPTFact.getNombre();
			break;
			
			//pierde
		case PiedraPapelTijeraFactory.TIJERA:
			result=-1;
			this.descripcionResultado= nombre + " pierde con " +pPPTFact.getNombre();
			break;
			
		case PiedraPapelTijeraFactory.LAGARTO:
			result=-1;
			this.descripcionResultado= nombre + " pierde con " +pPPTFact.getNombre();
			break;
			
			//empata
		default:
			 this.descripcionResultado = nombre + " empata con " +  pPPTFact.getNombre();
			 break;
		} 
		return result;
	}

	@Override
	public boolean isMe(int pNUM) {
		return pNUM == PiedraPapelTijeraFactory.PAPEL;
	}

}



