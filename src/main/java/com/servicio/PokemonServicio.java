package com.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelo.Pokemon;
import com.modeloDAO.IPokemon;

@Service

public class PokemonServicio implements IPokemonServicio {

	@Autowired
	//variable de la interfaz pokemon
	private IPokemon dao;
	
	
	@Override
	public List<Pokemon> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public Pokemon listPokemonId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int agregar(Pokemon p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int editar(Pokemon p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}



}
