package br.com.fcamara.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;


@Entity
@Table(name="responsavel")
public class Responsavel extends PanacheEntity {
	
	@Column(name="telefone", nullable=false)
	private String telefone;
	
	@Column(name="nome", nullable=false)
	private String nome;

	@Column(name="endereco", nullable=false)
	private String endereco;

	@Column(name="email")
	private String email;
	
//	@OneToMany(mappedBy="responsavel", cascade=CascadeType.ALL, orphanRemoval=true)
//	private List<Filho> filhos;
		
	
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
//	public List<Filho> getFilhos() {
//		return filhos;
//	}
//	public void setFilhos(List<Filho> filhos) {
//		this.filhos = filhos;
//	}	
	
}
