package com.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.modelo.Pokemon;

@Repository
public class PokemonDAO implements IPokemon{
	
	@Autowired
	private JdbcTemplate template;
	

	@Override
	public List<Pokemon> listar() {
		// TODO Auto-generated method stub
		String sql = "select * from pokemon";
		
		List<Pokemon>pokemones=template.query(sql, new BeanPropertyRowMapper<Pokemon>(Pokemon.class));
		return pokemones;
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
