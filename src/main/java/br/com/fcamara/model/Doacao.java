package br.com.fcamara.model;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;


@Entity
@Table(name="doacao")
public class Doacao extends PanacheEntityBase {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="dataStatus", nullable=false, updatable=false)
	@CreationTimestamp
	private LocalDateTime dataStatus;

	@Column(name="status")
	private String status;

	@Column(name="agendamento")
	private String agendamento;

	@ManyToOne(optional=false)
	@JoinColumn(name="filho_id", updatable=false)
	private Filho filho;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="doador_id", updatable=false)
	private Doador doador;
		
	
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
	public LocalDateTime getDataStatus() {
		return dataStatus;
	}
	public void setDataStatus(LocalDateTime dataStatus) {
		this.dataStatus = dataStatus;
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
	public Filho getFilho() {
		return filho;
	}
	public void setFilho(Filho filho) {
		this.filho = filho;
	}
	public Doador getDoador() {
		return doador;
	}
	public void setDoador(Doador doador) {
		this.doador = doador;
	}
	
}
