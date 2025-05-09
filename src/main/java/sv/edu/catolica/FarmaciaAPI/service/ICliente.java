package sv.edu.catolica.FarmaciaAPI.service;

import sv.edu.catolica.FarmaciaAPI.entities.ClienteEntity;

import java.util.List;

public interface ICliente {

    List<ClienteEntity> findAll();

    //post
    ClienteEntity save(ClienteEntity cliente);
}
