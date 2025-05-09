package sv.edu.catolica.FarmaciaAPI.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.FarmaciaAPI.entities.EmpleadoEntity;
import sv.edu.catolica.FarmaciaAPI.service.IEmpleado;
import java.util.List;


@RestController
@RequestMapping("/process")
public class EmpleadoController {
    @Autowired
    private IEmpleado iEmpleado;

    @Transactional(readOnly = true)
    @GetMapping("/empleados")
    public List<EmpleadoEntity> getEmpleados(){
        return iEmpleado.findAll();
    }

    //crear Endpoints POST equicalente al insert en SQL
    @Transactional
    @PostMapping("/empleados")
    public EmpleadoEntity saveEmpleado(@RequestBody EmpleadoEntity empleado){
        return iEmpleado.save(empleado);
    }
}
