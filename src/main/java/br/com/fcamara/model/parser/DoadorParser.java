package br.com.fcamara.model.parser;

import br.com.fcamara.dto.DoadorDto;
import br.com.fcamara.model.Doador;

public class DoadorParser{
    
    public static DoadorParser get(){
        return new DoadorParser();
    }

    public DoadorDto dto(Doador entidade){
        DoadorDto dto = new DoadorDto();
         
        dto.setCpf(entidade.getCpf());
        dto.setTipo(entidade.getTipo());
        dto.setNome(entidade.getNome());
        dto.setEndereco(entidade.getEndereco());
        dto.setEmail(entidade.getEndereco());

        return dto;
    }

    public Doador entidade(DoadorDto dto){
        Doador entidade = new Doador();
         
        entidade.setTipo(dto.getTipo());
        entidade.setNome(dto.getNome());
        entidade.setCpf(dto.getCpf());
        entidade.setEndereco(dto.getEndereco());
        entidade.setEmail(dto.getEndereco());

        return entidade;
    }

}
