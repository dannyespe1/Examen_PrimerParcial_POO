
package com.espedanny.publicinc;
import java.util.ArrayList;
import java.util.List;
public class IlustradorGrafico extends Empleado {
   private List<String> habilidades;

    public IlustradorGrafico(List<String> habilidades, String nombre, String cargo, String idEmpleado, int edad, String correoElectronico, String telefono) {
        super(nombre, cargo, idEmpleado, edad, correoElectronico, telefono);
        habilidades = new ArrayList<>();
    }
   
    public void agregarHabilidad(String habilidad) {
    habilidades.add(habilidad);
    }

    @Override
    public void mostrarInfo() {
    System.out.println("Ilustrador Gráfico:");
    System.out.println("Nombre: " + super.nombre);
    System.out.println("Cargo: " + super.cargo);
    System.out.println("ID de empleado: " + super.idEmpleado);
    System.out.println("Edad: " + super.edad);
    System.out.println("Correo electrónico: " + super.correoElectronico);
    System.out.println("Teléfono: " + super.telefono);
    System.out.println("Habilidades: " + habilidades);
    }
    
    
}
