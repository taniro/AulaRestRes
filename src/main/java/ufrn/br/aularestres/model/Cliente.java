package ufrn.br.aularestres.model;

import lombok.*;
import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Cliente{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String nome;
    @OneToOne (orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    Endereco endereco;
}