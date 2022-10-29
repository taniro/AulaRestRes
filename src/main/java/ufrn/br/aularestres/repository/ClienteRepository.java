package ufrn.br.aularestres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.aularestres.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}