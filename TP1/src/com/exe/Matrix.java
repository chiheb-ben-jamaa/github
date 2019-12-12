package com.exe;

import java.util.Scanner;

public class Matrix {

	
	
	
	
	
	public static void main(String[] args) {
		
		int NL,NC;
		int mat[][];	
		
		//Donner NL,NC
		Scanner ss=new Scanner(System.in);
		System.out.println("donner NL");
		NL=ss.nextInt();
		System.out.println("donner NC");
		NC=ss.nextInt();
		
		//Remplir Matrix
		mat=new int[NL][NC];
		for (int i=0;i<NL;i++){
			for (int j=0;j<NC;j++){
				System.out.print("donner un entier(M["+i+"]["+j+"]) : ");
				Scanner sc=new Scanner(System.in);
				mat[i][j]=sc.nextInt();
				
			}
			
			
		}

		
	//MIN MAX 
	int i=0;
	while (i<NL){
		
		int min=mat[i][0];
		int max=mat[i][0];
		
			for (int j=1;j<NC;j++){
				if ((mat[i][j]) < (min)){
					min =mat[i][j];
					
				}
				if ((mat[i][j]) > max ){
					max=mat[i][j];
					
				}
			}
			
			i++;
			
			System.out.println("le max de ligne "+i+" est : "+max);
			System.out.println("le min de ligne "+i+" est : "+min);
			
			
		}
		
	}
	
	
	

}
