package br.com.eduardomelle.reserva;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.eduardomelle.cliente.Cliente;

@Path("/reserva-cli")
public class ReservaResource {

  @Inject
  @RestClient
  private ReservaService reservaService;

  @GET
  @Path("/newReserva")
  public Response newReserva() {
    Cliente cliente = new Cliente();
    cliente.setId(1L);

    Reserva reserva = new Reserva();
    reserva.setCliente(cliente);

    Reserva r = this.reservaService.newReserva(reserva);

    return Response.status(Status.CREATED).entity(r).build();
  }

}
