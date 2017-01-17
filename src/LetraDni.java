

import java.util.Scanner;

public class LetraDni {

	public static String caracteresDNI="TRWAGMYFPDXBNJZSQVHLCKE";

	public static int pedirDni()
	{
		int dni = 0;
		
		Scanner scdni = null;
		
		scdni = new Scanner(System.in);
		dni = scdni.nextInt();
		
		return dni;
	}
	
	public static void calcularLetraDni(int dni)
	{
		
		int resto_division = 0;
		resto_division = dni % 23;
		
		char letra = caracteresDNI.charAt(resto_division);
		
		System.out.println("La letra correspondiente a este DNI es " + letra);
		
		//System.out.println(dni + letra);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Dime el número del DNI para calcular su letra: ");
		
		int dni = 0;
		dni = pedirDni();
		calcularLetraDni(dni);
		
	}
	
	
}
