package ufrn.br.aularestres.service.generic;

import ufrn.br.aularestres.model.generic.AbstractEntity;

import java.util.List;

public interface IGenericService<E extends AbstractEntity> {
    List<E> listAll();
    E create(E e);
    E findById(Long id);
    void update(E e);
    void delete(E e);
}
