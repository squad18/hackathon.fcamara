package br.com.fcamara.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;

import br.com.fcamara.model.Doador;

@RequestScoped
public class DoadorDao {
    
    public List<Doador> listar() {
        return Doador.listAll(); //retorna uma lista vazia [] se não houver responsáveis
    }

    public Doador buscarDoador(Long id){
        return Doador.findById(id);
    }

    @Transactional
    public void cadastrar(Doador doador){
        doador.persistAndFlush();
    }

}
