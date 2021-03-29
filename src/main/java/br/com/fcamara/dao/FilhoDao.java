package br.com.fcamara.dao;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import br.com.fcamara.model.Filho;

@RequestScoped
public class FilhoDao {

	public List<Filho> listar() {
		return Filho.listAll();
	}

	public Filho buscarFilho(Long id) {
		return Filho.findById(id);
	}

	@Transactional
	public void cadastrar(Filho filho) {
		filho.persistAndFlush();
	}

	@Transactional
	public void atualizar(Filho filho) {

	}
}
