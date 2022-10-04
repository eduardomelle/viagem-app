package br.com.eduardomelle.cliente;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/cliente-cli")
public class ClienteResource {

  @Inject
  @RestClient
  private ClienteService clienteService;

  @GET
  @Path("/newCliente")
  @Produces(MediaType.APPLICATION_JSON)
  public Response newCliente() {
    Cliente cliente = new Cliente();
    cliente.setNome("Remoto");

    Cliente c = this.clienteService.newCliente(cliente);

    return Response.status(Status.CREATED).entity(c).build();
  }

}
