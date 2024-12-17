/* Example CLASS that defines an OBJECT
Class names like student are always capitalized
Object-Oriented Classes are like BLUEPRINTS
(in another Java class, you create instances from this blueprint)
*/
public class Student {
    // 1. Instance Variables (attributes/data)
    // think of waht this object needs to know
    private String firstName;
    private String lastName;
    private int gradYear;
    private String email;
    

    // 2. Constructors (manuals for setting up an object)
    public Student() {
        firstName = "First";
        lastName = "Last";
        gradYear = 2037;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }

    public Student(String initFirstName, String initLastName, int initGradYear) {
        firstName = initFirstName;
        lastName = initLastName;
        gradYear = initGradYear;
        email = firstName + "." + lastName + gradYear + "@gbwl.org";
    }
    
    // 3. Methods (behaviors associated with the object type)
    public String toString() {
        return ("Student [" + firstName + "," + lastName + "," + gradYear + "," + email + "]");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getEmail() {
        return email;
    }

    // setters

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }
 }