package br.com.eduardomelle.reserva;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

// @RegisterRestClient(baseUri = "http://localhost:8182/reserva")
@RegisterRestClient(baseUri = "http://agencia-micro-reserva-eduardomelle-dev.apps.sandbox-m2.ll9k.p1.openshiftapps.com/reserva")
public interface ReservaService {

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  Reserva newReserva(Reserva reserva);

}
