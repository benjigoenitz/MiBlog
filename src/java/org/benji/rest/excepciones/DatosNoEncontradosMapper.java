package org.benji.rest.excepciones;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.benji.rest.modelo.MensajeError;

@Provider
public class DatosNoEncontradosMapper 
       implements ExceptionMapper<DatosNoencontradosExcepcion>{

    @Override
    public Response toResponse(DatosNoencontradosExcepcion exception) {
        MensajeError mensaje = new MensajeError("Datos no encontrados", 
                                                404,"Esta informacion no se encuentra");
        return Response.status(Response.Status.NOT_FOUND)
                       .entity(mensaje).build();
    }
    
    
}
