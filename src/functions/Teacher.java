 
package functions;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Himel Rana
 * 
 */

// Primary Class created for extends
public class Teacher {
    private  SimpleStringProperty user;
    private  SimpleStringProperty pass;
    private  SimpleStringProperty id;
    private  SimpleStringProperty subject;
    private  SimpleStringProperty name;

    public Teacher(SimpleStringProperty user, SimpleStringProperty pass, SimpleStringProperty id, SimpleStringProperty subject, SimpleStringProperty name) {
        this.user = user;
        this.pass = pass;
        this.id = id;
        this.subject = subject;
        this.name = name;
    }
    // Getters that needed
    public SimpleStringProperty getUser() {
        return user;
    }

    public SimpleStringProperty getPass() {
        return pass;
    }

    public SimpleStringProperty getId() {
        return id;
    }

    public SimpleStringProperty getSubject() {
        return subject;
    }

    public SimpleStringProperty getName() {
        return name;
    }
    

    
    
    
    
    
}
