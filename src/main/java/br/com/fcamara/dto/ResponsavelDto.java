package br.com.fcamara.dto;


import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



public class ResponsavelDto implements Serializable {
	
	private Long id;
	
	@NotNull(message="CPF é obrigatótrio!")
	@NotBlank(message="Nao permitido CPF vazio!")
	private Long cpf;
	
	@NotNull(message="Nome é obrigatótrio!")
	@NotBlank(message="Nao permitido nome vazio!")
	private String nome;

	@NotNull(message="Endereço é obrigatótrio!")
	@NotBlank(message="Nao permitido endereço vazio!")
	private String endereco;

	@NotNull(message="Email é obrigatótrio!")
	@NotBlank(message="Nao permitido email vazio!")
	private String email;

	
	//GETTERS AND SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
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
