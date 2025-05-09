package sv.edu.catolica.FarmaciaAPI.service;


import sv.edu.catolica.FarmaciaAPI.entities.VentaDetalleEntity;

import java.util.List;

public interface IVentaDetalle {

    List<VentaDetalleEntity> findAll();

    //post
    VentaDetalleEntity save(VentaDetalleEntity ventaDetalle);

}
