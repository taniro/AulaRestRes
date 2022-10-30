package ufrn.br.aularestres.service.generic;

import ufrn.br.aularestres.model.generic.AbstractEntity;
import ufrn.br.aularestres.repository.generic.GenericRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

public abstract class AbstractService<E extends AbstractEntity, R extends GenericRepository<E>> implements IGenericService<E>{

    protected final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }

    @Override
    public List<E> listAll() {
        return repository.findAll();
    }

    @Override
    public E create(E e) {
        return repository.save(e);
    }

    @Override
    public E findById(Long id) {
        Optional<E> entity = repository.findById(id);
        if (entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException("Entity with id " + id + " not found.");
    }

    @Override
    public void update(E e) {
        repository.save(e);
    }

    @Override
    public void delete(E e) {
        repository.delete(e);
    }
}
