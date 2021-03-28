package br.com.fcamara.model.parser;

import br.com.fcamara.dto.DoacaoDto;
import br.com.fcamara.model.Doacao;
import br.com.fcamara.model.Doador;
import br.com.fcamara.model.Responsavel;

public class DoacaoParser {
	
	public static DoacaoParser get(){
        return  new DoacaoParser();
    }

    public DoacaoDto dto(Doacao entidade){
    	DoacaoDto dto = new DoacaoDto();
    	
    	dto.setAgendamento(entidade.getAgendamento());
    	dto.setDataStatus(entidade.getDataStatus());
    	dto.setIdDoador(entidade.getDoador().getId());
    	dto.setIdResponsavel(entidade.getResponsavel().getId());
    	dto.setStatus(entidade.getStatus());
    	
        return dto;
    }
    
    public Doacao entidade(DoacaoDto dto){
    	Doacao entidade = new Doacao();

    	entidade.setAgendamento(dto.getAgendamento());
    	entidade.setDataStatus(dto.getDataStatus());
    	entidade.setDoador(new Doador(dto.getIdDoador()));
    	entidade.setResponsavel(new Responsavel(dto.getIdResponsavel()));
    	entidade.setStatus(dto.getStatus());
    	
        return entidade;
    }    
    
}