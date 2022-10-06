package br.com.eduardomelle.reserva;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Reserva extends PanacheEntity {

  public Long idCliente;

}
