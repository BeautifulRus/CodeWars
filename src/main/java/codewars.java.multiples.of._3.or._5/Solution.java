package codewars.java.multiples.of._3.or._5;

public class Solution {

  public int solution(int number) {
  int iterator = 0;
  int sum =0;
  while (number != iterator){
    if (iterator%3 == 0) {
        sum+=iterator;
    }else if (iterator%5 == 0){
      sum+=iterator;
    }

    iterator++;
  }
    return sum;

  }
}