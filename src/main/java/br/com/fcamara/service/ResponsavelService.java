package br.com.fcamara.service;


import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javax.transaction.Transactional;

import br.com.fcamara.dao.ResponsavelDao;
import br.com.fcamara.dto.ResponsavelDto;
import br.com.fcamara.exception.ApiException;
import br.com.fcamara.model.Responsavel;
import br.com.fcamara.model.parser.ResponsavelParser;


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

	public void validar(ResponsavelDto responsavelDto) throws ApiException {
		if ( String.valueOf(responsavelDto.getCpf()).length() == 0 || 
				responsavelDto.getEmail().length() == 0 ||
				responsavelDto.getEndereco().length() == 0 ||
				responsavelDto.getNome().length() == 0 
				) {
			throw new ApiException("Preencha TODOS os campos!");
		}
	}

	@Transactional(rollbackOn = Exception.class) 
	public void cadastrar(ResponsavelDto responsavelDto) throws ApiException {
		validar(responsavelDto);
		Responsavel responsavel = ResponsavelParser.get().entidade(responsavelDto);
		
		dao.cadastrar(responsavel);
	}

	@Transactional(rollbackOn = Exception.class) 
	public void atualizar(Responsavel responsavel) {

		dao.atualizar(responsavel);
	}

}
