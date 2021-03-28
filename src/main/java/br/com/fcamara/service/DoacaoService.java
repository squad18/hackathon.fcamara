package br.com.fcamara.service;


import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.NotAllowedException;

import br.com.fcamara.dao.DoacaoDao;
import br.com.fcamara.dto.DoacaoDto;
import br.com.fcamara.model.Doacao;
import br.com.fcamara.model.parser.DoacaoParser;


@RequestScoped
public class DoacaoService {

	@Inject
	DoacaoDao dao;
	
	@Inject
	ResponsavelService responsavelService;
	
	public List<DoacaoDto> listar() {
        return dao.listar().stream().map(DoacaoParser.get()::dto).collect(Collectors.toList());
    }
	
	//Lista todas as doações que um responsavel recebeu pelo seu id 
	public List<DoacaoDto> buscarDoacaoPorIdResponsavel(Long id) {
		List<Doacao> doacao = dao.buscarDoacaoPorIdResponsavel(id);
		
		return doacao
				.stream()
				.map(DoacaoParser.get()::dto)
				.collect(Collectors.toList());

    } 
		
	public void validar(DoacaoDto doacaoDto) {	
		if ( responsavelService.buscarResponsavel(doacaoDto.getIdResponsavel()) == null ) {
			throw new NotAllowedException("ID de responsável fora do sistema!");
		} 
		
	}
	 	
	@Transactional(rollbackOn = Exception.class) 
	public void cadastrar(DoacaoDto doacaoDto) {
		doacaoDto.setStatus("SOLICITADO"); //sempre que insere um doacao, o status será SOLICITADO
		validar(doacaoDto);
		
		Doacao doacao = DoacaoParser.get().entidade(doacaoDto);
		
		dao.cadastrar(doacao);
	}
	
}
