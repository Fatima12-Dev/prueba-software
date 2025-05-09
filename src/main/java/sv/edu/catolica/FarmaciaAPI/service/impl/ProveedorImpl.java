package sv.edu.catolica.FarmaciaAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.FarmaciaAPI.entities.ProveedorEntity;
import sv.edu.catolica.FarmaciaAPI.repository.ProveedorRepository;
import sv.edu.catolica.FarmaciaAPI.service.IProveedor;

import java.util.List;

@Service
public class ProveedorImpl implements IProveedor {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public List<ProveedorEntity> findAll(){
        return proveedorRepository.findAll();
    }

    @Override
    public ProveedorEntity save(ProveedorEntity proveedor) {
        return proveedorRepository.save(proveedor);
    }

}
