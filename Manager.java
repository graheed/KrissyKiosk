package MainCode2;
import MainCode2.Employee;


/**
 * Constructs a new Manager object with the given information.
 *
 * @param id       the ID of the manager
 * @param name     the name of the manager
 * @param email    the email of the manager
 * @param password the password of the manager
 * @param title    the job title of the manager
 */
public class Manager extends Employee{

    public Manager(String id, String name, String email, String password, String title) {
        super(id, name, email, password, title);
        this.title = title;
        this.privilege = true;
    }
    

}
