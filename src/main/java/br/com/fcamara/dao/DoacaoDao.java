package br.com.fcamara.dao;


import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;

import br.com.fcamara.model.Doacao;
import br.com.fcamara.model.Doador;
import br.com.fcamara.model.Responsavel;
import io.quarkus.panache.common.Sort;


@RequestScoped
public class DoacaoDao {
	
	public List<Doacao> listar() {
        return Doacao.listAll(Sort.by("data"));
    }
		
	public List<Doacao> buscarDoacaoPorIdResponsavel(Long id) { 
		return Doacao.list("responsavel", Sort.by("data").descending(), new Responsavel(id));
    } 
	
	public List<Doacao> buscarDoacaoPorCpf(Long id) {
		return Doacao.list("doador", Sort.by("data").descending(), new Doador(id));
    }
	
	@Transactional
	public void cadastrar(Doacao doacao) {
		doacao.persistAndFlush();	
	}
	
}

