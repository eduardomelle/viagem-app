package br.com.eduardomelle.cliente;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@Readiness
public class ReadinessCheck implements HealthCheck {

  @Override
  public HealthCheckResponse call() {
    // TODO Auto-generated method stub
    return null;
  }

}
