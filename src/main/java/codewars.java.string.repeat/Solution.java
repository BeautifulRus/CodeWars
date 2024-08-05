package codewars.java.string.repeat;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        int repeatInterations = 0;
        String finalString = "";
        while (repeat != repeatInterations){
        finalString += string;
        repeatInterations++;
        }
        return finalString;
    }

}
