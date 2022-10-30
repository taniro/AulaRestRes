package ufrn.br.aularestres.model;




import lombok.*;
import ufrn.br.aularestres.model.generic.AbstractEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Pedido extends AbstractEntity{

    String dataPedido;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    Cliente cliente;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "pedido_produto",
            joinColumns = @JoinColumn(name = "pedido_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    List<Produto> produtos;
}