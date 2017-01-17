

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Archivo2 {
	
	public static String pedirNombreFichero()
	{
		String ruta = null;
		
		Scanner scFichero = null;
		
		scFichero = new Scanner(System.in);
		ruta = scFichero.nextLine();
		
		return ruta;
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Indica el nombre del archivo que quieres crear");
		
		File file = null;
		file = new File("C:/Users/Administrador.000/Desktop/" + pedirNombreFichero());
		
		if (file.exists())
		{
			file.delete();
			System.out.println("El archivo existía y ha sido reemplazado");
		}
		
		if (file.createNewFile())
		{		
			System.out.println("Archivo creado");
		}
		
	}

}
