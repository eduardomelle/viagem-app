package br.com.eduardomelle.cliente;

import javax.inject.Inject;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/cliente-cli")
public class ClienteResource {

  @Inject
  @RestClient
  private ClienteService clienteService;

}
