package MainCode2;
import MainCode2.User;

public class Employee extends User{
	protected String title;
	
	/**
	 * Constructs a new Employee object with the given information.
	 *
	 * @param id       the ID of the employee
	 * @param name     the name of the employee
	 * @param email    the email of the employee
	 * @param password the password of the employee
	 * @param title    the job title of the employee
	 */
	public Employee(String id, String name, String email, String password,String title) {
        super(id, name, email, password);
        this.title = title;
        this.privilege = true;
    }
	

}
