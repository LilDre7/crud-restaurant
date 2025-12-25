package restaurand.crud_rs.waiters;

/*
 * WaiterController
 *
 * Este controlador REST se encarga de manejar las peticiones HTTP
 * relacionadas con los waiters.
 *
 * Función principal:
 * - Recibir solicitudes del cliente (HTTP)
 * - Delegar la lógica de negocio al WaiterService
 * - Devolver respuestas en formato JSON
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Indica que esta clase es un controlador REST y devuelve JSON
@RequestMapping(path = "api/v1/waiters") // Ruta base para todos los endpoints de productos

public class WaiterController {

    private final WaiterService waiterService;

    /*
     * Inyección de dependencias por constructor.
     * Spring se encarga de proporcionar una instancia de WaiterService.
     * Esta es una buena práctica porque mejora la escalabilidad y los tests.
     */

    @Autowired // = Spring me da lo que necesito, yo no lo creo.
    public WaiterController(WaiterService waiterService) {
        this.waiterService = waiterService;
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
    public List<Waiter> getWaiter() {
        return waiterService.getWaiters();
    }

}
