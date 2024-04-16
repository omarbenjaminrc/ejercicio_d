package com.omar_ramirez.ejercicio_d.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.omar_ramirez.ejercicio_d.model.Venta;
import com.omar_ramirez.ejercicio_d.service.VentaService;

// import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    private static final Logger log = LoggerFactory.getLogger(VentaController.class);

    @Autowired
    private VentaService ventaService;

    //get all 
    @GetMapping
    public List<Venta> obtenerVentas() {
        log.info("GET /Ventas");
        log.info("getAllVenta");
        return ventaService.getAllVentas();
    }

    //get id 
    @GetMapping("/{id}")
    public Venta obtenerVentasPorId(@PathVariable Long id) {
        log.info("GET /Venta/{id}");
        log.info("obtenerVentaPorId");
        return ventaService.VentaById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Venta no encontrada"));
    }

    //Crear 
    @PostMapping("/crear")
    public Venta crearVenta(@RequestBody Venta Venta) {
        log.info("POST /Ventas");
        log.info("crearVentas");
        return ventaService.createVenta(Venta);
    }
 
    //modificar 
    @PutMapping("/{id}")
    public Venta modificarVenta(@PathVariable Long id, @RequestBody Venta Venta) {
        log.info("PUT /comentairo/{id}");
        log.info("modificarVenta");
        return ventaService.updateVenta(id, Venta);
    }

    //eliminar 
    @DeleteMapping("/{id}")
    public void eliminarVenta(@PathVariable Long id) {
        log.info("DELETE /Venta/{id}");
        log.info("eliminarVenta");
        ventaService.deleteVenta(id);
        //retorno de mensaje de eliminacion de servicio json
        log.info("Venta eliminado");

    }


    private List<Venta> ventas = new ArrayList<>();

    // @GetMapping("/{anio}/{mes}/{dia}")
    // public List<Venta> obtenerVentasPorDia(@PathVariable int anio, @PathVariable int mes, @PathVariable int dia) {
    //     return ventas.stream()
    //                 .filter(venta -> venta.getAnio() == anio && venta.getMes() == mes && venta.getDia() == dia)
    //                 .collect(Collectors.toList());
    // }
    // @GetMapping("/{anio}/{mes}")
    // public List<Venta> obtenerVentasPorDia(@PathVariable int anio, @PathVariable int mes) {
    //     return ventas.stream()
    //                 .filter(venta -> venta.getAnio() == anio && venta.getMes() == mes)
    //                 .collect(Collectors.toList());
    // }
    // @GetMapping("/{anio}")
    // public List<Venta> obtenerVentasPorDia(@PathVariable int anio) {
    //     return ventas.stream()
    //         .filter(venta -> venta.getAnio() == anio )
    //         .collect(Collectors.toList());
    // }

    // // calcular las ganancias

    // @GetMapping("/ganancias/{anio}/{mes}/{dia}")
    // public double obtenerGananciasPorDia(@PathVariable int anio, @PathVariable int mes, @PathVariable int dia) {
    //     return ventas.stream()
    //         .filter(venta -> venta.getAnio() == anio && venta.getMes() == mes && venta.getDia() == dia)
    //         .mapToDouble(venta -> venta.getPrecio() * venta.getCantidad())
    //         .sum();
    // }

    // @GetMapping("/ganancias/{anio}/{mes}")
    // public double obtenerGananciasPorMes(@PathVariable int anio, @PathVariable int mes) {
    //     return ventas.stream()
    //         .filter(venta -> venta.getAnio() == anio && venta.getMes() == mes)
    //         .mapToDouble(venta -> venta.getPrecio() * venta.getCantidad())
    //         .sum();
    // }

    // @GetMapping("/ganancias/{anio}")
    // public double obtenerGananciasPorAnio(@PathVariable int anio) {
    //     return ventas.stream()
    //         .filter(venta -> venta.getAnio() == anio)
    //         .mapToDouble(venta -> venta.getPrecio() * venta.getCantidad())
    //         .sum();
    // }
}
