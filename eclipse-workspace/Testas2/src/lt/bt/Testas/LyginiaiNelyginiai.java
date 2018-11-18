package lt.bt.Testas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LyginiaiNelyginiai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\toman\\Desktop\\Java1\\Testas1\\java1\\eclipse-workspace\\Testas2\\res\\Text.txt";
		File file = new File(filePath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
		br.close();

	}

}
