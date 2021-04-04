package br.com.fcamara.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "filho")
public class Filho extends PanacheEntity { // não tem @ID porque o PanacheEntity toma conta disso

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "escola", nullable = false)
	private String escola;

	@Column(name = "logradouro", nullable = false)
	private String logradouro;

	@Column(name = "cidade", nullable = false)
	private String cidade;

	@Column(name = "estado", nullable = false)
	private String estado;

	@Column(name = "raEscolar", nullable = false)
	private String raEscolar;

	@Column(name = "material")
	private String material;

	@ManyToOne(optional = false) // optional=false, ou seja é obrigatório! Não há filho sem responsável.
	// @JoinColumn(name="responsavel_id", updatable=false)
	private Responsavel responsavel;

	//@OneToMany(mappedBy = "filho", cascade = CascadeType.ALL, orphanRemoval = true)
	//private List<Doacao> doacoes;

	// CONSTRUCTORS
	public Filho() {
		super();
	}

	public Filho(Long id) {
		super();
		this.id = id;
	}

	// GETTERS AND SETTERS
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

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}


}