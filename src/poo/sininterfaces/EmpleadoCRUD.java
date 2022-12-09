package poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retrieve/Read
 * Update
 * Delete
 */
public class EmpleadoCRUD {

    //estructura de Datos
    private List<Empleado> empleados = new ArrayList<>();


    // operaciones CRUD

    // CREATE - guardar un empleado
    public void save(Empleado empleado){

        empleados.add(empleado);
    }

    // retrieve empleados
    public List<Empleado> findAll(){
        return empleados;
    }
}
