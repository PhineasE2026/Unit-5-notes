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
    private static int currentYear = 2025;
    private static String schoolName = "BWL";
    private static int studentCount = 0;
    

    // 2. Constructors (manuals for setting up an object)
    public Student() {
        this.firstName = "First";
        this.lastName = "Last";
        this.gradYear = 2037;
        this.email = firstName + "." + lastName + gradYear + "@gbwl.org";
        // increment the student object counter static variable
        // do not use this.studentCount because it is data belonging to the class not an object instance...
        studentCount++;
    }

    public Student(String firstName, String lastName, int gradYear) {
        // THIS. THIS. THIS. THIS. THISkeyword indicates THIS.current callling object.
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.email = firstName + "." + lastName + gradYear + "@gbwl.org";
        studentCount++;
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

    public void complain() {
        System.out.println("I have too much work");
    }

    public void doHomework(int numAssignments) {
        for (int i = numAssignments; i > 0; i--) {
            System.out.println("Working working working...");
        }
        System.out.println("Done with homework!");
    }

    public void cheltGobes(double sinGobes) {
        for (double blocks = sinGobes; blocks < 402; blocks += 22.5) {
            System.out.println("Gabis. Globis goopus");
        }
        System.out.println("X");
    }
    
    //example interact with a STATIC variable. have you watched the movie there will be blood
    //methods can also be statico. meaning that behavioraction is associated with the entire class rather then one obejejct.
    public static void printObjectCount() {
        System.out.println(studentCount);
    }
 }