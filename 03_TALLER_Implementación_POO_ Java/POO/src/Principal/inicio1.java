package Principal;

import java.util.Scanner;

import Salud.Persona1;

public class inicio1 {
    public static void main(String[] args) {
        
        Persona1 personaB=new Persona1();
    
        double peso;
        double estatura;
        double resultado;
        
        Scanner lectura=new Scanner(System.in);
        
        System.out.println("Digite su peso en kg");
        peso=lectura.nextDouble();
        System.out.println("Digite su estatura en M");
        estatura=lectura.nextDouble();
        personaB.pedirDatos();
        personaB.mostrarPersona();
        resultado=personaB.calcularImc(peso, estatura);
        personaB.mayorEdad();
        
        System.out.println("Su peso es "+peso);
        System.out.println("Su estatura es "+estatura);
        if (resultado<20) {
            System.out.println("PESOBAJO");
        }else if (resultado<=25) {
            System.out.println("PESOIDEAL");
        }else if (resultado>25) {
            System.out.println("SOBREPESO");
        }
        


        lectura.close();
       
    }
}

