package sv.edu.catolica.FarmaciaAPI.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.FarmaciaAPI.entities.VentaDetalleEntity;
import sv.edu.catolica.FarmaciaAPI.service.IVentaDetalle;

import java.util.List;

@RestController
@RequestMapping("/process")
public class VentaDetalleController {

    @Autowired
    private IVentaDetalle iVentaDetalle;

    @Transactional(readOnly = true)
    @GetMapping("/ventadetalles")
    public List<VentaDetalleEntity> getVentaDetalles() {

        return iVentaDetalle.findAll();
    }

    //post
    @Transactional
    @PostMapping("/ventadetalles")
    public VentaDetalleEntity saveVentaDetalles(@RequestBody VentaDetalleEntity ventaDetalle) {
        return iVentaDetalle.save(ventaDetalle);
    }




}
