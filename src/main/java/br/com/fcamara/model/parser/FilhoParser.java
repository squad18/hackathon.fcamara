package br.com.fcamara.model.parser;

import br.com.fcamara.dto.FilhoDto;
import br.com.fcamara.model.Filho;
import br.com.fcamara.model.Responsavel;

public class FilhoParser {

	public static FilhoParser get() {
		return new FilhoParser();
	}

	public FilhoDto dto(Filho entidade) {
		FilhoDto dto = new FilhoDto();

		dto.setCidade(entidade.getCidade());
		dto.setEscola(entidade.getEscola());
		dto.setEstado(entidade.getEstado());
		dto.setId(entidade.getId());
		dto.setIdResponsavel(entidade.getId());
		dto.setLogradouro(entidade.getLogradouro());
		dto.setMaterial(entidade.getMaterial());
		dto.setNome(entidade.getNome());
		dto.setRaEscolar(entidade.getRaEscolar());

		return dto;
	}

	public Filho entidade(FilhoDto dto) {
		Filho entidade = new Filho();

		entidade.setCidade(dto.getCidade());
		entidade.setEscola(dto.getEscola());
		entidade.setEstado(dto.getEstado());
		entidade.setId(dto.getId());
		entidade.setResponsavel(new Responsavel(dto.getIdResponsavel()));
		entidade.setLogradouro(dto.getLogradouro());
		entidade.setMaterial(dto.getMaterial());
		entidade.setNome(dto.getNome());
		entidade.setRaEscolar(dto.getRaEscolar());

		return entidade;
	}
}
