package Juegos;

import java.util.Random;
import java.util.Scanner;

public class Piedrapapelotijera implements Juego {

    private String jugador;
    private int eleccion;
    private int mano;

    Scanner lectura=new Scanner(System.in);

    public void iniciar() {
       System.out.println("Porfavor ingresa tu nombre B)");
       jugador=lectura.next();
       System.out.println("Hola "+jugador+ " estas listo? :p");
    }

    public void jugar() {
       System.out.println("Realiza tu eleccion  Piedra(1) Papel(2) Tijera(3)");
       eleccion=lectura.nextInt();
       Random alt =new Random();
       mano=alt.nextInt(3)+1;
    }

    public void finalizar() {
       if (mano==1 && eleccion==1) {
        System.out.println("Empate ambos sacaron piedra :o");
       }else if (mano==2 && eleccion==2) {
        System.out.println("Empate ambos sacaron papel :o");
       }else if (mano==3 && eleccion==3) {
        System.out.println("Empate ambos sacaron tijera :o");
       }else if (mano==1 && eleccion==2) {
        System.out.println("Saco papel y tu piedra, perdiste :(");
       }else if (mano==3 && eleccion==1) {
        System.out.println("Saco piedra y tu tijeras, perdiste :(");
       }else if (mano==2 && eleccion==3) {
        System.out.println("Saco tijeras y tu papel, perdiste :(");
       }else if (mano==2 && eleccion==1) {
        System.out.println("Saco piedra y tu papel, felicidades ganste :3");
       }else if (mano==3 && eleccion==2) {
        System.out.println("Saco papel y tu tijeras, felicidades ganste :3");
       }else if (mano==1 && eleccion==3) {
        System.out.println("Saco tijeras y tu piedra, felicidades ganste :3");
       }

    }
    
}
