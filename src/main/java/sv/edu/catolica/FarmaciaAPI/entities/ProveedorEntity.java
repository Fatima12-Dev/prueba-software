package sv.edu.catolica.FarmaciaAPI.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "proveedor")
public class ProveedorEntity {

    @Id
    @Column(columnDefinition = "INT",name = "id_proveedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProveedor;

    @Column(columnDefinition = "VARCHAR(100)")
    private String nombre;

    @Column(columnDefinition = "VARCHAR(150)")
    private String correo;

    @Column(columnDefinition = "VARCHAR(15)")
    private String telefono;

}
