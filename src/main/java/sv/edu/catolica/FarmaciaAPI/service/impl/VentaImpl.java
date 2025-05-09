package sv.edu.catolica.FarmaciaAPI.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.FarmaciaAPI.entities.VentaEntity;
import sv.edu.catolica.FarmaciaAPI.repository.VentaRepository;
import sv.edu.catolica.FarmaciaAPI.service.IVenta;

import java.util.List;

@Service
public class VentaImpl implements IVenta {
    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<VentaEntity> findAll() {
        return ventaRepository.findAll();
    }

    //post
    @Override
    public VentaEntity save(VentaEntity venta) {
        return ventaRepository.save(venta);
    }

}
