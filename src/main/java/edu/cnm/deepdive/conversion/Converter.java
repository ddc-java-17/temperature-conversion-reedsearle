package edu.cnm.deepdive.conversion;

public class Converter {

  private static final double CELCIUS_FAHRENHEIT_SCALE_FACTOR = 1.8;
  private static final double CELCIUS_FAHRENHEIT_OFFSET = 32.0;

  public double c2f (double celcius) {
    return CELCIUS_FAHRENHEIT_SCALE_FACTOR * celcius + CELCIUS_FAHRENHEIT_OFFSET;
  }

}
