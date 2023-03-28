package Salud;

import java.util.Scanner;

public class Persona {

    //Atributos
    private String nombre;
    private String apellido;
    private String tipoDoc;
    private double pesoActual;
    private int documento;
    private int edad;
    private String sexo;
    private double peso;
    private double estatura;
    private double imc;

    //Metodos
    public void pedirDatos(){
        Scanner lectura=new Scanner(System.in);
        System.out.println("Digite el nombre");
        nombre=lectura.nextLine();
        System.out.println("Digite el apellido");
        apellido=lectura.nextLine();
        System.out.println("Digite el tipo de documento Cedula(CC) Tarjeta identidad (TI)");
        tipoDoc=lectura.nextLine();
        System.out.println("Digite su documento de identidad");
        documento=lectura.nextInt();
        System.out.println("Digite su edad");
        edad=lectura.nextInt();
        System.out.println("Digite su sexo");
        sexo=lectura.next();
        System.out.println("Digite su peso en kg");
        pesoActual=lectura.nextDouble();
        System.out.println("Digite su estatura en m");
        estatura=lectura.nextDouble();
        lectura.close();
    }

    public void mostrarPersona(){
        System.out.println("Su nombre es "+nombre);
        System.out.println("Su apellido es "+apellido);
        System.out.println("Su documento es "+tipoDoc+" "+documento);
        System.out.println("Su edad es "+edad);
        System.out.println("Su sexo es "+sexo);
        System.out.println("Su estatura es "+estatura);
        System.out.println("Su peso es "+pesoActual);
        System.out.println("Su IMC es "+imc);
        imc=peso/(estatura*estatura);
        
    }

    public void calcularImc(){
        
        if (imc<20) {
            System.out.println("Su peso es bajo");
        }else if (imc<=25) {
            System.out.println("Su peso es normal");
        }else if (imc>25) {
            System.out.println("Usted tiene sobre peso");
        }
            
        }
       
    

    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
    }
}