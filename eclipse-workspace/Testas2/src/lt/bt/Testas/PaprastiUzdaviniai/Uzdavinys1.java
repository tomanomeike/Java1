package lt.bt.Testas.PaprastiUzdaviniai;

import java.util.Scanner;

public class Uzdavinys1 {

	public Uzdavinys1() {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	pamokos();
}
	private static void pamokos() {
		  double pamokosDouble = 0;
	      double minutesDouble = 45;

	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Pirmadienio pamokos:");
	      int pirmadienis = scanner.nextInt();
	      System.out.println("Antradienio pamokos:");
	      int antradienis = scanner.nextInt();
	      System.out.println("Treciadienio pamokos:");
	      int treciadienis = scanner.nextInt();
	      System.out.println("Ketvirtadienio pamokos:");
	      int ketvirtadienis = scanner.nextInt();
	      System.out.println("Penktadienio pamokos:");
	      int penktadienis = scanner.nextInt();
	      pamokosDouble = pirmadienis + antradienis + treciadienis + ketvirtadienis + penktadienis;
	      double visoDouble = pamokosDouble * minutesDouble;
	      System.out.println(visoDouble);
}
}
