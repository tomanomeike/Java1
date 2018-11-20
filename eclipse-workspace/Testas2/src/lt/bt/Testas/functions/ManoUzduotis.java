package lt.bt.Testas.functions;

import java.util.Scanner;

public class ManoUzduotis {
	public static void main(String args[]){

		Scanner in= new Scanner(System.in);	
		System.out.println("Iveskite pirma skaiciu: ");	
		 double x = in.nextDouble();	
		System.out.println("Iveskite antra skaiciu: ");	
		double y = in.nextDouble();
		System.out.println("Iveskite trecia skaiciu: ");	
		double z = in.nextDouble();
		System.out.print("Maziausias " + smallest(x, y, z)+"\n" );
	}
		public static double smallest(double x, double y, double z) {
			return Math.min(Math.min(x, y), z);	
}
}

