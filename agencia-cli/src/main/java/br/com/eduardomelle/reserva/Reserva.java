package br.com.eduardomelle.reserva;

import java.io.Serializable;

import br.com.eduardomelle.cliente.Cliente;

public class Reserva implements Serializable {

  private Cliente cliente;

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

}
