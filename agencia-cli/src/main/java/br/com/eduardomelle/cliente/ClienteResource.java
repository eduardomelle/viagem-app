package br.com.eduardomelle.cliente;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
  public Response newCliente() {
    Cliente cliente = Cliente.of(99L, "Remoto");

    Response response = this.clienteService.newCliente(cliente);

    return Response.status(Status.CREATED).entity(response).build();
  }

}
