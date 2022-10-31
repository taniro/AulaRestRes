package ufrn.br.aularestres.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufrn.br.aularestres.dto.ClienteDto;
import ufrn.br.aularestres.model.Cliente;
import ufrn.br.aularestres.service.ClienteService;

import java.net.URI;
import java.util.List;
import java.util.Objects;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listAll(){
        return service.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> listById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<ClienteDto> insert(@RequestBody ClienteDto c){

        Cliente cliente = c.convertToEntity();
        service.create(cliente);

        c.addLinks(cliente.getId());
        return ResponseEntity.created(URI.create("/clientes/"+cliente.getId())).body(c);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){

        Cliente c = service.findById(id);
        service.delete(c);
        return ResponseEntity.status(202).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente c){
        if(!Objects.equals(id, c.getId())){
            return ResponseEntity.badRequest().build();
        }
        service.findById(id);
        service.update(c);

        return ResponseEntity.ok().body(c);
    }

}