package lt.bt.Testas.TryCache;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryCache1uzdavinys {
	    public static void main(String[] args) {
	    	printText("Iveskite faila:");
	    	skaitymas();
	     
	}
	    public static void printText(String text) {
	        System.out.println(text);
	    }
	    private static String readFromConsole() {		
			Scanner reader = new Scanner(System.in);
			String el = reader.nextLine();
			return el;
		}
		 private static void skaitymas(){
			 BufferedReader br = null;
				try{
					String filePath = readFromConsole();
					File file = new File(filePath);
					br = new BufferedReader(new FileReader(file));
					String st;
					while ((st = br.readLine()) != null) {
						printText(st);
					}			
				} catch (IOException e){
					printText("Failas neegzistuoja. Iveskite faila:");
					skaitymas();
				} 
			}
	    
}