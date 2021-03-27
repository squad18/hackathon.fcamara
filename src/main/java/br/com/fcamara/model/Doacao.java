package br.com.fcamara.model;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntity;


@Entity
@Table(name="doacao")
public class Doacao extends PanacheEntity {

	@Column(name="data_status", nullable=false, updatable=false)
	@CreationTimestamp
	private LocalDateTime data_status;

	@Column(name="status")
	private String status;

	@Column(name="agendamento")
	private String agendamento;

	@ManyToOne(optional=false) //optional=false, ou seja é obrigatório! Não há filho sem responsável.
	@JoinColumn(name="responsavel_id", updatable=false)
	private Responsavel responsavel;
	
	@ManyToOne(optional=false) //optional=false, ou seja é obrigatório! Não há filho sem responsável.
	@JoinColumn(name="doador_id", updatable=false)
	private Doador doador;
	
	/* @ManyToOne(optional=false)
	@JoinColumn(name="carro_id", updatable=false)
	private Carro carro;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="cliente_id", updatable=false)
	private Cliente cliente;
	*/
	
	//CONSTRUCTORS
	public Doacao() {
		super();
	}
	public Doacao(Long id) {
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
	public LocalDateTime getData() {
		return data_status;
	}
	public void setData(LocalDateTime data_status) {
		this.data_status = data_status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(String agendamento) {
		this.agendamento = agendamento;
	}
	public Responsavel getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	public Doador getDoadores() {
		return doador;
	}
	public void setDoadores(Doador doadores) {
		this.doador = doadores;
	}
	
}