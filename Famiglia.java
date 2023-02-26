package febbraio;

public class Famiglia {

	private double Reddito;
	private int Dimensione;
	
	//costruttori
	public Famiglia() {
		
	}
	public Famiglia(double reddito, int dimensione) {
		
		Reddito = reddito;
		Dimensione = dimensione;
	}
	
	//metodi get e set
	public double getReddito() {
		return Reddito;
	}
	
	public void setReddito(double reddito) {
		Reddito = reddito;
	}
	
	public int getDimensione() {
		return Dimensione;
	}
	
	public void setDimensione(int dimensione) {
		Dimensione = dimensione;
	}

	//metodo toString
	public String toString() {
		return "Reddito: " + Reddito + "\nDimensione: " + Dimensione;
	}
	
	//metodo booleano, restituisce true se la famiglia è povera
	public boolean Povera(double costoMedio, double costoCibo) {
		
		if(costoMedio + (costoCibo * Dimensione) > Reddito/2) {
			
			return true;
		}
		else {
			
			return false;
		}
		
	}
}