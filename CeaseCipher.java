//Напишете задача, която кодира 4 променливи от тип char
//посредством шифъра на Цезар.
//Въвеждат се четирите символа и отместването(ключа)
//Извежда се шифрираното съобщение.
//пример:
//offset:2
//symbol 1: 106
//symbol 2: 97
//symbol 3: 118
//symbol 4: 97
//message: lcxc
import java.util.*;
public class CeaseCipher {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter message: ");
    String text = input.nextLine();
    System.out.print("Value by which each character in the message shifted: ");
    int shift = input.nextInt();
    String newText = "";
    char alphabet;
    for(int i = 0; i < text.length(); i++)
    {
      alphabet = text.charAt(i);
      if(alphabet >= 'a' && alphabet <= 'z')
      {
        alphabet = (char)(alphabet + shift);
        if(alphabet > 'z')
        {
          alphabet = (char)(alphabet + 'a' - 'z' - 1);
        }
        newText = newText + alphabet;
      }
      else if(alphabet >= 'A' && alphabet <= 'Z')
      {
        alphabet = (char)(alphabet + shift);
        if(alphabet > 'Z')
        {
          alphabet = (char)(alphabet + 'A' - 'Z' - 1);
        }
        newText = newText + alphabet;
      }
      else
      {
        newText = newText + alphabet;
      }
    }
    System.out.println("New Text: " + newText);
  }
}
