package br.com.fcamara.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class FilhoDto implements Serializable {

	private Long id;

	@NotNull(message = "Id do resposavél é obrigatótrio!")
	@NotBlank(message = "Este campo não pode ser vázio!")
	private Long idResponsavel;

	@NotNull(message = "Nome do aluno é obrigatótrio!")
	@NotBlank(message = "Este campo não pode ser vázio!")
	private String nome;

	@NotNull(message = "Escola do aluno é obrigatótrio!")
	@NotBlank(message = "Este campo não pode ser vázio")
	private String escola;

	@NotNull(message = "Logradouro da escola é obrigatótrio!")
	@NotBlank(message = "Este campo não pode ser vázio!")
	private String logradouro;

	@NotNull(message = "Cidade da escola é obrigatótrio!")
	@NotBlank(message = "Este campo não pode ser vázio!")
	private String cidade;

	@NotNull(message = "Estado da escola é obrigatótrio!")
	@NotBlank(message = "Este campo não pode ser vázio!")
	private String estado;

	@NotNull(message = "RA do aluno é obrigatótrio!")
	@NotBlank(message = "Este campo não pode ser vázio!")
	private String raEscolar;

	@NotNull(message = "Material do aluno é obrigatótrio!")
	@NotBlank(message = "Este campo não pode ser vázio!")
	private String material;

	// GETTERS AND SETTERS
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

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getRaEscolar() {
		return raEscolar;
	}

	public void setRaEscolar(String raEscolar) {
		this.raEscolar = raEscolar;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
