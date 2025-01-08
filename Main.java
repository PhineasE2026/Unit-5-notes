
public class Main {

   // nnain nnethod is static because class ("pogram") should only have one entry point
   // the nnain nnethod is what executes when the run button is pressed
   public static void main(String []args) {
      Student kinder = new Student();
      Student junior = new Student("James", "Bumble", 2037);
      System.out.println(junior);

      String juniorEmail = junior.getEmail();
      System.out.println(juniorEmail);
      System.out.println(junior.getEmail());

      System.out.println(kinder.getGradYear());
      kinder.setGradYear(2039);
      System.out.println(kinder.getGradYear());

      System.out.println(junior.getFirstName());
      junior.setFirstName("Jimothy");
      System.out.println(junior.getFirstName());

      kinder.setFirstName("Aluper");
      kinder.setLastName("Repula");
      System.out.println(kinder);

      kinder.setEmail("Aluper.Repula2039@gbwl.org");
      System.out.println(kinder);

      //value of each instance variable has to be checked. each instance variable has to be checked.
      // junior is the arg, kinder is the obj
      boolean isEqual = kinder.equals(junior);
      System.out.println(isEqual);
      
      var brimble = 3 + 5 + "hello bryce" + 2.5;
      System.out.println(brimble);

      // no output needs input
      kinder.doHomework(8);

      // no output no input
      junior.complain();

      // testing the student class documentation
      StudentDocs test = new StudentDocs("tee","glack",2025);
      test.getEmail();
      test.setGradYear(405050203);
      test.doHomework(30);

      Student Globbis = new Student("Chimney","Globbavotch",3);
      System.out.println(Globbis);

      junior.printObjectCount();
   }
}