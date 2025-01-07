/* Example CLASS that defines an OBJECT
Class names like student are always capitalized
Object-Oriented Classes are like BLUEPRINTS
(in another Java class, you create instances from this blueprint)
*/
/**
 * @author AGHGHHHHHHHTRGKFDSFODOCXVOGOOEqw
 * @since 6Jan2025
 * @version 1.0
 * This class defines a student object, and includes formal documentation comments.
 */
public class StudentDocs {
    // 1. Instance Variables (attributes/data)
    // think of waht this object needs to know
    private String firstName;
    private String lastName;
    private int gradYear;
    private String email;
    

    /**
     * Constructor that sets default values for each of the instance variables defined above :)
     */
    // 2. Constructors (manuals for setting up an object)
    public StudentDocs() {
        firstName = "First";
        lastName = "Last";
        gradYear = 2037;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }

    /**
     * Constructor that assigns provided values to the object's instance variables, and creates an email address based on those values. :)
     * @param initFirstName a String representing the first name
     * @param initLastName a String representing the last name
     * @param initGradYear an int representing the graduation year
     */
    public StudentDocs(String initFirstName, String initLastName, int initGradYear) {
        firstName = initFirstName;
        lastName = initLastName;
        gradYear = initGradYear;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }
    
    // 3. Methods (behaviors associated with the object type)
    /**
     * @return String representing the object instance variables
     */
    public String toString() {
        return ("Student [" + firstName + "," + lastName + "," + gradYear + "," + email + "]");
    }

    /**
     * @return String representing first name of this object
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return The last name of the student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return The student's graduation year
     */
    public int getGradYear() {
        return gradYear;
    }

    /**
     * @return Student emailo
     */
    public String getEmail() {
        return email;
    }

    // setters

    /**
     * @param newFirstName - a String to change the value of student first name..
     */
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    /**
     * @param newEmail - a void return type -- a String to change the email.
     */
    public void setEmail(String newEmail) {
        email = newEmail;
    }

    /**
     * Prints a complaint message
     */
    public void complain() {
        System.out.println("I have too much work");
    }

    /**
     * Loops from numAssignments down,
     * @param numAssignments - Int representing amount of hw assignments
     * For loop which prints
     */
    public void doHomework(int numAssignments) {
        for (int i = numAssignments; i > 0; i--) {
            System.out.println("Working working working...");
        }
        System.out.println("Done with homework!");
    }
 }