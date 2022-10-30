package ufrn.br.aularestres.service;


import org.springframework.stereotype.Service;
import ufrn.br.aularestres.model.Cliente;
import ufrn.br.aularestres.repository.ClienteRepository;
import ufrn.br.aularestres.service.generic.AbstractService;

@Service
public class ClienteService extends AbstractService<Cliente, ClienteRepository> {

    public ClienteService(ClienteRepository repository) {
        super(repository);
    }
}
