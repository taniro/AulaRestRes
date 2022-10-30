package ufrn.br.aularestres.service;

import org.springframework.stereotype.Service;
import ufrn.br.aularestres.model.Cliente;
import ufrn.br.aularestres.model.Endereco;
import ufrn.br.aularestres.repository.EnderecoRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService<T> {

    EnderecoRepository repository;

    public EnderecoService(EnderecoRepository repository) {
        this.repository = repository;
    }
    public Endereco insert(Endereco e){
        return repository.save(e);
    }

    public void update(Endereco c){
        repository.saveAndFlush(c);
    }

    public void delete(Endereco c){
        repository.delete(c);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }

    public List<Endereco> listAll(){
        return repository.findAll();
    }

    public Endereco listById(Long id){
        Optional<Endereco> endereco = repository.findById(id);
        if (endereco.isPresent()) return  endereco.get();
        else throw new EntityNotFoundException("Endereço não encontrado");
    }
}
