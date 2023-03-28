package Principal;

import Salud.Persona;

public class inicio {
    
    public static void main(String[] args) {

        Persona personaA=new Persona();

        personaA.pedirDatos();
        personaA.mostrarPersona();
        personaA.calcularImc();
        personaA.mayorEdad();
        
    }
}
