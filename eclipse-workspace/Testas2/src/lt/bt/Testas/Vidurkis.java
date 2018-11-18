package lt.bt.Testas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Vidurkis {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\toman\\Desktop\\Java1\\Testas1\\java1\\eclipse-workspace\\Testas2\\res\\txt\\Vidurkis.txt";
		File file = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st=br.readLine();
		System.out.println(st);
		//System.out.println(st.charAt(1));
		double sum = 0; 
		for(int i=0; i<st.length(); i++){
			sum = sum + Double.valueOf(String.valueOf(st.charAt(i)));
        }
		System.out.println(sum);
		double average = sum/st.length();

		System.out.println(average );
	}
}
