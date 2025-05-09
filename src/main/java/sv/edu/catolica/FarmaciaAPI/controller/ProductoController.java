package sv.edu.catolica.FarmaciaAPI.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.FarmaciaAPI.entities.ProductoEntity;
import sv.edu.catolica.FarmaciaAPI.service.IProducto;

import java.util.List;

@RestController
@RequestMapping("/process")
public class ProductoController {
    @Autowired
    private IProducto iProducto;

    @Transactional(readOnly = true)
    @GetMapping("/productos")
    public List<ProductoEntity> getProductos() {
        return iProducto.findAll();
    }

    //post
    @Transactional
    @PostMapping("/productos")
    public ProductoEntity saveProducto(@RequestBody ProductoEntity producto) {
        return iProducto.save(producto);
    }
}
