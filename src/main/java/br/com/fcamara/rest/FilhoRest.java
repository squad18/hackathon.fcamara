package br.com.fcamara.rest;

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
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import br.com.fcamara.model.Filho;
import br.com.fcamara.service.FilhoService;

@Path("filho")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FilhoRest {
	
	@Inject
	FilhoService service;

	@GET
	@Operation(summary = "Listar filhos.",
	description = "Listar todos os filhos.")
	@APIResponse(responseCode = "200",
	description = "filho",
	content = {
			@Content(mediaType =  "application/json",
					schema = @Schema(implementation = Filho.class))
		}
	)
	public Response listar() {
		return Response.status(Status.OK).entity(service.listar()).build();
	}


	@GET
	@Path("{id}")
	@Operation(summary = "Buscar filho.",
	description = "Buscar filho pelo id.")
	@APIResponse(responseCode = "200",
	description = "filho",
	content = {
			@Content(mediaType =  "application/json",
					schema = @Schema(implementation = Filho.class))
		}
	)
	public Response buscarFilho(@PathParam("id") Long id) {
		return Response.status(Status.OK).entity(service.buscarFilho(id)).build();
	}
	
	
	@POST
	@Path("")
	@Operation(summary = "Cadastrar filho.",
	description = "Cadastrar filho: cpf, endereço e nome.")
	@APIResponse(responseCode = "201",
	description = "filho",
	content = {
			@Content(mediaType =  "application/json",
					schema = @Schema(implementation = Filho.class))
			}
	)
	public Response cadastrar(Filho filho) {
		service.cadastrar(filho);
		return Response.status(Status.CREATED).build();
		
	}


}
