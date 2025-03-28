import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // TODO: Create objects and test code here.
    SpecialtyCoffee n1 = new SpecialtyCoffee();
    SpecialtyCoffee n2 = new SpecialtyCoffee("large", "mocha", "caramel");
    SpecialtyCoffee n3 = new SpecialtyCoffee("medium", true, 2, "cappuccino", "gingerbread");
    System.out.println(n1.toString());
    System.out.println(n2.toString());
    System.out.println(n3.toString());
  }
}
