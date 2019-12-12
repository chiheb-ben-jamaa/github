package com.exe;

import java.util.Scanner;

public class CalculSomme {

	private double fact(double x, int n) {
		int fac = 1;
		double r = 1;

		for (int i = 1; i <= n; i++) {

			fac = fac * i;
			r = r + Math.pow(x, i) / fac;

		}

		return r;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculSomme cal = new CalculSomme();

		System.out.print("Donner x");
		Scanner s = new Scanner(System.in);

		double x = s.nextDouble();
		System.out.println(x);

		int n = s.nextInt();
		System.out.println(n);

		System.out.print(cal.fact(x, n));

	}

}
