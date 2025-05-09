package sv.edu.catolica.FarmaciaAPI.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.FarmaciaAPI.entities.EmpleadoEntity;
import sv.edu.catolica.FarmaciaAPI.repository.EmpleadoRepository;
import sv.edu.catolica.FarmaciaAPI.service.IEmpleado;

import java.util.List;

@Service
public class EmpleadoImpl implements IEmpleado {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<EmpleadoEntity> findAll(){
        return empleadoRepository.findAll();
    }

    //crear Endpoints POST equicalente al insert en SQL
    @Override
    public EmpleadoEntity save(EmpleadoEntity empleado) {
        return empleadoRepository.save(empleado);
    }

}
