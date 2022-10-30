package ufrn.br.aularestres.repository.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import ufrn.br.aularestres.model.generic.AbstractEntity;

public interface GenericRepository<E extends AbstractEntity> extends JpaRepository<E, Long> {
}
