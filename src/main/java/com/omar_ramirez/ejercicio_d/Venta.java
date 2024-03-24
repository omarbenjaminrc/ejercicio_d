package com.omar_ramirez.ejercicio_d;

import java.time.LocalDate;

public class Venta {
    private Long id;
    private String producto;
    private int cantidad;
    private double precio;
    private int anio;
    private int mes;
    private int dia;

    // Constructor
    public Venta(Long id, String producto, int cantidad, double precio, int anio, int mes, int dia) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

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
}
