
package org.benji.rest.recursos;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.benji.rest.modelo.Articulo;
import org.benji.rest.servicio.ArticuloServicio;

/**
 *
 * @author dbarboza
 */
@Path("/articulos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ArticuloRecurso {
    
    ArticuloServicio servicio= new ArticuloServicio();
    
    @GET
    public List<Articulo> getArticulos(){
        return servicio.getArticulos();
    }
    
    @GET
    @Path("/{articuloId}")
    public Articulo getArticulo(@PathParam("articuloId") int id){
        return servicio.getArticulo(id);
    }
    
    @POST
    public Articulo addArticulo(Articulo articulo){
        return servicio.addArticulo(articulo);
    }
    
    @DELETE
    @Path("/{articuloId}")
    public void deleteArticulo(@PathParam("articuloId") int id){
        servicio.deleteArticulo(id);
    }
    
    @PUT
    @Path("/{articuloId}")
    public Articulo updateArticulo(@PathParam("articuloId") int id, Articulo articulo ){
        articulo.setId(id);
        return servicio.updateArticulo(articulo);
    }
}
