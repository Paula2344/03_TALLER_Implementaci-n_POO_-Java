package Salud;


public class empleado extends Persona2 {

        //Atributos de propios de la sub clase
        private String cargo;
        private double valorHora;
        private int horasTrabajadas;
        private String departamento;
        private double valorTotal;

        //metodo constructor de la sub clase donde se trajeron los atributos de la super clase
        public empleado(String nombre, String apellido, String tipoDoc, int documento, int edad,  String sexo,double pesoActual, double peso, double estatura, double imc, String cargo, double valorHora, int horasTrabajadas, String departamento, int valorTotal){
            super(nombre,apellido,tipoDoc,edad,sexo);
            this.cargo=cargo;
            this.valorHora=valorHora;
            this.horasTrabajadas=horasTrabajadas;
            this.departamento=departamento;
        }

        //metodos de la sub clase
        public void calcularHorarios(){
           System.out.println("Tipo de documento: "+getTipoDoc());
           System.out.println("Numero de documento: "+getDocumento());
           System.out.println("Nombre: "+getNombre());
           System.out.println("Apellido: "+getApellido());
           System.out.println("Cargo: "+cargo);
           System.out.println("Horas trabajadas: "+horasTrabajadas);
           System.out.println("Valor por horas: "+valorHora);
           System.out.println("Total a pagar: "+valorTotal);

        }
        
}

