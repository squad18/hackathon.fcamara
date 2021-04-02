package br.com.fcamara.model.parser;

import br.com.fcamara.dto.ResponsavelDto;
import br.com.fcamara.model.Responsavel;

public class ResponsavelParser {
	
	public static ResponsavelParser get(){
        return  new ResponsavelParser();
    }

    public ResponsavelDto dto(Responsavel entidade){
    	ResponsavelDto dto = new ResponsavelDto();
    	
    	dto.setTelefone(entidade.getTelefone());
    	dto.setEmail(entidade.getEmail());
    	dto.setEndereco(entidade.getEndereco());
    	dto.setNome(entidade.getNome());
    	
        return dto;
    }
    
    public Responsavel entidade(ResponsavelDto dto){
    	Responsavel entidade = new Responsavel();

    	entidade.setTelefone(dto.getTelefone());
    	entidade.setEmail(dto.getEmail());
    	entidade.setEndereco(dto.getEndereco());
    	entidade.setNome(dto.getNome());
    	
        return entidade;
    }    
    
}