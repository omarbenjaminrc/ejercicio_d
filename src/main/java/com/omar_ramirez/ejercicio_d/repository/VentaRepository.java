package com.omar_ramirez.ejercicio_d.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.omar_ramirez.ejercicio_d.model.Venta;


public interface VentaRepository extends JpaRepository<Venta, Long> {
    
}