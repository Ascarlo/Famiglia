package febbraio;
import java.util.Scanner;
public class ContaPoveri {

	public static void main(String[] args) {
		
		Scanner x = new Scanner (System.in);
		Scanner y = new Scanner (System.in);
		Famiglia oggetto1 = new Famiglia();
		
		//inserimento del numero di famiglie
		System.out.print("inserire il numero di famiglie: ");
		Famiglia vett[] = new Famiglia [x.nextInt()];
		
		//inserimento dei dati nel vettore
		for (int i = 0; i < vett.length; i++) {
			
			System.out.print("inserisci il reddito della famiglia N " + (i+1) + ": ");
			double reddito = x.nextDouble();
			System.out.print("inserisci il numero di persone della famiglia N " + (i+1) + ": ");
			int dimensione = x.nextInt();
			oggetto1 = new Famiglia(reddito, dimensione);
			vett[i] = oggetto1;
		}
		
		//verifica della povertà della famiglia
		for (int i = 0; i < vett.length; i++) {
			
			//inserimento dei dati
			System.out.print("inserisci il costo medio della famiglia  N " + (i+1) + ": ");
			double costoMedio = x.nextDouble();
			System.out.print("inserisci il costo medio del cibo N " + (i+1) + ": ");
			double costoCibo = x.nextDouble();
			
			//cotrollo sulla povertà
			if (oggetto1.Povera(costoMedio, costoCibo)) {
				
				System.out.println("la famiglia è povera");
			}
			else {
				
				System.out.println("la famiglia non è povera");
			}
		}
	}
}