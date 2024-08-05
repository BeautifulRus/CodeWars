package codewars.java.detect.pangram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class PangramChecker {
  public boolean check(String sentence){
    char[] arrChars = {'A', 'B', 'C' , 'D', 'E', 'F', 'G',
                        'H', 'I', 'J', 'K', 'L', 'M', 'N',
                        'O','P', 'Q', 'R', 'S', 'T', 'U',
                        'V','W', 'X', 'Y', 'Z'};
    StringBuilder stringBuilderHasChars = new StringBuilder();
    sentence= sentence.toUpperCase();

    //поиск нужных символов и добавление их в stringBuilderHasChars
    int numCharInSentence = 0;
    for (;sentence.length() != numCharInSentence;numCharInSentence++){
      int numArrChars = 0;

      for (;sentence.charAt(numCharInSentence) != arrChars[numArrChars];numArrChars++){
        if (numArrChars == 25/*кол-во символов в алфавите*/){

          if (sentence.charAt(numCharInSentence) == arrChars[numArrChars]){
            stringBuilderHasChars.append(sentence.charAt(numCharInSentence));
            break;
          }else break;
        }
      }
      if (sentence.charAt(numCharInSentence) == arrChars[numArrChars]){
        stringBuilderHasChars.append(sentence.charAt(numCharInSentence));}
    }


    //Distinct + UpperCase
    String string = String.valueOf(stringBuilderHasChars).toUpperCase();
    StringBuilder stringBuilderTotal = new StringBuilder();
    stringBuilderHasChars.chars().distinct().forEach(c -> stringBuilderTotal.append((char)c));


    Arrays.sort(new StringBuilder[]{stringBuilderTotal});
    char [] arrCharsSBTotal = stringBuilderTotal.toString().toCharArray();
    Arrays.sort(arrCharsSBTotal);


    return Arrays.equals(arrChars, arrCharsSBTotal);
  }
}