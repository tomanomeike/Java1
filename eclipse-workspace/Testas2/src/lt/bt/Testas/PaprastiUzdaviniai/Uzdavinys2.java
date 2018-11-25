package lt.bt.Testas.PaprastiUzdaviniai;

import java.util.Scanner;

public class Uzdavinys2 {

	public Uzdavinys2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		akvariumas();
	}
	private static void akvariumas(){
	      
		  Scanner scanner = new Scanner(System.in);
	      System.out.println("Kiek zuvu gyvena akvariume?");
	      int zuvys= scanner.nextInt();
	      System.out.println("Kiek zuvu pridedama kasdien?");
	      int prideta= scanner.nextInt();
	      System.out.println("Kiek dienu praejo?");
	      int dienos= scanner.nextInt();

	      int viso=zuvys+prideta*dienos;
	      System.out.println("Po "+ dienos+" dienu gyvena "+viso+ " zuvu");
	
	}
}
