
package com.espedanny.publicinc;

public class Editor extends Empleado {
    
   private boolean prefiereEdicionDigital;

    public Editor(String nombre, String titulo, String numTrabajo, int experiencia, String email, String telefono, boolean prefiereEdicionDigital) {
        super(nombre, titulo, numTrabajo, experiencia, email, telefono);
        this.prefiereEdicionDigital = prefiereEdicionDigital;
    }

    public boolean esPreferidoEdicionDigital() {
        return prefiereEdicionDigital;
    }

   @Override
    public void mostrarInfo() {
        System.out.println("Prefiere edición digital: " + (prefiereEdicionDigital ? "Sí" : "No"));
    }
    
    
}
