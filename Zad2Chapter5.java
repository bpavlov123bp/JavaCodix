import java.util.Scanner;
public class Zad2Chapter5 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int number1 = input.nextInt();
    System.out.print("Enter second number: ");
    int number2 = input.nextInt();
    System.out.print("Enter third number: ");
    int number3 = input.nextInt();
    if(number1 > 0 && number2 > 0 && number3 > 0)
    {
      System.out.println("The product of three numbers is posiive!");
    }
    else if(number1 < 0 || number2 < 0 || number3 < 0)
    {
      System.out.println("The product ot three numbers is negative!");
    }
  }

}
