package br.com.fcamara.service;

import java.util.List;
import java.util.stream.Collectors;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import br.com.fcamara.dao.FilhoDao;
import br.com.fcamara.model.Filho;

@RequestScoped
public class FilhoService {

	@Inject
	FilhoDao dao;

	public List<Filho> listar() {
		return dao.listar().stream().collect(Collectors.toList());
	}

	public Filho buscarFilho(Long id) {
		return dao.buscarFilho(id);
	}

	@Transactional(rollbackOn = Exception.class)
	public void cadastrar(Filho filho) {
		dao.cadastrar(filho);
	}

	@Transactional(rollbackOn = Exception.class)
	public void atualizar(Filho filho) {

		dao.atualizar(filho);
	}

}
