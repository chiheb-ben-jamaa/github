package com.exe;

import java.util.Scanner;



	
	import java.util.Scanner;

	public class Drapeau {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String tab[];
			tab=new String[4];
			int choix;
			Scanner sc = new Scanner(System.in);
			for(int i=0; i<tab.length;i++)
			{
				do
				{
				System.out.print("tab["+i+"] : ");
				System.out.print("choisi un coleur :");
				System.out.print("1-Rouge");
				System.out.print("2-Jaune");
				System.out.print("3-Noir");
				choix=sc.nextInt();
				}
				while((choix<1)||(choix>3));
				
				if(choix==1)
				{
					tab[i]="rouge";
				}
				else if(choix==2)
				{
					tab[i]="jaune";
				}
				else if(choix==3)
				{
					tab[i]="noir";
				}
			}
			
		
		int deb=0;
			int fin=tab.length-1;
			int i=0;
			while (i<=fin && deb<=fin){
				if (tab[i].equals("rouge")) {
					String coleur = tab[deb];
					tab[deb] = tab[i];
					tab[i] = coleur;
					deb++;
					i++;
				} else if (tab[i].equals("noir")) {
					String coleur = tab[fin];
					tab[fin] = tab[i];
					tab[i] = coleur;
					fin--;
				} else
				{
					i++;
				}
				i++;
			}
			
	
		
			for(int j=0;j<tab.length;j++)
			{
				System.out.println("tab["+j+"] : ");
				System.out.println(tab[j]);
			}
			

			
			
		}

	}

