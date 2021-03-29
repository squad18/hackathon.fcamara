package br.com.fcamara.dao;


import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;

import br.com.fcamara.model.Responsavel;

import java.util.List;


@RequestScoped
public class ResponsavelDao {

    public List<Responsavel> listar() {
        return Responsavel.listAll(); //retorna uma lista vazia [] se não houver responsáveis
    }
    
    public Responsavel buscarResponsavel(Long id) {
    	return Responsavel.findById(id);
    }
      
    @Transactional
	public void cadastrar(Responsavel responsavel) {
    	responsavel.persistAndFlush();
	}
    
    @Transactional
	public void atualizar(Responsavel responsavel) {
    	
    	
	}
    
    
}
