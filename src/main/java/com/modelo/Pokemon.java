package com.modelo;

public class Pokemon {
	 private int id;
	 private String nombre;
	 private String tipo;
	 
	 //constructor vacio
	 public Pokemon () {
			
	 }
	 //metodos gets and sets
	 
	public Pokemon(int id, String nombre, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 
	
	 
	 
	 
}



