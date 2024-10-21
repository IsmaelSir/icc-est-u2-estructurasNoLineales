package practica.mob.y.mvc.view;

import java.util.Scanner;
import practica.mob.y.mvc.person.Person;

/**
 *
 * @author usuario
 */
public class View {
    private Scanner scanner;

    public View() {
    }
 
    public View(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public int shotMenu(){
        System.out.println("*******Menu*******");
        System.out.println("1. Ingresar Persona");
        
        System.out.println("100. Salir");
        System.out.print("Ingrese un menu: ");
        return scanner.nextInt();
    }
    
    public int inputInt(String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    public Person imputPerson(){
        String name = inputName();
        int ege = inputAge();
        return new Person(name, ege);
    }
    
    public String inputName(){
        System.out.print("Ingrese el nombre:");
        return scanner.next();
    }
    
    public int inputAge(){
        return inputInt("Ingrese la edad: ");
    }
    public void inputMessage(String mensaje){
        System.out.println(mensaje);
    }
    
    public int selectSortingMethod(){
        System.out.println("****** Ingrese la condicion a ordenar *******");
        System.out.println("1. Por nombre");
        System.out.println("2. Por edad");
        System.out.println("Ingrese una obcion: ");
        return scanner.nextInt();
    }
}
