package br.com.criandoapi.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

@Entity
@Table(name="Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="nome", length= 200, nullable = true)
	private String nome;
		
	@Column(name="email", length= 50, nullable = true)
	private String email;
	
	@Column(name="senha", columnDefinition ="TEXT", nullable = true)
	private String senha;
	
	@Column(name="telefone", length= 15, nullable = true)
	private String telefone;
	
}
