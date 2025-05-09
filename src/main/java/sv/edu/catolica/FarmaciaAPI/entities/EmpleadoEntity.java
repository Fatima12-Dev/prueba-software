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
@Table(name = "empleado")

public class EmpleadoEntity {
    @Id
    @Column(columnDefinition = "INT", name = "id_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;

    @Column(columnDefinition = "VARCHAR(50)")
    private String nombre;

    @Column(columnDefinition = "VARCHAR(50)")
    private String apellido;

    @Column(columnDefinition = "VARCHAR(50)")
    private String cargo;

    @Column(columnDefinition = "DECIMAL(10,2)")
    private double salario;

}
