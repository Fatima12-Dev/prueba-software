package sv.edu.catolica.FarmaciaAPI.service;

import sv.edu.catolica.FarmaciaAPI.entities.VentaEntity;

import java.util.List;

public interface IVenta {
    List<VentaEntity> findAll();

    //post
    VentaEntity save(VentaEntity venta);
}
