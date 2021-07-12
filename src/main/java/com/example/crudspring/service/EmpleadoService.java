package com.example.crudspring.service;

import com.example.crudspring.exception.UserNotFoundException;
import com.example.crudspring.model.Empleado;
import com.example.crudspring.repo.EmpleadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class EmpleadoService {

    private final EmpleadoRepo empleadoRepo;

    public EmpleadoService(EmpleadoRepo empleadoRepo) {
        this.empleadoRepo = empleadoRepo;
    }

    public Empleado addEmpleado(Empleado empleado) {
        empleado.setCodigoEmpleado(UUID.randomUUID().toString());
        return empleadoRepo.save(empleado);
    }

    public List<Empleado> findAllEmpleados() {
        return empleadoRepo.findAll();
    }

    public Empleado updateEmpleado(Empleado empleado) {
        return  empleadoRepo.save(empleado);
    }

    public Empleado findEmpleadoById(Long id) {
        return empleadoRepo.findEmpleadoById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteEmpleado(Long id) {
        empleadoRepo.deleteEmpleadoById(id);
    }
}
