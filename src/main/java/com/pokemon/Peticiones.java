package com.pokemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Peticiones {
	
	//Metodo para leer API de los pokemones
	public String leerUrl(int a, int b, int numPokemones) {
		
		int totalPokemones = b - a;
	
		try {
			URL url = new URL("https://pokeapi.co/api/v2/pokemon/1");
			 URLConnection conexion = url.openConnection();
	         conexion.connect();
	         
	         // Lectura de los datos
	         InputStream is = conexion.getInputStream();
	         BufferedReader br = new BufferedReader(new InputStreamReader(is));
	         String datos = br.readLine();
	         System.out.println(datos);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Los datos se retornan en formato JSON		
		
	return null ;
			
	}

}


