package br.com.criandoapi.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data

@Entity
@Table(name="Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@NotBlank(message =" O nome é obrigatório")
	@Column(name="nome", length= 200, nullable = true)
	private String nome;
	
	@Email(message = "Insira um Email Válido")
	@NotBlank(message =" O email é obrigatório")
	@Column(name="email", length= 50, nullable = true)
	private String email;
	
	@NotBlank(message =" A senha é obrigatória")
	@Column(name="senha", columnDefinition ="TEXT", nullable = true)
	private String senha;
	
	@NotBlank(message =" O telefone é obrigatório")
	@Column(name="telefone", length= 15, nullable = true)
	private String telefone;
	
}
