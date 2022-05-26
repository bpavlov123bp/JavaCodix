import java.io.*;
public class CharToIntExample {
  public static void main(String[] args)
      throws java.io.IOException
  {
    char symbol = (char) System.in.read();
    //int symbolToNumber = Character.getNumericValue(symbol);
    //int symbolToNumber = Integer.parseInt(String.valueOf(symbol));
    int symbolToNumber = (char)(symbol + '0');
    System.out.println(symbolToNumber);
  }
}
