package lt.bt.Testas;

import java.util.Scanner;

public class Uzduotis2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Iveskite gimimo metus:");
		double birthDate = scanner.nextDouble();
		System.out.println("Iveskite siuos metus:");
		double todayDate = scanner.nextDouble();
		double age = todayDate-birthDate;
		System.out.println("Tavo metai:"+age);
		 if (age > 18.0) {
             System.out.println("Pilnametis");
         } else {
             System.out.println("Nepilnametis");
         }
    }
}
