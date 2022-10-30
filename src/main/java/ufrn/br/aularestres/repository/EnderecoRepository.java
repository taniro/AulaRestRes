package ufrn.br.aularestres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.aularestres.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
