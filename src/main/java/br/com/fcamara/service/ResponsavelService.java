package br.com.fcamara.service;


import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javax.transaction.Transactional;

import br.com.fcamara.dao.ResponsavelDao;
import br.com.fcamara.model.Responsavel;


@RequestScoped
public class ResponsavelService {
	@Inject
	ResponsavelDao dao;

	public List<Responsavel> listar() {
		return dao
				.listar()
				.stream()
				.collect(Collectors.toList());
	}
	
	public Responsavel buscarResponsavel(Long id) {
		return dao.buscarResponsavel(id);
    }

	
	@Transactional(rollbackOn = Exception.class) 
	public void cadastrar(Responsavel responsavel) {
		dao.cadastrar(responsavel);
	}
	
	@Transactional(rollbackOn = Exception.class) 
	public void atualizar(Responsavel responsavel) {
		
		dao.atualizar(responsavel);
	}
	
}
