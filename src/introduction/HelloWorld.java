package introduction;
public class HelloWorld {
  public static void main(String[] args) {
	  
    System.out.println("ola novo teste");
    int age = 37;
    System.out.println(age);

    final String BR = "Brasil";

    System.out.println(BR);

    String fullName = fullName("fabiano", "dolzanes");

    System.out.println(fullName);

  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
}
