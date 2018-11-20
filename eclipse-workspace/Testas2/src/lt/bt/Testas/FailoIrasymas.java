package lt.bt.Testas;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FailoIrasymas {
	public static void main(String[] args) throws IOException {
		FailoIrasymas();
	}
	private static void FailoIrasymas() throws IOException{
		String fileName = "C:\\Users\\toman\\Desktop\\Java1\\Testas1\\java1\\eclipse-workspace\\Testas2\\res\\Text.txt";
		String content = "This is the content to write into file\n";
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		System.out.println("Done");
		bw.close();
		fw.close();
	}
}
