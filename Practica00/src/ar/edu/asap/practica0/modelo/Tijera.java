package ar.edu.asap.practica0.modelo;

public class Tijera extends PiedraPapelTijeraFactory{
	public Tijera() {
		this("tijera", PiedraPapelTijeraFactory.TIJERA);
	}
	
	public Tijera (String nombre, int numero) {
		super(nombre,numero);
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPPTFact) {
		int result =0;
		switch(pPPTFact.getNumero()) {
		 
		//gana
		case PiedraPapelTijeraFactory.PAPEL:
			result=1;
			this.descripcionResultado= nombre + " le gana a " +pPPTFact.getNombre();
			break;
			
		case PiedraPapelTijeraFactory.LAGARTO:
			result=1;
			this.descripcionResultado= nombre + " le gana a " +pPPTFact.getNombre();
			break;
			
			
			//pierde
		case PiedraPapelTijeraFactory.PIEDRA:
			result=-1;
			this.descripcionResultado= nombre + " pierde con " +pPPTFact.getNombre();
			break;
			
		case PiedraPapelTijeraFactory.SPOCK:
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
		return pNUM == PiedraPapelTijeraFactory.TIJERA;
	}
}














