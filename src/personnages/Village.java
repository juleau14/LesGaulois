package personnages;

public class Village {
	private String nom; 
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	 
	private Chef chef; 
	 
	public Village(String nom, int nbVillageoisMaximum) { 
		this.nom = nom; 
		this.villageois = new Gaulois[nbVillageoisMaximum];
	} 
	 
	public void setChef(Chef chef) { 
		this.chef = chef; 
	} 
	 
	public String getNom() { 
		return nom; 
	}
	
	public String getChef() {
		return chef.getNom();
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		this.villageois[this.nbVillageois] = gaulois;
		this.nbVillageois += 1;
	}

	public Gaulois trouverHabitant(int num) {
		return villageois[num];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + getChef() + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irreductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30); le tableau a 30 places donc la case d'indice 30 n'existe pas
		Chef Abraracourcix = new Chef("Abraracourcix", 6, 1, village);
		village.setChef(Abraracourcix);
		Gaulois Asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(Asterix);
		Gaulois Obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(Obelix);
//		Gaulois gaulois = village.trouverHabitant(1);  
//		System.out.println(gaulois); Renvoie null car un objet ne peut pas etre affiché 
		village.afficherVillageois();
	}
}