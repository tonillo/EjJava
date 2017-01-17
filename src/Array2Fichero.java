

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Array2Fichero {
	
	private static int cuentaLineas (File archivo) throws IOException
	{
		int cuenta_num_lineas = 0;
		
			FileReader filereader = null;
			BufferedReader br = null;
		
			filereader = new FileReader(archivo);
			br = new BufferedReader(filereader);
			
			while (br.readLine() != null)
			{
				cuenta_num_lineas = cuenta_num_lineas + 1;
			}
			
			br.close();
			filereader.close();
		
		return cuenta_num_lineas;
	}

	public static String[] fromFichero2Array (File archivo)
	{
		String[] lista_cadena = null;
		
		FileReader filereader = null;
		BufferedReader br = null;
		
		try
		{
			filereader = new FileReader(archivo);
			br = new BufferedReader(filereader);
			
			int num_lineas = cuentaLineas(archivo);
			lista_cadena = new String [num_lineas];
			int posicion = 0;
			
			String linea = br.readLine();
			while(linea!=null)
			{
				lista_cadena[posicion] = linea;
				posicion = posicion + 1;
	            linea = br.readLine();
			}
			
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("Error al crear el FileReader");
			e.printStackTrace();
		}
		
		catch (IOException io)
		{
			System.out.println("Error al leer el FileReader");
			io.printStackTrace();
		}
		
		finally
		{
			try
			{
				br.close();
				filereader.close();
			}
			
			catch (Exception e2)
			{
				System.out.println("Error liberando recursos");
				e2.printStackTrace();
			}
		}
		
		
		
		return lista_cadena; 
	}
	
	
	public static boolean fromArray2Fichero (String [] lista_cadena)
	{
		boolean ok = true;
		
		FileWriter filewriter = null;
		BufferedWriter bw = null;
		
		try
		{
			filewriter = new FileWriter("salida");
			bw = new BufferedWriter(filewriter);
			
			int i = 0;
			int longitud = lista_cadena.length - 1;
			
			for (String cadena : lista_cadena)
			{
				bw.write(cadena);
				
				if (i < longitud)
				{
					bw.newLine();
				}
				
				i++;
			}
		}	
		
		catch (IOException e)
		{
			System.out.println("Error al crear FileWriter");
			e.printStackTrace();
			ok = false;
		}
		
		finally
		{
			try
			{
				bw.close();
				filewriter.close();
			}
			
			catch (Exception e2)
			{
				System.out.println("Error liberando recursos");
				e2.printStackTrace();
				ok = false;
			}
		}
		
		return ok;
	}
	
	public static void main(String[] args)
	{
		File archivo = new File ("archivo.txt");
		String [] array_lista = fromFichero2Array(archivo);
				
		for (String cad : array_lista)
		{
			System.out.println(cad);
		}
		
		
		if (fromArray2Fichero(array_lista))
		{
			System.out.println("Escribir OK");
		}
		
		else
		{
			System.out.println("Escribir KO");
		}
	}

}
