package sv.edu.catolica.FarmaciaAPI.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "venta")

public class VentaEntity {
    @Id
    @Column(columnDefinition = "INT", name = "id_venta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", foreignKey = @ForeignKey(name = "fk_venta_cliente"))
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado", foreignKey = @ForeignKey(name = "fk_venta_empleado"))
    private EmpleadoEntity empleado;

    @Column(columnDefinition = "DATE")
    private Date fecha_venta;
    
}
