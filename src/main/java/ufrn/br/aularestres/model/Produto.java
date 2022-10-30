package ufrn.br.aularestres.model;


import lombok.*;
import ufrn.br.aularestres.model.generic.AbstractEntity;


import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Produto  extends AbstractEntity {
    String descricao;
}