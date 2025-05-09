package sv.edu.catolica.FarmaciaAPI.service;

import sv.edu.catolica.FarmaciaAPI.entities.ProveedorProductoEntity;

import java.util.List;

public interface IProveedorProducto {
    List<ProveedorProductoEntity> findAll();
    //post
    ProveedorProductoEntity save(ProveedorProductoEntity proveedorproducto);
}
