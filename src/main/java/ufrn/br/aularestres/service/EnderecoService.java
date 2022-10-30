package ufrn.br.aularestres.service;

import org.springframework.stereotype.Service;
import ufrn.br.aularestres.model.Endereco;
import ufrn.br.aularestres.repository.EnderecoRepository;
import ufrn.br.aularestres.service.generic.AbstractService;


@Service
public class EnderecoService extends AbstractService<Endereco, EnderecoRepository> {
    public EnderecoService(EnderecoRepository repository) {
        super(repository);
    }
}
