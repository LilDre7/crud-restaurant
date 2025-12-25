package restaurand.crud_rs.waiters;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class WaiterService {
    @GetMapping

    public List<Waiter> getWaiter() {
        return List.of(new Waiter(
                1243L, "Laptop", "Admin", 500, LocalDate.of(2025, Month.MARCH, 5), 2
        ));
    }
}
