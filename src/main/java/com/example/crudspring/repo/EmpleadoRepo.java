package com.example.crudspring.repo;

import com.example.crudspring.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpleadoRepo extends JpaRepository<Empleado, Long> {

    void deleteEmpleadoById(Long id);

    Optional<Empleado> findEmpleadoById(Long id);
}
