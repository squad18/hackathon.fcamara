package br.com.fcamara.rest;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import antlr.collections.List;
import br.com.fcamara.dto.DoadorDto;
import br.com.fcamara.service.DoadorService;
import javax.ws.rs.core.Response.Status;

@Path("doador")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DoadorRest {

    @Inject DoadorService service;
    
    @GET
    @Operation(
        summary = "Cadastrar um doador",
        description = "Cadastrar um doador"
    )@APIResponse(
        responseCode = "200",
        description = "Listagem de doadores",
        content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = DoadorDto.class))
        }
    )
    public Response listar(){
        return Response.status(Status.OK).entity(service.listar()).build();
    }   
    
    @POST
    @Operation(
        summary = "Cadastrar um doador",
        description = "Cadastrar um doador"
    )@APIResponse(
        responseCode = "201",
        description = "Cadastrar um doador",
        content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = DoadorDto.class))
        }
    )
    public Response cadastrar(DoadorDto dto){
        service.cadastrar(dto);
        return Response.status(Response.Status.OK).build();
    }

}
