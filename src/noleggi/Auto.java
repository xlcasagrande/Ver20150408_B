package noleggi;

public class Auto extends Veicolo{
	private int porte;
	
	public Auto(String ID, String descrizione, int veicoliTotali, int porte){
		super(ID);
		super(descrizione);
		super(veicoliTotali);
		this.porte = porte;
	}

	public int getPorte() {
		if(porte<0){
			throw new IllegalArgumentException("Il numero delle porte deve essere maggiore di 0");
		}
		return porte;
	}
	
	
}
