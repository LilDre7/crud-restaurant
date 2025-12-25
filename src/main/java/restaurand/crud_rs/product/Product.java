package restaurand.crud_rs.product;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(unique = true)
    private String name;
    private String position;
    private float price;
    private LocalDate fecha;

    // Esto hace que pueda cambiar
    @Transient
    private int antiguedad;

    public Product() {

    }

    // Constructor1 es para el sevidor
    public Product(Long id, String name, String position, float price, LocalDate fecha) {
        this.name = name;
        this.position = position;
        this.price = price;
        this.fecha = fecha;
    }

    // Constructor2 este es para el cliente
    public Product(String name, String position, float price, LocalDate fecha) {
        this.name = name;
        this.position = position;
        this.price = price;
        this.fecha = fecha;
    }

    // Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
    }

    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Position
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    // Price
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Fecha
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // Antiguedades
    public int getAntiguedad() {
        return Period.between(this.fecha, LocalDate.now()).getYears();
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
