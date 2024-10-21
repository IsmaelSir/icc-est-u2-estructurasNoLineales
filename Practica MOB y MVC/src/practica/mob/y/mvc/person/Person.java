package practica.mob.y.mvc.person;

/**
 *
 * @author usuario
 */
public class Person {
    private String name;
    private int ege;

    public Person(String name, int ege) {
        this.name = name;
        this.ege = ege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }
    
}
