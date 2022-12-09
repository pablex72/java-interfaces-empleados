package poo.sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juanito = new Empleado("Juanito",30,40000,true);
        Empleado patrick = new Empleado("Patrick",30,40000,true);
        Empleado carlos = new Empleado("Carlos",30,40000,true);

        System.out.println(juanito);

        //GUARDAR empleados
        empleadoCRUD.save(juanito);
        empleadoCRUD.save(patrick);
        empleadoCRUD.save(carlos);

        // consultar empleados
        //empleadoCRUD.findAll();
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);*/

        EmpleadoCRUDMySQL empleadoCRUDMySQL = new EmpleadoCRUDMySQL();

        Empleado juanito = new Empleado("Juanito",30,40000,true);
        Empleado patrick = new Empleado("Patrick",30,40000,true);
        Empleado carlos = new Empleado("Carlos",30,40000,true);

        System.out.println(juanito);

        // consultar empleados
        //empleadoCRUD.findAll();
        List<Empleado> empleados = empleadoCRUDMySQL.recuperarEmpleados();
        System.out.println(empleados);
    }

}
