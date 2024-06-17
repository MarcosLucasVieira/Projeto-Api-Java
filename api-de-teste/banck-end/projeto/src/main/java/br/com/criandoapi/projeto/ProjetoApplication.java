package br.com.criandoapi.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.criandoapi.projeto.model.Usuario;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}
	public Usuario criaUsuario(Usuario usuario) {
		Usuario usuarioNovo = repository.save(usuario)
		return usuarioNovo;
	}
}
