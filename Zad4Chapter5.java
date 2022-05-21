import java.util.Scanner;
public class Zad4Chapter5 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("First number: ");
    int number1 = input.nextInt();
    System.out.print("Second number: ");
    int number2 = input.nextInt();
    System.out.print("Third number: ");
    int number3 = input.nextInt();
    int min = -1;
    int max = -1;
    int temp = -1;
    if(number1 > number2)
    {
      if(number1 > number3) {
        max = number1;
        if (number2 > number3) {
          temp = number2;
          min = number3;
        }
        else
        {
          temp = number3;
          min = number2;
        }
      }
      else
      {
        max = number3;
        temp = number1;
        min = number2;
      }
    }
    else
    {
      if(number2 > number3)
      {
        max = number2;
        if(number1 > number3)
        {
          temp = number1;
          min = number3;
        }
        else
        {
          temp = number3;
          min = number1;
        }
      }
      else
      {
        max = number3;
        temp = number2;
        min = number1;
      }
    }
    System.out.println("Max number: " + max);
    System.out.println("Second number: " + temp);
    System.out.println("Min number: " + min);
  }
}
