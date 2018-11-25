package lt.bt.Testas.PaprastiUzdaviniai;

import java.util.Scanner;

public class Uzduotis5puodeliuPakavimas {

	public Uzduotis5puodeliuPakavimas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//puodeliuSkaiciavimas();
		//gimtadienis();
		//parasiutininkas();
		//varles();
		//matematika();
		//bandeles();
		//JonukoProblema();
		//Skaiciai();
		
		
	}
	private static void puodeliuSkaiciavimas() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Kiek puodeliu reikia supakuoti");
	      int cups= scanner.nextInt();
	      int box=cups/3;
	      System.out.println("Supakuota dezuciu " +box);
	      int likePuodeliai=cups%3;
	      System.out.println("Like nesupakuoti puodeliai " +likePuodeliai);
	      
	}
	private static void gimtadienis() {
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Kiek sausainiu iskepe Tautvydas: ");
	      int cookies= scanner.nextInt();
	      System.out.println("Kiek draugu atsnese sausainiu: ");
	      int friends= scanner.nextInt();
	      int sum =( cookies*friends)+cookies;
	      System.out.println("Kiek is viso dalyvavo zmoniu: ");
	      int people= scanner.nextInt();
	      int cookieForPerson=sum/people;
	      System.out.println("Sventes dalyvis gavo: " + cookieForPerson);
	      System.out.println("Tautvydui lieka: " + sum%people);  
	}
	private static void parasiutininkas() {
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Is kokio auskcio soka? ");
	     double aukstis= scanner.nextDouble(); 
	      System.out.println("Per kiek sekundziu issiskleidzia parašiutas? ? ");
	      double laikas= scanner.nextDouble();
	      double parachuteTime=Math.sqrt(2*aukstis/9.8);
	      //System.out.println(parachuteTime); 
	      if(laikas<parachuteTime) {
	    	  System.out.println("Issiskleis");  
	      }
	      else {
	    	  System.out.println("Neissiskleis"); 
	      }
	}
	private static void varles() {
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Kiek sveria varle? ");
	      double weight= scanner.nextDouble();
	      System.out.println("Kiek varliu norima stebeti? ");
	      double frogNumber= scanner.nextDouble();
	      double frogWeight=weight*frogNumber/1000;
	      System.out.println("Varliu svoris: " + frogWeight+ " kg ");
	      if(frogWeight>=5) {
	    	  System.out.println("Varliu stebejimui pakanka");  
	      }
	      else {
	    	  System.out.println("Varliu stebejimui nepakanka"); 
	      }
	}
	private static void matematika() {
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Kokius pazymius gavo Petriukas? ");
	      double grade1= scanner.nextDouble();
	      double grade2= scanner.nextDouble();
	      double grade3= scanner.nextDouble();
	      double grade4= scanner.nextDouble();
	      double grade5= scanner.nextDouble();
	      double average= (grade1+grade2+grade3+grade4+grade5)/5;
	      if (average>=9) {
	    	  System.out.println("Gaus tris saldainius"); 
	      }
	      else if(average<=9 && average>=7 ){
	    	  System.out.println("Gaus du saldainius"); 
	      }
	      else {
		System.out.println("Gaus viena saldaini"); 
	      }
}
	private static void bandeles() {
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Iveskite kainas a ir b ");
	      double a= scanner.nextDouble();
	      double b= scanner.nextDouble();
	      System.out.println("Iveskite kiekius n1, n2 ir n3");
	      double n1= scanner.nextDouble();
	      double n2= scanner.nextDouble();
	      double n3= scanner.nextDouble();
	      System.out.println("Iveskite bandeles kaina");
	      double k= scanner.nextDouble();
	      double sum=0;
	      
	      if (k<=a) {
	    	 sum=k*n1;
	      }
	      else if(k>a && k<b) {
	    	  sum=k*n2;
	      }
	      else if (k>=b) {
	    	  sum=k*n3;
	    	  
	      }
	      sum = sum * 100;
	        sum = Math.round(sum);
	        sum = sum / 100;
	        System.out.println("Uz bandeles sumoketa  " + sum);
}
	private static void JonukoProblema() {
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Iveskite uzduoties numeri");
	      double taskNumber= scanner.nextDouble();
	      if(taskNumber==1 || taskNumber==2 || taskNumber==3) {
	    	  System.out.println("Iveskite a reiksme");
		      double aNumber= scanner.nextDouble();
		      System.out.println("Iveskite b reiksme");
		      double bNumber= scanner.nextDouble();
		      if(taskNumber==1) {
		    	  double answer1=aNumber*bNumber+3;
		    	  System.out.println(answer1);
		      }
		      else if(taskNumber==2) {
		    	  double answer2=aNumber+bNumber;
		    	  System.out.println(answer2);
		      }
		      else if(taskNumber==3) {
		    	  double answer3=aNumber-bNumber;
		    	  System.out.println(answer3);
		      }  
	      }
	     
	      else {
	    	  System.out.println("Blogai ivestas skaicius");
	}
}
	
	private static void Skaiciai() {
		Scanner scanner = new Scanner(System.in);
	      System.out.println("Iveskite a reiksme");
	      double aNumber= scanner.nextDouble();	
	      System.out.println("Iveskite b reiksme");
	      double bNumber= scanner.nextDouble();	
	      System.out.println("Iveskite c reiksme");
	      double cNumber= scanner.nextDouble();	
	      if(aNumber%3==0) {
	    	  System.out.println(aNumber);
	      }
	      else if(bNumber%3==0){
	    	  System.out.println(bNumber);
	      }
	      else if(cNumber%3==0){
	    	  System.out.println(cNumber);
	      } 
	      else {
	    	  System.out.println("nera"); 
	      }
	}

}
	
	
