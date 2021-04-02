package br.com.fcamara.service;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.fcamara.dao.FilhoDao;
import br.com.fcamara.exception.ApiException;
import br.com.fcamara.model.Filho;


@RequestScoped
public class FilhoService {

	@Inject
	FilhoDao dao; // a dao é tipo um repository
		
	public Filho buscarFilho(Long id) {
		return dao.buscarFilho(id);
    } 
	 		
	@Transactional(rollbackOn = Exception.class) 
	public void atualizarMaterial(Long id) throws ApiException {
		Filho filho = buscarFilho(id);
		if ( filho == null ) {
			throw new ApiException("Id do filho fora do sistema!");
		}
		dao.atualizarMaterial(filho);
	}

}
