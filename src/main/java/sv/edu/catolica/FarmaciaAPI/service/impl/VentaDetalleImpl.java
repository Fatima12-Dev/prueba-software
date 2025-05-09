package sv.edu.catolica.FarmaciaAPI.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.FarmaciaAPI.entities.VentaDetalleEntity;
import sv.edu.catolica.FarmaciaAPI.repository.VentaDetalleRepository;
import sv.edu.catolica.FarmaciaAPI.service.IVentaDetalle;

import java.util.List;

@Service
public class VentaDetalleImpl implements IVentaDetalle {
    @Autowired
    private VentaDetalleRepository ventaDetalleRepository;
    @Override
    public List<VentaDetalleEntity> findAll(){

        return ventaDetalleRepository.findAll();
    }

    //post
    @Override
    public VentaDetalleEntity save(VentaDetalleEntity ventaDetalle) {
        return ventaDetalleRepository.save(ventaDetalle);
    }
}
