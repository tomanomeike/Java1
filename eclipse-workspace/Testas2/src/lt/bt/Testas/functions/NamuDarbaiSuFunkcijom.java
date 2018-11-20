package lt.bt.Testas.functions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NamuDarbaiSuFunkcijom  {
		
    	public static void main(String args[])throws IOException {
    		//nuo1iki100();
    		//nuo1iki100while();
    		//nuo1iki100();
    		//lyginiaiNelyginiai();
    		 skaiciaiZodziu();
    	}	
//nuo iki 100
    	private static void nuo1iki100(){
    		for (int i=1; i<=100; i++) {
    			System.out.print(i +", ");						
    			}
    	}
    	//nuo iki 100 while ciklas
    	private static void nuo1iki100while(){
            int i=1;
            while(i<=100){
                 System.out.print(i+", ");
                 i++;
            }
            
    }
    	//nuo iki 100 do-while ciklas
    	private static void nuo1iki100do(){
            int i=1;
            do{
                 System.out.println(i);
                 i++;
            }while(i<=100);
       }
    	
    	//lyginiai-nelyginiai
    	private static lyginiaiNelyginiai() throws IOException {
			String filePath = "C:\\Users\\toman\\Desktop\\Java1\\Testas1\\java1\\eclipse-workspace\\Testas2\\res\\txt\\Vidurkis.txt";
			File file = new File(filePath);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st=br.readLine();
			System.out.println(st);
			//System.out.println(st.charAt(1));
			int num; 
			for(int i=0; i<st.length(); i++){
				if((Double.valueOf(String.valueOf(st.charAt(i)))%2)==0)
					System.out.println("even");
					else
						System.out.println("odd");
	        }
		}
    	public static void skaiciaiZodziu(String[] args) {
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
    	
