

public class CadenaFrase {
	
	public static String quitarEspacios(String frase)
	{
		
		int longitud = frase.length();
		
		char letra = 0;
		
		for (int pos = 0; pos < longitud; pos ++)
		{
			letra = frase.charAt(pos);
			
			if (letra != ' ')
			{
				System.out.print(letra);
			}
			
		}
		
		return frase;
	}
	
	public static void main(String[] args) 
	{
			
		String frase = "Hola Mundo Hola";
		
		quitarEspacios(frase);
		
	}

}
