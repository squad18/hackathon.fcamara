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
@Table(name = "doacao")
/*
 * @NamedNativeQueries({
 * 
 * @NamedNativeQuery(name="CONSULTAR_TODO", query = "" +
 * "SELECT id, nome, dataCriacao FROM todo", resultClass = Todo.class),
 * 
 * @NamedNativeQuery(name="INSERIR_TODO", query = "" +
 * "INSERT INTO todo (nome, dataCriacao) values " + "(:nome, :dataCriacao)"),
 * 
 * @NamedNativeQuery(name="EXCLUIR_TODO", query = "DELETE todo WHERE id = :id"),
 * 
 * @NamedNativeQuery(name="CONSULTAR_NOME_REPETIDO_TODO", query = "" +
 * "SELECT id, nome, dataCriacao FROM todo where nome like :nome", resultClass =
 * Todo.class),
 * 
 * @NamedNativeQuery(name="CONSULTAR_TODO_ID", query = "" +
 * "SELECT id, nome, dataCriacao FROM todo where id = :id", resultClass =
 * Todo.class),
 * 
 * @NamedNativeQuery(name="ATUALIZAR_TODO", query="UPDATE todo " +
 * "set nome = :nome, dataCriacao = :dataCriacao WHERE id = :id"), //the next
 * lines are matter of testing pushing a project
 * 
 * @NamedNativeQuery(name="CONSULTAR", query = "" + "SELECT id, nome FROM todo",
 * resultClass = Todo.class), })
 */
public class Doacao extends PanacheEntity {

	@Column(name = "dataStatus", nullable = false, updatable = false)
	@CreationTimestamp
	private LocalDateTime dataStatus;

	@Column(name = "status")
	private String status;

	@Column(name = "agendamento")
	private String agendamento;

	@ManyToOne(optional = false)
	@JoinColumn(name = "filho_id", updatable = false)
	private Filho filho;

	@ManyToOne(optional = false)
	@JoinColumn(name = "doador_id", updatable = false)
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
