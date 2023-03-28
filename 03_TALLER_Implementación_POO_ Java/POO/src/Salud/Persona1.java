package Salud;

import java.util.Scanner;

public class Persona1 {
    //Atributos
    private String nombre;
    private String apellido;
    private String tipoDoc;
    private int documento;
    private int edad;
    private String sexo;
    private double imc;

    //Metodos
    public void pedirDatos(){
        Scanner lectura=new Scanner(System.in);
        System.out.println("Digite el nombre");
        nombre=lectura.nextLine();
        System.out.println("Digite el apellido");
        apellido=lectura.nextLine();
        System.out.println("Digite el tipo de documento Cedula(CC) Tarjeta identidad (TI) ");
        tipoDoc=lectura.nextLine();
        System.out.println("Digite su documento de identidad");
        documento=lectura.nextInt();
        System.out.println("Digite su edad");
        edad=lectura.nextInt();
        System.out.println("Digite su sexo");
        sexo=lectura.next();
        lectura.close();
    }

    public void mostrarPersona(){
        System.out.println("Su nombre es "+nombre);
        System.out.println("Su apellido es "+apellido);
        System.out.println("Su documento es "+tipoDoc+" "+documento);
        System.out.println("Su edad es "+edad);
        System.out.println("Su sexo es "+sexo);
        
    }

    public double calcularImc(double peso, double estatura){
        double pesoActual;
        imc=peso/(estatura*estatura);
        pesoActual=peso/imc;
        return pesoActual;
        }
       
    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
}
}

