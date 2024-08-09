package codewars.java.calculate.average;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Kata{
  public static double find_average(int[] array){


    return Arrays.stream(array).average().getAsDouble();
  }
}