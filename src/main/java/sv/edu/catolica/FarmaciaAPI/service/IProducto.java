package sv.edu.catolica.FarmaciaAPI.service;


import sv.edu.catolica.FarmaciaAPI.entities.ProductoEntity;

import java.util.List;

public interface IProducto {
        List<ProductoEntity> findAll();

        //Post
      ProductoEntity save(ProductoEntity producto);
}
