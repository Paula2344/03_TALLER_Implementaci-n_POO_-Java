package Geometricas;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {

        
        float base;
        float altura;
        float radio;
        double pi;
        int intentos=5,intento, decision;
        Triangulo trian=new Triangulo(base, altura);
        Rectangulo recta=new Rectangulo(base, altura);
        Circulo circ=new Circulo(radio, pi);

        Scanner lectura=new Scanner(System.in);

        System.out.println("De cual figura desea ver el area");
        
            System.out.println("Triangulo (1), Rectangulo(2), Circulo(3)");
            decision=lectura.nextInt();
           
        if(decision==1){
            System.out.println("Ingrese la base del triangulo");
        base=lectura.nextFloat();
        System.out.println("Ingrese la altura del triangulo");
        altura=lectura.nextFloat();
        }else if (decision==2) {
            System.out.println("Ingrese la base del rectangulo");
            base=lectura.nextFloat();
            System.out.println("Ingrese la altura del rectangulo");
            altura=lectura.nextFloat();
        }else if (decision==3) {
            System.out.println("Ingrese el radio del circulo");
            radio=lectura.nextFloat();
            System.out.println("Ingresa el numro PI");
            pi=lectura.nextDouble();
    }
    
    trian.calcularArea();
    recta.calcularArea();
    circ.calcularArea();
      
        lectura.close();
    }
}
