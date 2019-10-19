
package Ejercicio02;
public class MainVentana {
    public static void main(String[] args) {
        //creacion de objeto p1
        Ventana p1 = new Ventana();
        //asignacion de valor a cada atributo
            p1.BarraTitulo = "NetBeans";
            p1.BotonMinimizar = "Achica la ventana";
            p1.BotonCerrar = "Elimina la ventana";
            p1.BarraMenu = "Muestra opciones";
            p1.BarraHerramientas = "Muestra funcionalidades";
            p1.Icono = "Un cubo";
        //invocando al metodo de la clase ventana
        p1.mostrarDatosEstudiante();
    }
    
}
