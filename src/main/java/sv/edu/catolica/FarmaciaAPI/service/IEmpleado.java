package sv.edu.catolica.FarmaciaAPI.service;

import sv.edu.catolica.FarmaciaAPI.entities.EmpleadoEntity;

import java.util.List;

public interface IEmpleado {
    List<EmpleadoEntity> findAll();

    //crear Endpoints POST equicalente al insert en SQL
    EmpleadoEntity save(EmpleadoEntity empleado);

}
