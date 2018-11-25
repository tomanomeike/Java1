package lt.bt.Testas.PaprastiUzdaviniai;

import java.util.Scanner;

public class Uzdavinys4Automobiliai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		automobiliai();
	}
	private static void automobiliai() {
		// TODO Auto-generated constructor stub
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Koks automobilio greitis?");
	      int speed= scanner.nextInt();
	    double road=0.264;
	    double time= speed*road;
	    System.out.println(time);
	}

}
