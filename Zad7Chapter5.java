import java.util.Scanner;
public class Zad7Chapter5 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[5];
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < 5; i++)
    {
      System.out.print("Element " + (i + 1) + ": ");
      numbers[i] = input.nextInt();
      if(numbers[i] > max)
      {
        max = numbers[i];
      }
    }
    System.out.println("The biggest number is: " + max);
  }
}
