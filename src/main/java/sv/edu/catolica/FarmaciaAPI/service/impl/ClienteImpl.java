package sv.edu.catolica.FarmaciaAPI.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.FarmaciaAPI.entities.ClienteEntity;
import sv.edu.catolica.FarmaciaAPI.repository.ClienteRepository;
import sv.edu.catolica.FarmaciaAPI.service.ICliente;

import java.util.List;

@Service
public class ClienteImpl implements ICliente {

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<ClienteEntity> findAll() {
        return clienteRepository.findAll();
    }

    //post
    @Override
    public ClienteEntity save(ClienteEntity cliente) {
        return clienteRepository.save(cliente);
    }

}
