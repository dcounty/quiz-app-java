import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    // Print the question
    System.out.println("2 + 2 = 4");
    System.out.println("True");
    System.out.println("False");

    // Get the user's answer
    System.out.print("Enter your answer (T or F): ");
    String answer = input.nextLine().toUpperCase();

    // Check the answer
    if (answer.equals("T")) 
    {
      System.out.println("Correct! 🎉");
    } 
      else 
    {
      System.out.println("Incorrect. The correct answer is True.");
    }

    input.close();
  }
}
