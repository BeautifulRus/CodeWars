package codewars.java.counting.sheep.dot.dot.dot;

import java.util.Arrays;
import java.util.Objects;

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    // TODO May the force be with you
      return (int) Arrays.stream(arrayOfSheeps).filter(Objects::nonNull).filter(b -> b).count();

  }
}