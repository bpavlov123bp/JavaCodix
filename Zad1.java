import java.text.DecimalFormat;
import java.util.Scanner;
public class Zad1 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double priceCoffee = 1.20;
    System.out.print("Inserted money: ");
    double insertedMmoney = input.nextDouble();
    double remainder = insertedMmoney - priceCoffee;
    remainder = remainder * 100;
    remainder = Math.round(remainder);
    remainder = remainder / 100;
    int two = 0;
    int ones = 0;
    int fifty = 0;
    int twenty = 0;
    int ten = 0;
    if(insertedMmoney < priceCoffee)
    {
      System.out.println("You don't have enough money for coffee!");
    }
    System.out.printf("Remainder: %.2f\n", remainder);
    while(remainder >= 2.0)
    {
      two++;
      remainder -= 2.0;
    }
    while(remainder >= 1.0)
    {
      ones++;
      remainder -= 1.0;
    }
    remainder = remainder * 100;
    remainder = Math.round(remainder);
    remainder = remainder / 100;
    while(remainder >= 0.50)
    {
      fifty++;
      remainder -= 0.50;
    }
    while(remainder >= 0.20)
    {
      twenty++;
      remainder -= 0.20;
    }
    while(remainder >= 0.10)
    {
      ten++;
      remainder -= 0.10;
    }
    System.out.println("Change: ");
    System.out.printf(" 1. %d x 2.0 = %.2f\n", two, (two * 2.0));
    System.out.printf(" 1. %d x 1.0 = %.2f\n", ones, (ones * 1.0));
    System.out.printf(" 2. %d x 0.50 = %.2f\n", fifty, (fifty * 0.50));
    System.out.printf(" 3. %d x 0.20 = %.2f\n", twenty, (twenty * 0.20));
    System.out.printf(" 4. %d x 0.10 = %.2f\n", ten, (ten * 0.10));
  }
}
