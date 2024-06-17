package br.com.criandoapi.projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.criandoapi.projeto.model.Usuario;
import br.com.criandoapi.projeto.repository.IUsuario;

@Service
public class UsuarioService {
	
	private IUsuario repository;
	
	public UsuarioService(IUsuario repository) {
		this.repository = repository;
	}
	
	public List<Usuario> listarUsuario(){
		List<Usuario> lista = (List<Usuario>) repository.findAll();
		return lista;
	}
	
	public Optional<Usuario> findUsuarioById(Integer id) {
	    Optional<Usuario> usuario = repository.findById(id);
	    return usuario;
	}
	
	public Usuario criaUsuario(Usuario usuario) {
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
	}
	
	public Usuario editarUsuario(Usuario usuario) {
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
	}
	
	public Boolean excluirUsuario (Integer id) {
		repository.deleteById(id);
		return true;
	}
}
