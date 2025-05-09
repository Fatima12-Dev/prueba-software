package sv.edu.catolica.FarmaciaAPI.service;

import sv.edu.catolica.FarmaciaAPI.entities.ProveedorEntity;

import java.util.List;

public interface IProveedor {

    List<ProveedorEntity> findAll();

    //post
    ProveedorEntity save(ProveedorEntity proveedor);
}
