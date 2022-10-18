package personnages;

public enum Equipement {
	CASQUE("casque"), BOUCLIER("bouclier");
	
	private String nom;
	
	public String toString() {
		return nom;
	}
	
	private Equipement(String nom) {
		this.nom = nom;
	}
}