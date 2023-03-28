package Geometricas;

public class Rectangulo {
    float base,altura;

    public Rectangulo(float base, float altura){
        this.altura=altura;
        this.base=altura;
    }

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

    public void calcularArea(){
        float area=0;
        area=base*altura;
        System.out.println("a altura del rectangulo es: "+altura+" su base es: "+base+" y su área es: "+area);
    }

    
}
