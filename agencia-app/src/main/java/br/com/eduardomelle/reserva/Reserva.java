package br.com.eduardomelle.reserva;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import br.com.eduardomelle.cliente.Cliente;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Reserva extends PanacheEntity {

  @ManyToOne
  public Cliente cliente;

}
