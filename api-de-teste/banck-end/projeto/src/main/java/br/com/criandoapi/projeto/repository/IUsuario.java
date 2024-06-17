package br.com.criandoapi.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.criandoapi.projeto.model.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer>{
		
}
