package sv.edu.catolica.FarmaciaAPI.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.FarmaciaAPI.entities.ProveedorEntity;
import sv.edu.catolica.FarmaciaAPI.service.IProveedor;

import java.util.List;

@RestController
@RequestMapping("/process")
public class ProveedorController {

    @Autowired
    private IProveedor iProveedor;


    @Transactional(readOnly = true)
    @GetMapping("/proveedores")
    public List<ProveedorEntity> getProveedor() {
        return iProveedor.findAll();
    }

    @Transactional
    @PostMapping("/proveedores")
    public ProveedorEntity saveProveedores(@RequestBody ProveedorEntity proveedores) {
        return iProveedor.save(proveedores);
    }

}
