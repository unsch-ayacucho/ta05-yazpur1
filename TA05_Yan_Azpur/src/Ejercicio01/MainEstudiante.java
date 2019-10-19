package Ejercicio01;
import java.util.Scanner;
public class MainEstudiante {
    public static void main(String[] args) {
        //Pedimos el ingreso de 4 números
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite 4 notas: ");
       double n1=entrada.nextInt();
       double n2=entrada.nextInt();
       double n3=entrada.nextInt();
       double n4=entrada.nextInt();
       //Condicional para eliminar el menor número
       if(n1<n2 && n1<n3 && n1<n4){
           //Creacion del objeto obj y asignacion de valor a cada atributo
           Estudiante obj = new Estudiante(252533,"Azpur Garay", "Ing. de sofware", n1, n2, n3, n4);
           obj.PromedioTotal(n2, n3, n4);
           //invocando al metodo de la clase Estudiante
           obj.MostrarDatos();
           System.out.println("El promedio total es "+obj.PromedioTotal(n2, n3, n4)+" y la nota eliminada fue "+n1);           
       } 
       else if(n2<n1 && n2<n3 && n2<n4){
           //Creacion del objeto obj y asignacion de valor a cada atributo
            Estudiante obj = new Estudiante(252533,"Azpur Garay", "Ing. de sofware", n1, n2, n3, n4);
            obj.PromedioTotal(n1, n3, n4);
            //invocando al metodo de la clase Estudiante
            obj.MostrarDatos();
            System.out.println("El promedio total es "+obj.PromedioTotal(n1, n3, n4)+" y la nota eliminada fue "+n2);        
           }
       else if(n3<n1 && n3<n2 && n3<n4){
           //Creacion del objeto obj y asignacion de valor a cada atributo
            Estudiante obj = new Estudiante(252533,"Azpur Garay", "Ing. de sofware", n1, n2, n3, n4);
            obj.PromedioTotal(n1, n2, n4);
            //invocando al metodo de la clase Estudiante
            obj.MostrarDatos();
            System.out.println("El promedio total es "+obj.PromedioTotal(n1, n2, n4)+" y la nota eliminada fue "+n3);
       }
       else{
           //Creacion del objeto obj y asignacion de valor a cada atributo
           Estudiante obj = new Estudiante(252533,"Azpur Garay", "Ing. de sofware", n1, n2, n3, n4);
           obj.PromedioTotal(n1, n2, n3);
           //invocando al metodo de la clase Estudiante
           obj.MostrarDatos();
           System.out.println("El promedio total es "+obj.PromedioTotal(n1, n2, n3)+" y la nota eliminada fue "+n4);       
       }
    }   
    } 
