
package com.espedanny.publicinc;

public abstract class Empleado {
    
    protected String nombre;
    protected String cargo;
    protected String idEmpleado;
    protected int edad;
    protected String correoElectronico;
    protected String telefono;

     public Empleado(String nombre, String cargo, String idEmpleado, int edad, String correoElectronico, String telefono) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.idEmpleado = idEmpleado;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }
     
    public abstract void mostrarInfo();
    
}
