package GestionEtudiants;

public class Etudiant {
	public int nce;
	public String nom,prenom;
	public double moyenne;
	public int getNce() {
		return nce;
	}
	public void setNce(int nce) {
		this.nce = nce;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
	public Etudiant(int nce, String nom, double moyenne) {
		this.nce = nce;
		this.nom = nom;
		this.moyenne = moyenne;
	}
	
	public Etudiant (){ }
	
	
	
}
