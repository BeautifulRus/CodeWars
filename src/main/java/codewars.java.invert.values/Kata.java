package codewars.java.invert.values;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
  public static int[] invert(int[] array) {




    for(int i = 0; i < array.length; i++) {
      array[i] *= -1;
    }

    return array;
  }
  }
