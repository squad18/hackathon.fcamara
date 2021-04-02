package br.com.fcamara.dto;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.validation.constraints.NotNull;


public class DoacaoDto implements Serializable {//serializable é pq vai ser mandado pro front
	
	private Long id;
	
	@JsonbDateFormat("dd/MM/yyyy HH:mm") // indica que a hora será automaticamente registrada
	private LocalDateTime dataStatus;
	
	@NotNull
	private String status;
	
	private String agendamento;
	
	@NotNull(message="Id do filho é obrigatótrio!")
	private Long idFilho;
	
	@NotNull(message="Id do doador é obrigatótrio!")
	private Long idDoador;

	
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
	public Long getIdFilho() {
		return idFilho;
	}
	public void setIdFilho(Long idFilho) {
		this.idFilho = idFilho;
	}
	public Long getIdDoador() {
		return idDoador;
	}
	public void setIdDoador(Long idDoador) {
		this.idDoador = idDoador;
	}
		
}
