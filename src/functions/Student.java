 
package functions;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Himel Rana
 */
// Primary Class created for extends
public class Student {
    private SimpleStringProperty name;
    private SimpleStringProperty id;
    private SimpleStringProperty cgpa;
    private boolean isforeign;

    public Student(SimpleStringProperty name, SimpleStringProperty id, SimpleStringProperty cgpa, boolean isforeign) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.isforeign = isforeign;
    }

    public SimpleStringProperty getName() {
        return name;
    }

    public SimpleStringProperty getId() {
        return id;
    }

    public SimpleStringProperty getCgpa() {
        return cgpa;
    }

    public boolean isIsforeign() {
        return isforeign;
    }
    
    
}
