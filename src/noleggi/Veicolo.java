package noleggi;

import java.util.Vector;

public class Veicolo {
	private String ID;
	private String descrizione;
	private int veicoliTotali;
	
	public Veicolo(String ID, String descrizione, int veicoliTotali){
		this.ID = ID;
		this.descrizione = descrizione;
		this.veicoliTotali = veicoliTotali;
	}

	public int getVeicoliTotali() {
		if(veicoliTotali<0){
			throw new IllegalArgumentException("Il numero dei veicoli totali deve essere maggiore di 0");
		}
		return veicoliTotali;
	}

	public String getID() {
		if(ID.length()==0){
			throw new IllegalArgumentException("La lunghezza dell'ID deve essere maggiore di 0");
		}
		return ID;
	}
	
	public String getDescrizione() {
		if(descrizione.length()<0){
			throw new IllegalArgumentException("La lunghezza della descrizione deve essere maggiore di 0");
		}
		return descrizione;
	}
	
	public int getVeicoliDisponibili() {
		return this.veicoliTotali - ;
	}
	
	public void addNoleggio(Noleggio n){
				
	}
	
	public Vector getNoleggi(){
		return ;
	}
	
}
