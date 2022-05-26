//Имате поръчка да направите софтуер,
// който обслужва чейндж бюро на летището.
// Бюрото работи само с левове, долари и евро.
// Дефинирайте еднозначно какви променливи можете да имате и от какъв тип ще бъдат.
import java.util.Scanner;
public class CurrencyExchangeBureau {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.printf("Enter currency: ");
    String currency = input.nextLine();
    System.out.printf("Enter quantity: ");
    int quantity = input.nextInt();
    double leva = 0.0;
    switch(currency)
    {
      case "USD":
        leva = quantity * 1.88;
        System.out.printf("You buy %s dollar for %.2f leva.\n", currency, leva);
        break;
      case "EUR":
        leva = quantity * 1.95583;
        System.out.printf("You buy %s euro for %.2f leva.\n", currency, leva);
        break;
    }
  }
}
