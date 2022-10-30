package ufrn.br.aularestres.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ufrn.br.aularestres.model.generic.AbstractEntity;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Empregado extends AbstractEntity {
    @OneToOne
    @JoinColumn(name = "chefe_id")
    Empregado chefe;
}