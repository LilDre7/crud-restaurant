// Paquete donde se encuentra el repositorio.
// Sirve para organizar el proyecto y para que Spring lo detecte automáticamente.
package restaurand.crud_rs.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// @Repository le indica a Spring que esta interfaz
// se encarga del acceso a datos (base de datos).
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    /*
     * Este método NO se implementa manualmente.
     * Spring Data JPA genera la consulta automáticamente
     * basándose en el nombre del método.
     *
     * findProductByName → busca un Product por el campo "name"
     *
     * Equivalente en SQL sería algo como:
     * SELECT * FROM product WHERE name = ?
     *
     * Retorna Optional<Product> para evitar null
     * y manejar correctamente el caso donde no exista el producto.
     *
     * IMPORTANTE:
     * El campo "name" debe existir en la entidad Product.
     */

    Optional<Product> findProductByName(String name);

}
