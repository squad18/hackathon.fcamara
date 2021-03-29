package br.com.fcamara.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;


@Entity
@Table(name="filho")
public class Filho extends PanacheEntity {

	@Column(name="nome", nullable=false)
	private String nome;
	
	@Column(name="escola", nullable=false)
	private String escola;

	@Column(name="endereco_escola", nullable=false)
	private String endereco_escola;

	@Column(name="ra_escolar", nullable=false)
	private String ra_escolar;

	@Column(name="material", nullable=false)
	private String material;

	@ManyToOne(optional=false) //optional=false, ou seja é obrigatório! Não há filho sem responsável.
	@JoinColumn(name="responsavel_id", updatable=false)
	private Responsavel responsavel;
	
	//CONSTRUCTORS
	public Filho() {
		super();
	}
	public Filho(Long id) {
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
	public Responsavel getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
}
