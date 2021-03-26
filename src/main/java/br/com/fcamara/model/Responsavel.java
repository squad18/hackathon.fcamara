package br.com.fcamara.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;


@Entity
@Table(name="responsavel")
public class Responsavel extends PanacheEntity {

//	@Id
//	private Long id;
	
	@Column(name="cpf", nullable=false)
	private Long cpf;
	
	@Column(name="nome", nullable=false)
	private String nome;

	@Column(name="endereco")
	private String endereco;

	
	//CONSTRUCTORS
	public Responsavel() {
		super();
	}
	public Responsavel(Long id) {
		super();
		this.id = id;
	}

	
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

}
