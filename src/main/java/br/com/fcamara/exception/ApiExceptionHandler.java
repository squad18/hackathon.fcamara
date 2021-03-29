package br.com.fcamara.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ApiExceptionHandler implements ExceptionMapper<ApiException> 
{
    @Override
    public Response toResponse(ApiException exception) {
        return Response.status(Status.BAD_REQUEST).entity(exception.getMessage()).build();
    }
    
    
}