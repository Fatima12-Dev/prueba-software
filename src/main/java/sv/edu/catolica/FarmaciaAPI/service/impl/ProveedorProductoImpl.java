package sv.edu.catolica.FarmaciaAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.FarmaciaAPI.entities.ProveedorProductoEntity;
import sv.edu.catolica.FarmaciaAPI.repository.ProveedorProductoRepository;
import sv.edu.catolica.FarmaciaAPI.service.IProveedorProducto;

import java.util.List;

@Service
public class ProveedorProductoImpl implements IProveedorProducto {

    @Autowired
    private ProveedorProductoRepository proveedorProductoRepository;

    @Override
    public List<ProveedorProductoEntity> findAll() {

        return proveedorProductoRepository.findAll();
    }
    //post
    @Override
    public ProveedorProductoEntity save(ProveedorProductoEntity proveedorproducto) {
        return proveedorProductoRepository.save(proveedorproducto);
    }

}
