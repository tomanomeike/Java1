package lt.bt.Testas.PaprastiUzdaviniai;

import java.util.Scanner;

public class CikliniaiAlgoritmai {

	public CikliniaiAlgoritmai() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//Konkursas();
		keliasIMokykla();
}
	private static void Konkursas() {
		Scanner scanner = new Scanner(System.in);
	     System.out.println("Iveskite intervalo pradzia");
	     int intervalBeginning= scanner.nextInt();	
	     System.out.println("Iveskite intervalo pabaiga");
	     int intervalEnding= scanner.nextInt();	
	     int happyNumber=0;
	     for(int i = intervalBeginning; i <= intervalEnding; i++) {
	            if(i % 6 == 0) {
	                System.out.println(i);
	                happyNumber++;
	            }
	        }
	        
	        System.out.println("Reikalingu marskineliu skaicius: " + happyNumber );
	}
	private static void keliasIMokykla() {
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Iveskite zingsniu kieki iki mokyklos");
	     int steps= scanner.nextInt();
	     int funnyStep=0;
	     for(int i = 1; i <= steps; i++) {
	            if(i % 10 == 0) {
	                System.out.println(i);
	                funnyStep++;
	            }
	}
	     System.out.println("Suplojimu skaicius: " + funnyStep );
	     for(int j = 1; j <= steps; j++) {
	            if(j % 5 == 0 && !(j % 10 == 0)) {
	                System.out.println(j);
	                funnyStep++;
	            }
	}
	     System.out.println("Spragtelejimu skaicius: " + funnyStep );
	}
}