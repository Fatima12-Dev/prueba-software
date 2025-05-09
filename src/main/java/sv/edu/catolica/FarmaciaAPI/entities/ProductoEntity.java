package sv.edu.catolica.FarmaciaAPI.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "producto")

public class ProductoEntity {
    @Id
    @Column(columnDefinition = "INT", name = "id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @Column(columnDefinition = "VARCHAR(100)")
    private String nombre;

    @Column(columnDefinition = "DECIMAL(10,2)")
    private double precio;

    @Column(columnDefinition = "INT")
    private int stock;

    @Column(columnDefinition = "DATE")
    private Date fecha_caducidad;

    @Column(columnDefinition = "VARCHAR(100)")
    private String descripcion;
    
}
