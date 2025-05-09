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
@Table(name = "ventadetalle")

public class VentaDetalleEntity {
    @EmbeddedId
    private VentaDetalleId id;

    @ManyToOne
    @MapsId("id_venta")
    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta", foreignKey = @ForeignKey(name = "fk_ventadetalle_venta"))
    private VentaEntity venta;

    @ManyToOne
    @MapsId("id_Producto")
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto", foreignKey = @ForeignKey(name = "fk_ventadetalle_producto"))
    private ProductoEntity producto;

    @Column(columnDefinition = "INT")
    private int cantidad;

    @Column(columnDefinition = "DECIMAL(10,2)")
    private double precio;



}
