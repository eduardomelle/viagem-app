package br.com.eduardomelle.reserva;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.eduardomelle.cliente.Cliente;
import br.com.eduardomelle.cliente.ClienteService;

@Path("/reserva-cli")
public class ReservaResource {

  @Inject
  @RestClient
  private ClienteService clienteService;

  @Inject
  @RestClient
  private ReservaService reservaService;

  @GET
  @Path("/newReserva")
  public Response newReserva() {
    Long idCliente = 1L;

    Cliente cliente = this.clienteService.findById(idCliente);

    Reserva reserva = new Reserva();
    reserva.setIdCliente(cliente.getId());

    Reserva r = this.reservaService.newReserva(reserva);

    return Response.status(Status.CREATED).entity(r).build();
  }

}
