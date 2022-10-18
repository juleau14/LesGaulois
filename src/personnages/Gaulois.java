package personnages;


public class Gaulois  { 
	private String nom;
	private int effetPotion = 1; 
	private int force, nbTrophees;
	private Equipement Trophees[] = new Equipement[100];
	
	public Gaulois(String nom, int force) { 
		this.nom = nom; 
		this.force = force; 
	} 

	public String getNom() { 
		return nom; 
	} 

	public void parler(String texte) { 
		System.out.println(prendreParole() + "� " + texte + "�"); 
	} 

//	private String prendreParole() { 
//		return "Le gaulois " + nom + " :"; 
//	} 
	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

//	public void frapper(Romain romain) { 
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom()); 
//		romain.recevoirCoup((force / 3) * effetPotion); 
//	} 


	 public void frapper(Romain romain) { 
		 System.out.println(nom  +  "  envoie  un  grand  coup  dans  la m�choire de " + romain.getNom()); 
		 Equipement  trophees[]  =  romain.recevoirCoup((force  /  3)  * effetPotion); 
		 for  (int  i  =  0;  trophees  !=  null  &&  i  <  trophees.length;  i++, nbTrophees++) { 
			 this.trophees[nbTrophees] = trophees[i]; 
		 } 
		 
		 return; 
	 } 

	public String toString() { 
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]"; 
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci druide, je sens que ma force est " + effetPotion + " fois décuplée");
	}

	public static void main(String[] args) { 
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Je parle pour ne rien dire.");
		asterix.boirePotion(5);
		asterix.frapper(minus);
	} 

}





