package lt.bt.Testas.PaprastiUzdaviniai;

import java.util.Scanner;

public class Uzduotis4Statybininkas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statybininkas();
	}

	private static void statybininkas() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Sienos ilgis");
	      int length= scanner.nextInt();
	      System.out.println("Sienos aukstis");
	      int height= scanner.nextInt();
	      System.out.println("Plytos kaina");
	      double price= scanner.nextDouble();
	      double area=length*height;
	      System.out.println("Sienos plotas yra:" + area);
	     double plArea=0.2*0.1;
	      double plytu=area/plArea;
	      System.out.println("Plytu kiekis "+Math.round(plytu));
	      double plytuKaina=plytu*price;
	      System.out.println("Plytu kaina "+Math.round(plytuKaina));
	}

}
