import java.util.Scanner;

/**
 *The hello world program
 * @author Tyler.J
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  //ask user for name  
   System.out.println("Please enter your name:");
  
  // creating a Scanner for user input
  Scanner input = new Scanner(System.in);
  
  //declare and initalize the name varible
  String name = input.nextLine();

  // say hello to the user
  System.out.println("hello " + name);

  // Ask for the year they were born
  System.out.println("Please enter the year you were born");

  //create the varible to store the year they were born
  int birthYear = input.nextInt();

  // calculate the approziment age
  int age = 2021 - birthYear;

  // let the user know their age
  System.out.println("You are approximately " + age +     " years old.");
  }
}
