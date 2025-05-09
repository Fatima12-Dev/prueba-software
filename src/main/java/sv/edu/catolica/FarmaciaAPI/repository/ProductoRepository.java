package sv.edu.catolica.FarmaciaAPI.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.catolica.FarmaciaAPI.entities.ProductoEntity;

@Repository
public interface ProductoRepository extends JpaRepository <ProductoEntity, Long> {
}
