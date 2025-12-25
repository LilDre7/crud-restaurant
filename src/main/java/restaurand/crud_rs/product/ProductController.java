package restaurand.crud_rs.product;

/*
 * ProductController
 *
 * Este controlador REST se encarga de manejar las peticiones HTTP
 * relacionadas con los productos.
 *
 * Función principal:
 * - Recibir solicitudes del cliente (HTTP)
 * - Delegar la lógica de negocio al ProductService
 * - Devolver respuestas en formato JSON
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Indica que esta clase es un controlador REST y devuelve JSON
@RequestMapping(path = "api/v1/products") // Ruta base para todos los endpoints de productos
public class ProductController {

    /*
     * ProductService se inyecta para separar responsabilidades:
     * - El Controller maneja HTTP
     * - El Service maneja la lógica de negocio
     */
    private final ProductService productService;

    /*
     * Inyección de dependencias por constructor.
     * Spring se encarga de proporcionar una instancia de ProductService.
     * Esta es una buena práctica porque mejora la escalabilidad y los tests.
     */
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /*
     * Endpoint GET
     *
     * URL: GET /api/v1/products
     *
     * Función:
     * - Obtiene la lista de productos desde el ProductService
     * - Devuelve la información en formato JSON
     */
    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

}
