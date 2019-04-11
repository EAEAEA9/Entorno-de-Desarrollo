package es.studium.ComparaCadena;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ComparaCadena
{
	//Excepciones para inputstreamreader 
	public static void main(String[]args)throws IOException 
	{
		//Usando las clases BufferedReader y InputStreamReader para la entrada de datos
		//System.in se refiere al teclado
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		
		//Declaracion de variables
		String cadena1,cadena2;
		int c1,c2;
		//Pedir al usuario la primera cadena
		System.out.println("Indique una cadena");
		
		//Leer los datos del usuario
		cadena1=(lectura.readLine());
		
		//Pedir al usuario la segunda cadena
		System.out.println("Indique otra cadena");
		
		//Leer los datos del usuario
		cadena2=(lectura.readLine());
		
		//El metodo length de String devuelve la longitud de una cadena y declaramos nuevas variables c1 y c2 para introducir el resultado
		
		c1= cadena1.length();
		c2= cadena2.length();	
		
		//Comparacion de cadenas
		if(c1>c2)
		{
			System.out.println("La cadena 1es mayor que la cadena2");

		}
		else if(c1==c2)
		{
			System.out.println("Las cadenas son iguales de longitude");
		}
		else
		{
			System.out.println("La cadena 2 es mayor que la cadena 1");
		}
	}
}
