package sv.edu.catolica.FarmaciaAPI.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "proveedorproducto")

public class ProveedorProductoEntity {

    @EmbeddedId
    private ProveedorProductoId id;

    @ManyToOne
    @MapsId("id_proveedor")
    @JoinColumn(name = "id_proveedor", referencedColumnName = "id_proveedor", foreignKey = @ForeignKey(name = "fk_proveedorproducto_proveedor"))
    private ProveedorEntity proveedor;

    @ManyToOne
    @MapsId("id_producto")
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto", foreignKey = @ForeignKey(name = "fk_proveedorproducto_producto"))
    private ProductoEntity producto;

}
