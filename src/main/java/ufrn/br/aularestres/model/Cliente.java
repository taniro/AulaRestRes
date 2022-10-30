package ufrn.br.aularestres.model;

import lombok.*;
import ufrn.br.aularestres.model.generic.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Cliente extends AbstractEntity {
    @NotBlank(message = "Nome não pode ser vazio.")
    String nome;

    @Email (message = "Email não é válido.")
    String email;

    @OneToOne (orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    Endereco endereco;
}