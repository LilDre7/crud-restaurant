package restaurand.crud_rs.waiters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class WaiterService {

    // Dependencia del repositorio.
    // Es final porque no debe cambiar una vez inyectado.
    private final WaiterRepository waiterRepository;

    /*
     * Inyección de dependencias por constructor.
     * Spring crea el WaiterRepository y lo pasa aquí.
     * NO usamos 'new', Spring se encarga del ciclo de vida.
     */
    @Autowired
    public WaiterService(WaiterRepository waiterRepository) {
        this.waiterRepository = waiterRepository;

    }

    // Aquí van los métodos del CRUD:
    // - crear waiter
    // - buscar waiter
    // - actualizar waiter
    // - eliminar waiter


    // Aqui lo que hago es traer todos los datos de la database
    public List<Waiter> getWaiters() {
        return this.waiterRepository.findAll();
    }

    // !------------------------------->
    public ResponseEntity<Object> newWaiter(Waiter waiter) {

        Optional<Waiter> res = waiterRepository.findWaiterByName(waiter.getName());

        // Si ya existe, no lo creamos
        if (res.isPresent()) {
            return ResponseEntity
                    .badRequest()
                    .body("El waiter ya existe");
        }

        // Si no existe, lo guardamos
        waiterRepository.save(waiter);
        return ResponseEntity.ok("Waiter creado correctamente");
    }

}































