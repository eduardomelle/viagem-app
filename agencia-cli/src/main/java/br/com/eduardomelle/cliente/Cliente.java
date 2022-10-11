package br.com.eduardomelle.cliente;

import java.io.Serializable;

public class Cliente implements Serializable {

  private Long id;

  private String nome;

  public static Cliente of(Long id, String nome) {
    Cliente cliente = new Cliente();
    cliente.setId(id);
    cliente.setNome(nome);
    return cliente;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
