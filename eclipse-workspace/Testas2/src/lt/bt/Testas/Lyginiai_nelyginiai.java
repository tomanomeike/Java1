package lt.bt.Testas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lyginiai_nelyginiai {

		public static void main(String[] args) throws IOException {
			lyginiaiNelyginiai();
		}
		 private static void lyginiaiNelyginiai()throws IOException{
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
}

