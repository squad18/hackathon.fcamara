package br.com.fcamara.model.parser;

import br.com.fcamara.dto.FilhoDto;
import br.com.fcamara.model.Filho;

public class FilhoParser {

	public static FilhoParser get() {
		return new FilhoParser();
	}

	public FilhoDto dto(Filho entidade) {
		FilhoDto dto = new FilhoDto();

		dto.setNome(entidade.getNome());
		dto.setEscola(entidade.getEscola());
		dto.setEndereco_escola(entidade.getEndereco_escola());
		dto.setRa_escolar(entidade.getRa_escolar());
		dto.setMaterial(entidade.getMaterial());

		return dto;
	}

	public Filho entidade(FilhoDto dto) {
		Filho entidade = new Filho();

		entidade.setNome(dto.getNome());
		entidade.setEscola(dto.getEscola());
		entidade.setEndereco_escola(dto.getEndereco_escola());
		entidade.setRa_escolar(dto.getRa_escolar());

		return entidade;
	}
}
