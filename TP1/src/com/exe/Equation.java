package com.exe;

public class Equation {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
    
       int b=3;
      
       int c=0;
       double delta;
       
   	if(a==0)
	{
		if(b==0)
		{
			if(c==0)
			{
				System.out.println("infinité de solution !");
			}
			else 
			{ 
				System.out.println("n'admet pas de solution !");
			}
			
		}
		else
		{
			double x=-c/a;
		}
	}
   	else
	{
			delta=(b*b)-(4*(a*c));
			if (delta>0)
			{
				double x1= (-b-Math.sqrt(delta))/2*a;
				double 	x2= (-b+Math.sqrt(delta))/2*a;
				System.out.println(x1);
				System.out.println(x2);
			}
			
			if(delta==0)
			{    
	            double x=(-b/(2*a));
		    }
			if(delta<0)
			{
				System.out.println("pas de solution pour l'equation !");
			}
	}
   	
}
		
	}
	
	

