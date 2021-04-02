package br.com.fcamara.dto;


import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

// Por enquanto ResponsavelDto é igual a Responsavel

public class ResponsavelDto implements Serializable {
	
	private Long id;
	
	@NotNull(message="Telefone e obrigatotrio!")
	@NotBlank(message="Nao permitido Telefone vazio!")
	private String telefone;
	
	@NotNull(message="Nome e obrigatorio!")
	@NotBlank(message="Nao permitido nome vazio!")
	private String nome;

	@NotNull(message="Endereço e obrigatorio!")
	@NotBlank(message="Nao permitido endereço vazio!")
	private String endereco;

	private String email;

	
	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
				
}
