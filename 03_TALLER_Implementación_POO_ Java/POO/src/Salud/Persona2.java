package Salud;

import java.util.Scanner;

public class Persona2 {
    //Atributos
    private String nombre;
    private String apellido;
    private String tipoDoc;
    private int documento;
    private int edad;
    private String sexo;
    private double pesoActual;
    private double peso;
    private double estatura;
    private double imc;

    

    //metodo contructor vacio


public Persona2(String nombre2, String apellido2, String tipoDoc2, int edad2, String sexo2) {
    }

    public Persona2(String nombre2, String apellido2, String tipoDoc2, int edad2, String sexo2, String cargo,
        double valorHora, int horasTrabajadas, String departamento, double valorTotal) {
}

    //Accesores sirven para acceder a otra clase dentro o fuera del paquete
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }


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
