package br.com.fcamara.model.parser;

import br.com.fcamara.dto.DoacaoDto;
import br.com.fcamara.model.Doacao;
import br.com.fcamara.model.Doador;
import br.com.fcamara.model.Filho;

public class DoacaoParser {
	
	public static DoacaoParser get(){
        return  new DoacaoParser();
    }

    public DoacaoDto dto(Doacao entidade){
    	DoacaoDto dto = new DoacaoDto();
    	
    	dto.setId(entidade.getId());
    	dto.setAgendamento(entidade.getAgendamento());
    	dto.setDataStatus(entidade.getDataStatus());
    	dto.setIdDoador(entidade.getDoador().getId());
    	dto.setIdFilho(entidade.getFilho().getId());
    	dto.setStatus(entidade.getStatus());
    	
        return dto;
    }
    
    public Doacao entidade(DoacaoDto dto){
    	Doacao entidade = new Doacao();

    	entidade.setId(dto.getId());
    	entidade.setAgendamento(dto.getAgendamento());
    	entidade.setDataStatus(dto.getDataStatus());
    	entidade.setDoador(new Doador(dto.getIdDoador()));
    	entidade.setFilho(new Filho(dto.getIdFilho()));
    	entidade.setStatus(dto.getStatus());
    	
        return entidade;
    }    
    
}