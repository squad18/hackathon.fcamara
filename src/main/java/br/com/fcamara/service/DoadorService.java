package br.com.fcamara.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.fcamara.dao.DoadorDao;
import br.com.fcamara.dto.DoadorDto;
import br.com.fcamara.model.Doador;
import br.com.fcamara.model.parser.DoadorParser;

@RequestScoped
public class DoadorService {

    @Inject DoadorDao dao;

    public List<Doador> listar(){
        return dao.listar().stream().collect(Collectors.toList());
    }

    @Transactional
    public void cadastrar(DoadorDto dto){
        Doador doador = DoadorParser.get().entidade(dto);

        dao.cadastrar(doador);
    }
    
}
