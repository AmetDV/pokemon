package com.servicio;

import java.util.List;

import com.modelo.Pokemon;

public interface IPokemonServicio {
	public List<Pokemon>listar();
	public Pokemon listPokemonId(int id);
	public int agregar(Pokemon p);
	public int editar(Pokemon p);
	public void eliminar(int id);
}
