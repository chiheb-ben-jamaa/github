package com.exe;

class A {
	public A(int coeff) {
		nbre *= coeff;
		nbre += decal;
	}

	public void affiche() {
		System.out.println("nbre = " + nbre + " decal = " + decal);
	}

	private int nbre = 20;
	private int decal;
	
	
	//chaque Ficher (Classe) a un seul classe racine dans un seul ficher 
	public class B {
		
	}
	
	
	
	
	//chaque classe a un seul main a la fois :
	public static void main(String args[]) {
		A a = new A(5);
		a.affiche();
	}

	
	class ChCt 
	//declartion constructeur par defaut:
	//initialisation du attributs final p,x
	//les attributs final il fout declare une seul fois 
	{ 
	
		public ChCt(){}
		public ChCt (float r)  { x = r ; } 
		private float x=0 ;
		private final int n = 10 ;
		private final int p=3 ;  
		
		
	} 
	
	
}
