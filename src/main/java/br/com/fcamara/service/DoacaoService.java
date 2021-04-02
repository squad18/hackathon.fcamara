package br.com.fcamara.service;


import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.fcamara.dao.DoacaoDao;
import br.com.fcamara.dto.DoacaoDto;
import br.com.fcamara.exception.ApiException;
import br.com.fcamara.model.Doacao;
import br.com.fcamara.model.Filho;
import br.com.fcamara.model.parser.DoacaoParser;


@RequestScoped
public class DoacaoService { //SERVICE É ONDE FICAM AS VALIDAÇÕES!!!

	@Inject
	DoacaoDao dao; // a dao é tipo um repository

	@Inject
	FilhoService filhoService;

	public List<DoacaoDto> listar() {
		return dao
				.listar()
				.stream()
				.map(DoacaoParser.get()::dto)
				.collect(Collectors.toList());
	}

	//Lista todas as doações que um aluno recebeu pelo seu id 
	public List<DoacaoDto> buscarDoacaoPorIdFilho(Long id) {
		List<Doacao> doacao = dao.buscarDoacaoPorIdFilho(id);

		return doacao
				.stream()
				.map(DoacaoParser.get()::dto)
				.collect(Collectors.toList());

	} 

	public Doacao buscarDoacao(Long id) {
		return dao.buscarDoacao(id);
	}
	
	public void validar(DoacaoDto doacaoDto) throws ApiException { //validar se "material" do filho não é uma string vazia.
		Filho filho = filhoService.buscarFilho(doacaoDto.getIdFilho());
		if ( filho == null ) {
			throw new ApiException("ID do aluno fora do sistema!");
		}	
		if ( filho.getMaterial().length() == 0 ) {
			throw new ApiException("Aluno atualmente não precisa de doações!");
		}
	}

	@Transactional(rollbackOn = Exception.class) 
	public void cadastrar(DoacaoDto doacaoDto) throws ApiException {
		doacaoDto.setStatus("SOLICITADO"); //sempre que se cadastra uma doacao, o status será SOLICITADO
		validar(doacaoDto);

		Doacao doacao = DoacaoParser.get().entidade(doacaoDto);

		dao.cadastrar(doacao);
	}
	
	@Transactional(rollbackOn = Exception.class) 
	public Filho atualizarStatusAceito(Long id) throws ApiException {
		Doacao doacao = buscarDoacao(id);
		if ( doacao == null ) {
			throw new ApiException("ID da doacao fora do sistema!");
		}
		doacao.setStatus("ACEITO");
		
		dao.atualizarStatusAceito(doacao);
		return filhoService.buscarFilho(doacao.getFilho().getId());
		
	}

	@Transactional(rollbackOn = Exception.class)
	public void atualizarStatusRejeitado(Long id) throws ApiException {
		Doacao doacao = buscarDoacao(id);
		if ( doacao == null ) {
			throw new ApiException("ID da doacao fora do sistema!");
		}
		doacao.setStatus("REJEITADO");
		
		dao.atualizarStatusRejeitado(doacao);
		
	}

}
