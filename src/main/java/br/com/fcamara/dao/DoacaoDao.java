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
		return Doacao.listAll(Sort.by("dataStatus").descending()); //lis retorna [] uma lista vazia se não houver resultado da busca
	}
	
	public Doacao buscarDoacao(Long id) {
		return Doacao.findById(id);
	}

	public List<Doacao> buscarDoacaoPorIdFilho(Long id) { 
		return Doacao.list("filho", Sort.by("dataStatus").descending(), new Filho(id));
	}

	public List<Doacao> buscarDoacaoPorIdDoador(Long id) { 
		return Doacao.list("doador", Sort.by("dataStatus").descending(), new Doador(id));
	}

	@Transactional
	public void cadastrar(Doacao doacao) {
		doacao.persistAndFlush(); //persiste e cria uma id
		//doacao.persist(); //só persiste e não cria a id
	}

	@Transactional
	public void atualizarStatusAceito(Doacao doacao) {
		Long id = doacao.getId();
		
		Doacao.update("status = 'ACEITO' where id = ?1", id);
		
	}
		
	@Transactional
	public void atualizarStatusRejeitado(Doacao doacao) {
		Long id = doacao.getId();
		
		Doacao.update("status = 'REJEITADO' where id = ?1", id);
	}
}

