package br.com.fcamara.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class FilhoDto implements Serializable {
	
	private Long id;
	
	@NotNull(message="Id do resposavél é obrigatótrio!")
	@NotBlank(message="Este campo não pode ser vázio!")
	private Long idResponsavel;

	@NotNull(message="Nome do aluno é obrigatótrio!")
	@NotBlank(message="Este campo não pode ser vázio!")
	private String nome;
	
	@NotNull(message="Escola do aluno é obrigatótrio!")
	@NotBlank(message="Este campo não pode ser vázio")
	private String escola;
	
	@NotNull(message="Endereço da escola é obrigatótrio!")
	@NotBlank(message="Este campo não pode ser vázio!")
	private String endereco_escola;
	
	@NotNull(message="RA do aluno é obrigatótrio!")
	@NotBlank(message="Este campo não pode ser vázio!")
	private String ra_escolar;
	
	@NotNull(message="Material do aluno é obrigatótrio!")
	@NotBlank(message="Este campo não pode ser vázio!")
	private String material;
	
	
	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getEndereco_escola() {
		return endereco_escola;
	}

	public void setEndereco_escola(String endereco_escola) {
		this.endereco_escola = endereco_escola;
	}

	public String getRa_escolar() {
		return ra_escolar;
	}

	public void setRa_escolar(String ra_escolar) {
		this.ra_escolar = ra_escolar;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdResponsavel() {
		return idResponsavel;
	}

	public void setIdResponsavel(Long idResponsavel) {
		this.idResponsavel = idResponsavel;
	}
	
	

}
