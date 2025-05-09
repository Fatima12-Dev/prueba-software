package sv.edu.catolica.FarmaciaAPI.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ProveedorProductoId implements Serializable {
    @Column(name = "id_proveedor")
    private Long idProveedor;

    @Column(name = "id_producto")
    private Long idProducto;

}
