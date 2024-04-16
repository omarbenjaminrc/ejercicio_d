package com.omar_ramirez.ejercicio_d.service;

import java.util.List;
import java.util.Optional;

import com.omar_ramirez.ejercicio_d.model.Venta; 

public interface VentaService {
    List<Venta> getAllVentas();
    Optional<Venta> VentaById(Long id);
    Venta createVenta(Venta venta);
    Venta updateVenta(Long id,Venta venta);
    void deleteVenta(Long id);
} 
