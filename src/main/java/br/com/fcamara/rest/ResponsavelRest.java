package br.com.fcamara.rest;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import br.com.fcamara.model.Responsavel;
import br.com.fcamara.service.ResponsavelService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


@Path("responsavel")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ResponsavelRest {

	@Inject
	ResponsavelService service;

	@GET
	@Operation(summary = "Listar responsáveis.",
	description = "Listar todos os responsáveis.")
	@APIResponse(responseCode = "200",
	description = "responsável",
	content = {
			@Content(mediaType =  "application/json",
					schema = @Schema(implementation = Responsavel.class))
		}
	)
	public Response listar() {
		return Response.status(Status.OK).entity(service.listar()).build();
	}


	@GET
	@Path("{id}")
	@Operation(summary = "Buscar responsável.",
	description = "Buscar responsável pelo id.")
	@APIResponse(responseCode = "200",
	description = "responsável",
	content = {
			@Content(mediaType =  "application/json",
					schema = @Schema(implementation = Responsavel.class))
		}
	)
	public Response buscarResponsavel(@PathParam("id") Long id) {
		return Response.status(Status.OK).entity(service.buscarResponsavel(id)).build();
	}
	
	
	@POST
	@Path("")
	@Operation(summary = "Cadastrar responsável.",
	description = "Cadastrar responsável: cpf, endereço e nome.")
	@APIResponse(responseCode = "201",
	description = "responsável",
	content = {
			@Content(mediaType =  "application/json",
					schema = @Schema(implementation = Responsavel.class))
			}
	)
	public Response cadastrar(Responsavel responsavel) {
		service.cadastrar(responsavel);
		return Response.status(Status.CREATED).build();
		
	}


}