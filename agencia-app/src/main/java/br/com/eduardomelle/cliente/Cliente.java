package br.com.eduardomelle.cliente;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Cliente extends PanacheEntity {

  public String nome;

}
