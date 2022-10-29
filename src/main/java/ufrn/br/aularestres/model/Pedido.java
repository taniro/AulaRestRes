package ufrn.br.aularestres.model;




import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Pedido
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
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