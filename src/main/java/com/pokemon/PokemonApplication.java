package com.pokemon;



import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PokemonApplication implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate template;

	public static void main(String[] args) {
		SpringApplication.run(PokemonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// Va a crear la tabla dentro de la base de datos h2
		template.execute("DROP TABLE POKEMON IF EXISTS");
		template.execute("CREATE TABLE POKEMON(id INTEGER(11) PRIMARY KEY auto_increment, nombre VARCHAR(255))");
		 Scanner in = new Scanner(System.in);
			int a = 0;
			int b = 0;
			int numPokemon = 0;
			System.out.println("Rango de pokemon");
			a=in.nextInt();
			b=in.nextInt();
			System.out.println("Buscar pokemon por numero:");
			numPokemon = in.nextInt();
			
	     // Obtener todos los pokemones	de todas las generaciones
			
	    // Almacenamiento en la base de datos
		for (int i = 0; i < numPokemon; i++) {
			template.update("insert into pokemon(nombre)values('Pokemon 000"+i+"')");
		}
		
		// Instanciar un objeto de la clase peticiones
		Peticiones url = new Peticiones();
		// Se ejecuta el metodo para leer la url de la API
		url.leerUrl(a, b, numPokemon);
		
	}

}
