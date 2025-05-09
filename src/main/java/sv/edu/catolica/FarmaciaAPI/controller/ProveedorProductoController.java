package sv.edu.catolica.FarmaciaAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.FarmaciaAPI.entities.ProveedorProductoEntity;
import sv.edu.catolica.FarmaciaAPI.service.IProveedorProducto;

import java.util.List;

@RestController
@RequestMapping("/process")
public class ProveedorProductoController {

    @Autowired
    private IProveedorProducto IProveedorProducto;


    @Transactional(readOnly = true)
    @GetMapping("/proveedorproductos")
    public List<ProveedorProductoEntity> getProveedorProductos() {
        return IProveedorProducto.findAll();
    }

    @Transactional
    @PostMapping("/proveedorproductos")
    public ProveedorProductoEntity saveProveedoresProductos(@RequestBody ProveedorProductoEntity proveedorproductos) {
        return IProveedorProducto.save(proveedorproductos);
    }

}
