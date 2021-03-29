package br.com.fcamara.rest;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import br.com.fcamara.dto.DoacaoDto;
import br.com.fcamara.service.DoacaoService;


@Path("doacao")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DoacaoRest {

	@Inject
	DoacaoService service;
	
//	@GET
//    @Operation(summary = "Listar doações.",
//            description = "Listar todas as  doações.")
//    @APIResponse(responseCode = "200",
//            description = "doacao",
//            content = {
//                    @Content(mediaType =  "application/json",
//                            schema = @Schema(implementation = DoacaoDto.class))
//            }
//    )
//    public Response listar() {
//        return Response
//                .status(Response.Status.OK)
//                .entity(service.listar())
//                .build();
//    }
//	
//	
//	
//	@GET
//	@Path("/id/{id}")
//	@Operation(summary = "Histórico das doações.",
//	description = "Buscar doações pelo ID do responsável.")
//	@APIResponse(responseCode = "200",
//	description = "doacao",
//	content = {
//			@Content(mediaType =  "application/json",
//			schema = @Schema(implementation = DoacaoDto.class))
//			}
//	)
//	public Response buscarDoacaoPorCpf(@PathParam("id") Long id) {
//		return Response
//				.status(Response.Status.OK)
//				.entity(service.buscarDoacaoPorIdResponsavel(id))
//				.build();
//	}
		
	@POST
	@Path("")
	@Operation(summary = "Cadastrar uma doação.",
	description = "Cadastrar uma doação: ID do doador, ID do reponsável e agendamento (hora e data).")
	@APIResponse(responseCode = "201",
	description = "doacao",
	content = {
			@Content(mediaType =  "application/json",
			schema = @Schema(implementation = DoacaoDto.class))
			}
	)
	public Response cadastrar(DoacaoDto doacaoDto) {
		service.cadastrar(doacaoDto);
		return Response
				.status(Response.Status.CREATED)
				.build();
	}
	
}
