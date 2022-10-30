package ufrn.br.aularestres.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.aularestres.controller.generic.AbstractController;
import ufrn.br.aularestres.model.Endereco;
import ufrn.br.aularestres.service.EnderecoService;


@RestController
@RequestMapping("/enderecos")
public class EnderecoController extends AbstractController<Endereco, EnderecoService> {
    public EnderecoController(EnderecoService service) {
        super(service);
    }
}
