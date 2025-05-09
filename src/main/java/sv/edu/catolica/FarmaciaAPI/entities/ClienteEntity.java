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
@Table(name = "cliente")

public class ClienteEntity {

    @Id
    @Column(columnDefinition = "INT", name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(columnDefinition = "VARCHAR(50)")
    private String nombre;

    @Column(columnDefinition = "VARCHAR(50)")
    private String apellido;

    @Column(columnDefinition = "VARCHAR(150)")
    private String correo;

    @Column(columnDefinition = "VARCHAR(15)")
    private String telefono;

    @Column(columnDefinition = "BOOLEAN")
    private boolean membresia;
}
