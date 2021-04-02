package br.com.fcamara.model.parser;

import br.com.fcamara.dto.DoadorDto;
import br.com.fcamara.model.Doador;

public class DoadorParser{
    
    public static DoadorParser get(){
        return new DoadorParser();
    }

    public DoadorDto dto(Doador entidade){
        DoadorDto dto = new DoadorDto();
        
        dto.setTipo(entidade.getTipo());
        dto.setNome(entidade.getNome());
        dto.setEndereco(entidade.getEndereco());
        dto.setEmail(entidade.getEndereco());
        dto.setTelefone(entidade.getTelefone());

        return dto;
    }

    public Doador entidade(DoadorDto dto){
        Doador entidade = new Doador();
         
        entidade.setTipo(dto.getTipo());
        entidade.setNome(dto.getNome());
        entidade.setEndereco(dto.getEndereco());
        entidade.setEmail(dto.getEndereco());
        entidade.setTelefone(dto.getTelefone());

        return entidade;
    }

}
