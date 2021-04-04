package br.com.fcamara.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;


@Entity
@Table(name="doador")
public class Doador extends PanacheEntity {

	@Column(name="tipo", nullable=false)
	private String tipo;

	@Column(name="nome")
	private String nome;

	@Column(name="telefone")
	private String telefone;

	@Column(name="endereco")
	private String endereco;

	@Column(name="email")
	private String email;
	
	//@OneToMany(mappedBy="doador", cascade=CascadeType.ALL, orphanRemoval=true)
	//private List<Doacao> doacoes;
		  
	
	//CONSTRUCTORS
	public Doador() {
		super();
	}
	public Doador(Long id) {
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
	/*public List<Doacao> getDoacoes() {
		return doacoes;
	}
	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}*/
	
}
