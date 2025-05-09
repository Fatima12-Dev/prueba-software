package sv.edu.catolica.FarmaciaAPI.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sv.edu.catolica.FarmaciaAPI.entities.ClienteEntity;
import sv.edu.catolica.FarmaciaAPI.service.ICliente;

import java.util.List;

@RestController
@RequestMapping("/process")
public class ClienteController {
    @Autowired
    private ICliente iCliente;

    @Transactional(readOnly = true)
    @GetMapping("/clientes")
    public List<ClienteEntity> getClientes() {
        return iCliente.findAll();

    }

    //post
    @Transactional
    @PostMapping("/clientes")
    public ClienteEntity saveCliente(@RequestBody ClienteEntity cliente) {
        return iCliente.save(cliente);
    }


}
