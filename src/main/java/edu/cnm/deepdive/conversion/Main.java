package edu.cnm.deepdive.conversion;

public class Main {

  public static void main(String[] args) {
    Converter converter = new Converter();
    for (String arg: args) {
      double celcius = Double.parseDouble(arg);
      double fahrenheit = converter.c2f(celcius);
      System.out.printf("Celcius = %6.2f; Fahrenheit = %6.2f%n", celcius, fahrenheit);
    }
  }

}
