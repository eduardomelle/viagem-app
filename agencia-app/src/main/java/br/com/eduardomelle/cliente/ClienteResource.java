package br.com.eduardomelle.cliente;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/cliente")
public class ClienteResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Cliente> get() {
    return Cliente.listAll();
  }

  @GET
  @Path("/findById")
  @Produces(MediaType.APPLICATION_JSON)
  public Cliente findById(@QueryParam("id") long id) {
    return Cliente.findById(id);
  }

  @DELETE
  @Path("/deleteById")
  @Transactional
  public void deleteById(@QueryParam("id") long id) {
    Cliente.deleteById(id);
  }

}
