package com.example.crudspring;

import com.example.crudspring.model.Empleado;
import com.example.crudspring.service.EmpleadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.crypto.ExemptionMechanism;
import java.util.List;

@RestController
@RequestMapping("/empleado" )
public class EmpleadoResource {

    //Declaración de instancia mas no una instancia completa
    private final EmpleadoService empleadoService;

    public EmpleadoResource(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    //Todos los empleados
    @GetMapping("all")
    public ResponseEntity<List<Empleado>> getAllEmpleados () {

        List<Empleado> empleados = empleadoService.findAllEmpleados();
        return new ResponseEntity<>(empleados, HttpStatus.OK);
    }

    //Busqueda por id
    @GetMapping("/find/{id}")
    //Entidad de respuesta del empleado ResponseEntity<Empleado>
    public ResponseEntity<Empleado> getEmpleadoById (@PathVariable("id") Long id) {

        Empleado empleado = empleadoService.findEmpleadoById(id);
        return new ResponseEntity<>(empleado, HttpStatus.OK);
    }

    //Crear empleado
    @PostMapping("/add")
    public ResponseEntity<Empleado> addEmpleado(@RequestBody Empleado empleado) {
        Empleado newEmpleado = empleadoService.addEmpleado(empleado);
        return new ResponseEntity<>(newEmpleado, HttpStatus.CREATED);
    }

    //Actualizar empleado
    @PutMapping("/update")
    public ResponseEntity<Empleado> updateEmpleado(@RequestBody Empleado empleado) {
        Empleado updateEmpleado = empleadoService.updateEmpleado(empleado);
        return new ResponseEntity<>(updateEmpleado, HttpStatus.OK);
    }

    //Eliminar empleado
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Empleado> deleteEmpleado(@PathVariable("id") Long id) {
        empleadoService.deleteEmpleado(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
