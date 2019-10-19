package Ejercicio01;
public class Estudiante {
    //Atributos
    int codigo;
    String apellidos;
    String especialidad;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    //Generamos un contructor
    public Estudiante(int codigo,String apellidos,String especialidad, double nota1,double nota2,double nota3,double nota4){
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }   
    public double PromedioTotal(double nota1,double nota2,double nota3){
        double promedio = (nota1+nota2+nota3)/3;
        return promedio;
    }
    
    public void MostrarDatos(){
        System.out.println("El codigo del estudiante es "+codigo);
        System.out.println("El apellido completo del estudiante es "+apellidos);
        System.out.println("La especialidad del estudiante es "+especialidad); 
    }
}
