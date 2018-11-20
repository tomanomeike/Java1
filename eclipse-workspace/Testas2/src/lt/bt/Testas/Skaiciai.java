package lt.bt.Testas;

import java.io.IOException;
import java.util.Scanner;


public class Skaiciai {
	public static void main(String[] args) throws IOException {
		skaiciai();
	}
	
	private static void skaiciai() throws IOException{
		Scanner scanner = new Scanner(System.in);
	   	System.out.println("Iveskite skaiciu:");
	   	int number = scanner.nextInt();
	   	String skaiciusZodziu;
    
    switch (number ) {
        case 1:  skaiciusZodziu = "Vienas";
                 break;
        case 2:  skaiciusZodziu = "Du";
                 break;
        case 3:  skaiciusZodziu = "Trys";
                 break;
        case 4: skaiciusZodziu = "Keturi";
                 break;
        case 5: skaiciusZodziu = "Penki";
                 break;
        case 6:  skaiciusZodziu = "Sesi";
                 break;
        case 7:  skaiciusZodziu = "Septyni";
                 break;
        case 8:  skaiciusZodziu= "Astuoni";
                 break;
        case 9: skaiciusZodziu = "Devyni";
                 break;
        case 10: skaiciusZodziu = "Desimt";
                 break;
        default: skaiciusZodziu = "Blogai ivestas skaicius";
                 break;
    }
    System.out.println(skaiciusZodziu);
}
}
