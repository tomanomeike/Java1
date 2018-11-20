package lt.bt.Testas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MasyvoVidurkis {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\toman\\Desktop\\Java1\\Testas1\\java1\\eclipse-workspace\\Testas2\\res\\txt\\MasyvoTekstas.txt";
		File file = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		int[] array = new int [5]; 
		int i = 0; 
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			array [i] = Integer.parseInt(st);
			i++;
		}
		double sum = 0; 
		for( i = 0; i < array.length; i++){
			sum=sum+array[i];
		}
		System.out.println("suma yra:" + sum);
		double average = sum/array.length;
		System.out.println("vidurkis:" + average );
		
		 int [] newArray = new int [array.length];
		  for (i=0;i<newArray.length;i++) {
			  if(array[i]>average) {
		             newArray[i] = array[i];
		             System.out.println("skaiciai didesni uz vidurki:" + newArray[i]);  
			  }
          } 
		  int [] newSecondArray = new int [array.length];
		  for (i=0;i<newArray.length;i++) {
			  if(array[i]>0) {
		             newArray[i] = array[i];
		             System.out.println("teigiamas skaicius:" + newArray[i]);  
			  }
          }   
	}

}
