package MainActivity;

import models.*;

public class MainActivity {
	public static void main(String args[]) {
		CompteEpargne alkalyCompteEpargne = new CompteEpargne(2000, "Alkaly", 0.5, 500);
		
		alkalyCompteEpargne.deposer(500);
		alkalyCompteEpargne.consulterSolde();
		
		alkalyCompteEpargne.retirer(1000);
		alkalyCompteEpargne.consulterSolde();
		
		System.out.println("\n");
		System.out.println("Votre interet est de: "+ alkalyCompteEpargne.calculerInterets() + "\n");
	}
}
