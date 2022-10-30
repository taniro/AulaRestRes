package ufrn.br.aularestres.controller;

import org.springframework.web.bind.annotation.*;
import ufrn.br.aularestres.controller.generic.AbstractController;
import ufrn.br.aularestres.model.Cliente;
import ufrn.br.aularestres.service.ClienteService;


@RestController
@RequestMapping("/clientes")
public class ClienteController extends AbstractController<Cliente, ClienteService> {

    public ClienteController(ClienteService service) {
        super(service);
    }
}
