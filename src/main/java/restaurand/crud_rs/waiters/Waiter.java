package restaurand.crud_rs.waiters;

import java.time.LocalDate;

public class Waiter {

    // Propiedades o Atributos de clase

    private Long Id;
    private String name;
    private String position;
    private float price;
    private LocalDate fecha;
    private int antiguedad;

    public Waiter() {

    }

    // -- Constructores

    // Creamos nuestro constructor con id
    public Waiter(Long id, String name, String position, float price, LocalDate fecha, int antiguedad) {
        Id = id;
        this.name = name;
        this.position = position;
        this.price = price;
        this.fecha = fecha;
        this.antiguedad = antiguedad;
    }

    // Creamos nuestro constructor sin id
    public Waiter(int antiguedad, LocalDate fecha, float price, String position, String name) {
        this.antiguedad = antiguedad;
        this.fecha = fecha;
        this.price = price;
        this.position = position;
        this.name = name;
    }

    // -- Getter and Setters

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
