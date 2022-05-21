import java.util.Scanner;
public class Zad1Chapter5 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int number1 = input.nextInt();
    System.out.print("Enter second number: ");
    int number2 = input.nextInt();
    int number = number1;
    if(number1 > number2)
    {
      number1 = number2;
      number2 = number;
    }
    System.out.println("number1: " + number1);
    System.out.println("number2: " + number2);
  }
}
