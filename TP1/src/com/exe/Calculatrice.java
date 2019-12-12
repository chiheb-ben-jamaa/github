package com.exe;
import java.util.Scanner;

public class Calculatrice {

	private Double x,y;
	private String op;
	Scanner in;
	Scanner inp;
	
	
	private void input(){
		in = new Scanner(System.in);
		x=in.nextDouble();
		System.out.println(x);
		inp =new Scanner(System.in);
		y=inp.nextDouble();
		System.out.println(y);
			 
	}
	
	private Double input_calcul(){
		Double res=0.0;
		Scanner input_op=new Scanner(System.in);
		//op=input_op.next().charAt(0);
		op=input_op.next();
		System.out.println(op);
		
	switch(op){
		 case "+":
		 {
			 res=x+y;
			 break;
		 }
		case "-":
		{
			res=x-y;
			break;
		}
	
		case "*":
		{
			res=x*y;
			break;
		}
	
		
		case "/":
		{
			res=x/y;
			break;
		}
		
		case "%":
		{
			res=x%y;
			break;
		}
	
	}
	
		return res;
		
		
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatrice c=new Calculatrice();
		c.input();
		System.out.println(c.input_calcul());
		
	}

}
