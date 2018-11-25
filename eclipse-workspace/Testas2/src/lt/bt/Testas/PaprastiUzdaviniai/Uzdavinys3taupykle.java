package lt.bt.Testas.PaprastiUzdaviniai;

import java.util.Scanner;

public class Uzdavinys3taupykle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taupykle();
	}
	private static void taupykle(){
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Kiek monetu po 5 ct?");
	      int five= scanner.nextInt();
	      System.out.println("Kiek monetu po 20 ct?");
	      int twenty= scanner.nextInt();
	      System.out.println("Kiek monetu po 2 Lt");
	      int two= scanner.nextInt();
	   double viso=(five*0.05)+(twenty*0.20)+(two*2);
	   System.out.println("Taupykleje yra"+ viso+ " Lt");
}
}