package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
	public String getNom() {
		return nom;
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public int preparerPotion() {
		Random random_object = new Random();
		while (forcePotion < effetPotionMin) {
			forcePotion = random_object.nextInt(effetPotionMax);
		}
		if (forcePotion > 7) {
			parler("J'ai préparé une super potion de force.");
		}

		else {
			parler("Je n'ai pas trouvé les ingrédients, ma potion est seulement de force" + forcePotion + ".");
		}

		return forcePotion;
	}

	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obélix") {
			parler("Non obélix, tu n'auras pas de potion magique !!");
		}

		else {
			gaulois.boirePotion(forcePotion);
		}
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);

		panoramix.preparerPotion();
	}
}
