

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivo3 {
	
	public static void main(String[] args) throws IOException {
		
		File archivo = null;
		archivo = new File ("archivo.txt");
		
		FileReader filereader = new FileReader(archivo);
		
		int a = 0;
		int b = 0;
		
		a = filereader.read();
		
		while (a != -1)
		{
			char c = (char)a;
			b = b + a;
			System.out.print(c);
			a = filereader.read();
		}
		System.out.println("\n" + b);
	}

}
