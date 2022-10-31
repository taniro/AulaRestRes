package ufrn.br.aularestres.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;
import ufrn.br.aularestres.controller.ClienteController;
import ufrn.br.aularestres.controller.generic.AbstractController;
import ufrn.br.aularestres.model.Cliente;
import ufrn.br.aularestres.model.Endereco;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDto extends RepresentationModel<ClienteDto> {
    String nome;
    String email;
    Endereco endereco;

    public Cliente convertToEntity (){
        return new Cliente(this.nome, this.email, this.endereco);
    }

    public void addLinks(Long id){
        this.add(
                linkTo
                        (ClienteController.class)
                        .slash(id)
                        .withSelfRel()
        );

        this.add(
                linkTo
                        (ClienteController.class)
                        .slash(id)
                        .withRel("delete")
        );
    }
}
