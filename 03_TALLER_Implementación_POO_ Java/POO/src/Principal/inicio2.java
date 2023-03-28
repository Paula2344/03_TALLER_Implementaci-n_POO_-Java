package Principal;

import java.util.Scanner;

import Salud.empleado;

public class inicio2 {
    public static void main(String[] args) {

        String nombre;
        String apellido;
        String tipoDoc;
        int documento;
        int edad;
        String sexo;
        String cargo;
        double valorHora;
        int horasTrabajadas;
        String departamento;
        double valorTotal;

        Scanner lectura =new Scanner(System.in);
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
        System.out.println("Ingrese su cargo");
        cargo=lectura.next();
        System.out.println("Ingrese el valorde horas trabajadas");
        horasTrabajadas=lectura.nextInt();
        System.out.println("Ingrese su departamento");
        departamento=lectura.next();
        valorHora=horasTrabajadas-0.966;
        valorTotal=valorHora;

       empleado empleado1= new empleado(nombre, apellido, tipoDoc, documento, edad, sexo, valorTotal, documento, edad, valorTotal, cargo, valorHora, horasTrabajadas, departamento, horasTrabajadas);

        empleado1.pedirDatos();
        empleado1.calcularHorarios();
    

       
        lectura.close();
        
    }
}
