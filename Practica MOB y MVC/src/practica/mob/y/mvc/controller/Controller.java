package practica.mob.y.mvc.controller;

import practica.mob.y.mvc.view.View;
import practica.mob.y.mvc.person.Person;

/**
 *
 * @author usuario
 */
public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearthMethods searthMethods;
    
     private Person[] personas;
    
    public Controller(View view, 
            SortingMethods sortingMethods, SearthMethods searthMethods){
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searthMethods = searthMethods;
        System.out.println("Controller created");
    }
    
    public void start(){
        int option = 0;
        do{
            option = view.shotMenu();
            switch(option){
                case 1:
                    imputPersons();
                    break;
                case 2:
                    addPerson();
                    break;
                case 3:
                    sortPersons();
                case 100:
                    System.out.println("Adios");
                    break;
                    default:
                        System.out.println("Opcion no valida");
            }
        }while(option != 0);  
    }
    
    public void imputPersons(){
        int numeroPersonas = view.inputInt("Ingrese el numero de personas: ");
        personas = new Person[numeroPersonas];
        for(int i=0; i < numeroPersonas; i++)
            personas[i] = view.imputPerson();
    }
    
    public void addPerson(){
        
        if(personas == null){
            view.inputMessage("No existe, ingrese las personas por primera ves");
            imputPersons();
        }else{
        int numeroPersonas = view.inputInt("Ingrese el numero de personas "
                + "a adicionar: ");
        
        Person[] personasTotales = new Person[personas.length+ numeroPersonas];
        
        for(int i=0; i< personas.length; i++){
            personasTotales[i] = personas[i];
        }
        for(int i = personas.length; i<personasTotales.length; i++){
            personas[i] = view.imputPerson();
        }
        
        personas = personasTotales;
        }
    }

    private void sortPersons() {
        int sortingOption = view.selectSortingMethod();
        if(sortingOption == 1){
            sortingMethods.sortByNameWithBuble(personas);
        }else if(sortingOption == 2){
            sortingMethods.sortByAgeWithSelection(personas);
        }else{
            view.inputMessage("Opcion no valida");
        }
    }
}
