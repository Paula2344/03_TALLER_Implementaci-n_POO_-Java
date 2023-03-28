package Geometricas;

public  class Triangulo extends Figuras {

    //Atributos
    float base;
    float altura;

    //metodo constructor
     public Triangulo(float base, float altura){
        this.altura=altura;
        this.base=base;
     }

     //metodos accesores
     
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void calcularArea() {

        float area=0;
        area=(base*altura)/2;
        System.out.println("La base del triangulo es: "+base+ ", su altura: "+altura+ " y su area es: "+area);
        
    }

     
     

}
