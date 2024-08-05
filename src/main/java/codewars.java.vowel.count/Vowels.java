package codewars.java.vowel.count;

import java.util.Arrays;

public class Vowels {

  public static int getCount(String str) {
    int count = 0;
    char [] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (int i = 0; str.length() != i; i++)
    {
      for (int q = 0; q != vowels.length; q++){
          if (str.charAt(i) == vowels[q]) {
              count++;
          }
      }
    }


    return count;
  }

}