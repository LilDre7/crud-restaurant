package restaurand.crud_rs.waiters;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// ❓ ¿Para qué es un Repository?
// 👉 Para hablar con la base de datos.
// Nada más. Nada menos.

public interface WaiterRepository extends JpaRepository<Waiter, Long> {

    // Aqui lo que hacemos es nuestro Repository es extender nuestra
    // interfaz a JPA que eso mucha codigo que nos va a
    // falilitar ingresar a nuestra database

    // WAITER ES NUESTRA TABLA O ENTIDAD
    // Y long es nuestro tipo de dato del ID

    Optional<Waiter> findWaiterByName(String name);

    // Optional<Waiter> findWaiterByPrice(float price);
}
