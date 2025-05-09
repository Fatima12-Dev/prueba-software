package sv.edu.catolica.FarmaciaAPI.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.catolica.FarmaciaAPI.entities.ProductoEntity;
import sv.edu.catolica.FarmaciaAPI.repository.ProductoRepository;
import sv.edu.catolica.FarmaciaAPI.service.IProducto;

import java.util.List;

@Service
public class ProductoImpl implements IProducto {

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public List<ProductoEntity> findAll() {
        return productoRepository.findAll();
    }

    //post
    @Override
    public ProductoEntity save(ProductoEntity producto) {
        return productoRepository.save(producto);
    }
}
