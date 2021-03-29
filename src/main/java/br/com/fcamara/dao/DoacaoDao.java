package br.com.fcamara.dao;


import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;

import br.com.fcamara.model.Doacao;
import br.com.fcamara.model.Doador;
import br.com.fcamara.model.Filho;
import io.quarkus.panache.common.Sort;


@RequestScoped
public class DoacaoDao { //é tipo o repository do spring
	
	public List<Doacao> listar() {
        return Doacao.listAll(Sort.by("data"));
    }
		
	public List<Doacao> buscarDoacaoPorIdFilho(Long id) { 
		return Doacao.list("filho", Sort.by("data").descending(), new Filho(id));
    }
	
	public List<Doacao> buscarDoacaoPorIdDoador(Long id) { 
		return Doacao.list("doador", Sort.by("data").descending(), new Doador(id));
    }
		
	@Transactional
	public void cadastrar(Doacao doacao) {
		doacao.persistAndFlush(); //persiste e cria uma id
		//doacao.persit(); só persiste e não cria a id
	}
	
}

