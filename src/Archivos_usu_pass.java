

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Archivos_usu_pass {
	
	public static String pedirUsuario()
	{
		String usuario = null;
		
		Scanner scusuario = null;
		
		scusuario = new Scanner(System.in);
		usuario = scusuario.nextLine();
		
		return usuario;
	}
	
	public static String pedirPassword()
	{
		String password = null;
		
		Scanner scpassword = null;
		
		scpassword = new Scanner(System.in);
		password = scpassword.nextLine();
		
		return password;
	}
	
	public static String ficheroUsuario (File archivo)
	{
		String usuario_archivo = null;
		
		FileReader filereader = null;
		BufferedReader br = null;
		
		try
		{
			filereader = new FileReader(archivo);
			br = new BufferedReader(filereader);
			
			usuario_archivo = br.readLine();
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
		

		return usuario_archivo; 
	
	}
	
	public static String ficheroPassword (File archivo2)
	{
		String password_archivo = null;
		
		FileReader filereader = null;
		BufferedReader br = null;
		
		try
		{
			filereader = new FileReader(archivo2);
			br = new BufferedReader(filereader);
			
			password_archivo = br.readLine();
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
		

		return password_archivo; 
	
	}
	
	public static void main(String[] args) {
		System.out.println("Introduce tu usuario y contraseña:");
		System.out.println("Usuario: ");
		String usuario = pedirUsuario();
		System.out.println("Contraseña: ");
		String password = pedirPassword();
		
		File archivo = new File ("usuario");
		String usuario_archivo = ficheroUsuario(archivo);
		
		File archivo2 = new File ("password");
		String password_archivo = ficheroUsuario(archivo2);
		

		if (usuario.equals(usuario_archivo) && password.equals(password_archivo))
		{
			System.out.println("Usuario y password correctos");
		}
		
		else
		{
			System.out.println("Usuario o password incorrectos");
		}
		
	}

}
