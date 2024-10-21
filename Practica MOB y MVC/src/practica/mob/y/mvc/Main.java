package practica.mob.y.mvc;

import practica.mob.y.mvc.view.View;
import practica.mob.y.mvc.controller.*;

/**
 *
 * @author usuario
 */
public class Main {
    
    public static void main(String[] args) {
        // Instanciamos la vista
        View vista = new View();
        
        // Instanciamos los metodos 
        SearthMethods searthMethods = new SearthMethods();
        SortingMethods sortingMethods = new SortingMethods();
        
        // Instamciamos el controlador
        Controller controller = new Controller(vista, sortingMethods, searthMethods);
    }
    
}
