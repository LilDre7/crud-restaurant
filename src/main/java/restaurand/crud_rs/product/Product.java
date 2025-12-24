package restaurand.crud_rs.product;

import java.time.LocalDate;

public class Product {
    private Long Id;
    private String name;
    private String position;
    private float price;
    private LocalDate fecha;
    private int antiguedad;

    public Product() {

    }

    // Constructor1 es para el sevidor
    public Product(Long id, String name, String position, float price, LocalDate fecha, int antiguedad) {
        Id = id;
        this.name = name;
        this.price = price;
        this.fecha = fecha;
        this.antiguedad = antiguedad;
    }

    // Constructor2 este es para el cliente
    public Product(String name, String position, float price, LocalDate fecha, int antiguedad) {
        this.name = name;
        this.price = price;
        this.fecha = fecha;
        this.antiguedad = antiguedad;
    }

    // Id
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
