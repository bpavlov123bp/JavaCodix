import java.util.Scanner;
public class Zad3Chapter5 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int number1 = input.nextInt();
    System.out.print("Enter second number: ");
    int number2 = input.nextInt();
    System.out.print("Enter third number: ");
    int number3 = input.nextInt();
    int max = Integer.MIN_VALUE;
    if(number1 > max)
    {
      max = number1;
    }
    if(number2 > max)
    {
      max = number2;
    }
    if(number3 > max)
    {
      max = number3;
    }
    System.out.println("The max number: " + max);
  }
}
