package MainCode2;
/**
 * Abstract class representing a user of the system.
 */
public abstract class User {
    
    protected String id;
    protected String name;
    protected String email;
    protected String password;
    protected boolean privilege;
    
    /**
     * Constructor for creating a new user.
     * @param id The user's ID.
     * @param name The user's name.
     * @param email The user's email.
     * @param password The user's password.
     */
    public User(String id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.privilege = false;
    }
    
    /**
     * Returns the user's name.
     * @return The user's name.
     */
    public String getName() {
    	return this.name;
    }
    
    /**
     * Returns the user's email.
     * @return The user's email.
     */
    public String getEmail() {
    	return this.email;
    }
    
    /**
     * Returns the user's password.
     * @return The user's password.
     */
    public String getPassword() {
    	return this.password;
    }
    
    /**
     * Updates the user's name.
     * @param newName The user's new name.
     */
    public void updateName(String newName) {
    	this.name = newName;
    }
    
    /**
     * Updates the user's email.
     * @param newEmail The user's new email.
     */
    public void updateEmail(String newEmail) {
    	this.email = newEmail;
    }
    
    /**
     * Updates the user's password.
     * @param newPassword The user's new password.
     */
    public void updatePassword(String newPassword) {
    	this.password = newPassword;
    }
    
    /**
     * Checks whether the user has privilege or not.
     * @return true if the user has privilege, false otherwise.
     */
    public boolean checkPrivilege() {
		return this.privilege;
	}

}