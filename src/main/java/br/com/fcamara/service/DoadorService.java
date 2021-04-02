package br.com.fcamara.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.fcamara.dao.DoadorDao;
import br.com.fcamara.dto.DoadorDto;
import br.com.fcamara.exception.ApiException;
import br.com.fcamara.model.Doador;
import br.com.fcamara.model.parser.DoadorParser;

@RequestScoped
public class DoadorService {

    @Inject DoadorDao dao;

    public List<Doador> listar(){
        return dao.listar().stream().collect(Collectors.toList());
    }

    public Doador buscarDoador(Long id){
        return dao.buscarDoador(id);
    }

    public void validar(DoadorDto doadordto) throws ApiException{
        if(doadordto.getTipo().length() == 0){
            throw new ApiException("Você deve escolher entre doação Anônimo ou Identificado!");
        }
        if(doadordto.getTipo().equals("Indentificado") && 
                (doadordto.getNome().length() == 0) ||
                doadordto.getEmail().length() == 0 ||
                doadordto.getEndereco().length() == 0 ||
                doadordto.getTelefone().length() == 0
            ){
            throw new ApiException("Insira todos os dados!");
        }
    }

    @Transactional
    public void cadastrar(DoadorDto dto) throws ApiException{
        validar(dto);
        Doador doador = DoadorParser.get().entidade(dto);
        dao.cadastrar(doador);
    }
    
}
