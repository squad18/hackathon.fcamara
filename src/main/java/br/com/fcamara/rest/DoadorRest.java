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

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import br.com.fcamara.dto.DoadorDto;
import br.com.fcamara.exception.ApiException;
import br.com.fcamara.service.DoadorService;
import javax.ws.rs.core.Response.Status;

@Path("doador")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DoadorRest {

    @Inject DoadorService service;
    
    @GET
    @Operation(
        summary = "Listar um doador",
        description = "Listar um doador"
    )@APIResponse(
        responseCode = "200",
        description = "Listagem de doadores",
        content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = DoadorDto.class))
        }
    )
    public Response listar(){
        return Response.status(Status.OK).entity(service.listar()).header("Access-Control-Allow-Origin", "*").build();
    }   

    @GET
	@Path("{id}")
	@Operation(summary = "Buscar doador.",
	description = "Buscar doador pelo id.")
	@APIResponse(responseCode = "200",
	description = "doador",
	content = {
			@Content(mediaType =  "application/json",
					schema = @Schema(implementation = DoadorDto.class))
		}
	)
	public Response buscarDoador(@PathParam("id") Long id) {
		return Response.status(Status.OK).entity(service.buscarDoador(id)).header("Access-Control-Allow-Origin", "*").build();
	}
    
    @POST
    @Operation(
        summary = "Cadastrar um doador",
        description = "Cadastrar um doador ( Precisa de dados do cpf, email, endereço, nome e tipo)."
    )@APIResponse(
        responseCode = "201",
        description = "Cadastrar um doador",
        content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = DoadorDto.class))
        }
    )
    public Response cadastrar(DoadorDto dto){
        try {
            service.cadastrar(dto);
            return Response.status(Response.Status.OK).header("Access-Control-Allow-Origin", "*").build();
		} catch (ApiException e) {
			return Response.status(Status.METHOD_NOT_ALLOWED).entity(e).build();
		}	
    }

}
