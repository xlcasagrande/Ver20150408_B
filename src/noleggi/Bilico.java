package noleggi;

public class Bilico extends Veicolo{
	private double portata;
	
	public Bilico(String ID, String descrizione, int veicoliTotali, double portata){
		super(ID);
		super(descrizione);
		super(veicoliTotali);
		this.portata = portata;
	}
}
