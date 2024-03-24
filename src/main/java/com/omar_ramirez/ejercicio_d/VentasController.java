package com.omar_ramirez.ejercicio_d;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class VentasController {

    private List<Venta> ventas = new ArrayList<>();

    public VentasController() {
        // Inicializando la lista de ventas y añadiendo 3 instancias de Venta
        // ventas = new ArrayList<>();
        ventas.add(new Venta(1L, "Alimento para perros", 5, 19.99, 2023, 3, 15));
        ventas.add(new Venta(2L, "Juguete para gatos", 2, 9.99, 2023, 3, 16));
        ventas.add(new Venta(3L, "Collar para perros", 1, 5.99, 2023, 3, 17));
    }

    @GetMapping("/{anio}/{mes}/{dia}")
    public List<Venta> obtenerVentasPorDia(@PathVariable int anio, @PathVariable int mes, @PathVariable int dia) {
        return ventas.stream()
                    .filter(venta -> venta.getAnio() == anio && venta.getMes() == mes && venta.getDia() == dia)
                    .collect(Collectors.toList());
    }
    @GetMapping("/{anio}/{mes}")
    public List<Venta> obtenerVentasPorDia(@PathVariable int anio, @PathVariable int mes) {
        return ventas.stream()
                    .filter(venta -> venta.getAnio() == anio && venta.getMes() == mes)
                    .collect(Collectors.toList());
    }
    @GetMapping("/{anio}")
    public List<Venta> obtenerVentasPorDia(@PathVariable int anio) {
        return ventas.stream()
            .filter(venta -> venta.getAnio() == anio )
            .collect(Collectors.toList());
    }

    // calcular las ganancias

    @GetMapping("/ganancias/{anio}/{mes}/{dia}")
    public double obtenerGananciasPorDia(@PathVariable int anio, @PathVariable int mes, @PathVariable int dia) {
        return ventas.stream()
            .filter(venta -> venta.getAnio() == anio && venta.getMes() == mes && venta.getDia() == dia)
            .mapToDouble(venta -> venta.getPrecio() * venta.getCantidad())
            .sum();
    }

    @GetMapping("/ganancias/{anio}/{mes}")
    public double obtenerGananciasPorMes(@PathVariable int anio, @PathVariable int mes) {
        return ventas.stream()
            .filter(venta -> venta.getAnio() == anio && venta.getMes() == mes)
            .mapToDouble(venta -> venta.getPrecio() * venta.getCantidad())
            .sum();
    }

    @GetMapping("/ganancias/{anio}")
    public double obtenerGananciasPorAnio(@PathVariable int anio) {
        return ventas.stream()
            .filter(venta -> venta.getAnio() == anio)
            .mapToDouble(venta -> venta.getPrecio() * venta.getCantidad())
            .sum();
    }
}
