package br.com.fcamara.rest;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import br.com.fcamara.dto.DoacaoDto;
import br.com.fcamara.exception.ApiException;
import br.com.fcamara.model.Filho;
import br.com.fcamara.service.DoacaoService;
//import br.com.fcamara.service.FilhoService;


@Path("doacao")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DoacaoRest {

	/*@Inject 
	DoacaoService service;
	
	@Inject 
	FilhoService filhoService;
	
	
	@GET
    @Operation(summary = "Listar doações.",
            description = "Listar todas as doações.")
    @APIResponse(responseCode = "200",
            description = "doacao",
            content = {
                    @Content(mediaType =  "application/json",
                            schema = @Schema(implementation = DoacaoDto.class))
            }
    )
    public Response listar() {
        return Response
                .status(Response.Status.OK)
                .entity(service.listar())
                .build();
    }

	
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
	description = "Cadastrar uma doação: ID do doador, ID do aluno e agendamento (hora e data).")
	@APIResponse(responseCode = "201",
	description = "doacao",
	content = {
			@Content(mediaType =  "application/json",
			schema = @Schema(implementation = DoacaoDto.class))
			}
	)
	public Response cadastrar(DoacaoDto doacaoDto) {
		try {
			service.cadastrar(doacaoDto);
			return Response
					.status(Response.Status.CREATED)
					.build();
		} catch (ApiException e) {
			return Response.status(Status.METHOD_NOT_ALLOWED).entity(e).build();
		}	
	}
	
	
	@PUT //quando o status da doação se modifica para ACEITO, a lista de material do aluno é excluída. (o campo material fica "")
	@Path("/aceitar/{idDoacao}")
	@Operation(summary = "Atualiza o status de uma doação para ACEITO.",
	description = "Atualiza o status de uma doação para ACEITO e limpa a lista de materiais do aluno.")
	@APIResponse(responseCode = "200",
	description = "doacao",
	content = {
			@Content(mediaType =  "application/json",
			schema = @Schema(implementation = DoacaoDto.class))
			}
	)
	public Response atualizarStatusAceito(@PathParam("idDoacao") Long idDoacao) {
		try {
			Filho filho = service.atualizarStatusAceito(idDoacao);
			filhoService.atualizarMaterial(filho.getId());
			return Response
					.status(Response.Status.OK)
					.build();
		} catch (ApiException e) {
			return Response.status(Status.METHOD_NOT_ALLOWED).entity(e).build();
		}
	}
	
	
	@PUT
	@Path("/rejeitar/{idDoacao}")
	@Operation(summary = "Atualiza o status de uma doação para REJEITADO.",
	description = "Atualiza o status de uma doação para REJEITADO.")
	@APIResponse(responseCode = "200",
	description = "doacao",
	content = {
			@Content(mediaType =  "application/json",
			schema = @Schema(implementation = DoacaoDto.class))
			}
	)
	public Response atualizarStatusRejeitado(@PathParam("idDoacao") Long idDoacao) {
		try {
			service.atualizarStatusRejeitado(idDoacao);
			return Response
					.status(Response.Status.OK)
					.build();
		} catch (ApiException e) {
			return Response.status(Status.METHOD_NOT_ALLOWED).entity(e).build();
		}
	}*/
	
}
