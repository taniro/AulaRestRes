package ufrn.br.aularestres.service;


import org.springframework.stereotype.Service;
import ufrn.br.aularestres.model.Cliente;
import ufrn.br.aularestres.repository.ClienteRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public Cliente insert(Cliente c){
        return repository.save(c);
    }

    public void update(Cliente c){
        repository.saveAndFlush(c);
    }

    public void delete(Cliente c){
        repository.delete(c);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }

    public List<Cliente> listAll(){
        return repository.findAll();
    }

    public Cliente listById(Long id){
        Optional<Cliente> cliente = repository.findById(id);
        if (cliente.isPresent()) return  cliente.get();
        else throw new EntityNotFoundException("Cliente não encontrado");
    }
}
