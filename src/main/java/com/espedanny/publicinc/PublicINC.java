package com.espedanny.publicinc;

public class PublicINC {

    public static void main(String[] args) {
        
        Programador programador = new Programador("Juan", "Programador", "1", 30, "juan@mail.com", "0967452315");
        programador.agregarHabilidad("Java");
        programador.agregarHabilidad("Python");
        programador.mostrarInfo();
        
        Programador programador2 = new Programador("Jose", "Programador", "1", 30, "juan@mail.com", "0967452315");
        programador.agregarHabilidad("Java");
        programador.agregarHabilidad("Python");
        programador.mostrarInfo();
        
        Editor editor = new Editor("Juan Pérez", "Editor", "123456", 30, "juan.perez@email.com", "1234567890", true);
        editor.mostrarInfo();
        
        Gerente gerente = new Gerente("Pedro", "Gerente", "3", 40, "pedro@mail.com", "0988785614");
        gerente.agregarEmpleado(programador);
        gerente.agregarEmpleado(programador2);
        gerente.agregarEmpleado(editor);
        gerente.mostrarInfo();

    }
}
