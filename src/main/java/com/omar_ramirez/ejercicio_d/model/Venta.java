package com.omar_ramirez.ejercicio_d.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import java.time.LocalDate;

@Entity
@Table(name = "Venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "producto")
    private String producto;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "precio")
    private double precio;
    @Column(name = "anio")
    private int anio;
    @Column(name = "mes")
    private int mes;
    @Column(name = "dia")
    private int dia;

    // Constructor
    // public Venta(Long id, String producto, int cantidad, double precio, int anio, int mes, int dia) {
    //     this.id = id;
    //     this.producto = producto;
    //     this.cantidad = cantidad;
    //     this.precio = precio;
    //     this.anio = anio;
    //     this.mes = mes;
    //     this.dia = dia;
    // }

    // Getters
    public Long getId() {
        return id;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

}
