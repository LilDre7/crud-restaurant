package restaurand.crud_rs.waiters;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/waiter")

public class WaiterController {

    private final WaiterService waiterService;

    /*
     * Inyección de dependencias por constructor.
     * Spring se encarga de proporcionar una instancia de WaiterService.
     * Esta es una buena práctica porque mejora la escalabilidad y los tests.
     */
    @Autowired
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
        return waiterService.getWaiter();
    }


}
