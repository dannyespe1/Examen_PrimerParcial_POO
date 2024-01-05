
package com.espedanny.publicinc;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empleado {
    
    private List<Empleado> empleadosContratados;

    public Gerente(String nombre, String cargo, String idEmpleado, int edad, String correoElectronico, String telefono) {
        super(nombre, cargo, idEmpleado, edad, correoElectronico, telefono);
        empleadosContratados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleadosContratados.add(empleado);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Gerente:");
        System.out.println("Nombre: " + super.nombre);
        System.out.println("Cargo: " + super.cargo);
        System.out.println("ID de empleado: " + super.idEmpleado);
        System.out.println("Edad: " + super.edad);
        System.out.println("Correo electrónico: " + super.correoElectronico);
        System.out.println("Teléfono: " + super.telefono);
        System.out.println("Empleados dirigidos: " + empleadosContratados);
    }

}
