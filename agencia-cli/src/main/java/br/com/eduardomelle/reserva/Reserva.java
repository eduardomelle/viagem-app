package br.com.eduardomelle.reserva;

import java.io.Serializable;

public class Reserva implements Serializable {

  private Long idCliente;

  public Long getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(Long idCliente) {
    this.idCliente = idCliente;
  }

}
