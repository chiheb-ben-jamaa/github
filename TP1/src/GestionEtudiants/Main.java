package GestionEtudiants;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant e1=new Etudiant(1,"ahmed",12.3);
		
		Etudiant e2=new Etudiant();
		Etudiant e3=new Etudiant();
		
		e2.setNce(1);
		e2.setNom("ali");
		e2.setMoyenne(14);
		e3.setNce(1);
		e3.setNom("mohamed");
		e3.setMoyenne(15.6);
		
		System.out.println("cne "+e1.getNce()+" nom "+e1.getNom()+" moyenne "+e1.getMoyenne());
		System.out.println("cne "+e2.getNce()+" nom "+e2.getNom()+" moyenne "+e2.getMoyenne());	
		System.out.println("cne "+e3.getNce()+" nom "+e3.getNom()+" moyenne "+e3.getMoyenne());
		
	}
	
}
