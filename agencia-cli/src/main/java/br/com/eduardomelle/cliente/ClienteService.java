package br.com.eduardomelle.cliente;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8080/cliente")
public interface ClienteService {

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Cliente newCliente(Cliente cliente);

  @GET
  @Path("/findById")
  @Produces(MediaType.APPLICATION_JSON)
  Cliente findById(@QueryParam("id") long id);

}
