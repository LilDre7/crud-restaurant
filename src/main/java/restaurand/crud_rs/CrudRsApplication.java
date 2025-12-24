package restaurand.crud_rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import restaurand.crud_rs.product.Product;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

public class CrudRsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudRsApplication.class, args);
    }

}
