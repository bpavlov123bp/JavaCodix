import java.util.Scanner;
public class Zad5Chapter5 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int number = input.nextInt();
    String numberWord = "";
    switch(number)
    {
      case 0:
        numberWord = "Zero";
        break;
      case 1:
        numberWord = "One";
        break;
      case 2:
        numberWord = "Two";
        break;
      case 3:
        numberWord = "Three";
        break;
      case 4:
        numberWord = "Four";
        break;
      case 5:
        numberWord = "Five";
        break;
      case 6:
        numberWord = "Six";
        break;
      case 7:
        numberWord = "Seven";
        break;
      case 8:
        numberWord = "Eight";
        break;
      case 9:
        numberWord = "Nine";
        break;
      default:
        System.out.println("Invalid number!");
        break;
    }
    System.out.println(numberWord);
  }
}
