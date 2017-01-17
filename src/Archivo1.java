

import java.io.*;



public class Archivo1 {
	
	public static void main(String[] args) {
		
		File file = null;
		
		file = new File("C:/Users/Administrador.000/Downloads");
		
		boolean existe = file.exists();
		
		if (existe)
		{
			System.out.println("Existe");
			File lista [] = null;
			lista = file.listFiles();
			String archivos = null;
			
			for (int i = 0; i < lista.length; i++)
			{
				
				if (lista[i].isFile())
				{
					archivos = lista[i].getName();
					
					if (archivos.contains("a") || archivos.contains("A"))
					{
						System.out.println(archivos);
					}
				}
			}
		}
		
		else
		{
			System.out.println("No Existe");
		}
		
	}

}
