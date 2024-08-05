package codewars.java.fake.binary;

import com.sun.jdi.Value;

import java.util.stream.Stream;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder stringBuilder = new StringBuilder(numberString);
        int iteator = 0;
        while (iteator != stringBuilder.length()) {
            if ((Double.parseDouble(String.valueOf(stringBuilder.charAt(iteator))) < 5)) {
                stringBuilder.setCharAt(iteator, '0');
            } else {
                stringBuilder.setCharAt(iteator, '1');
            }
        iteator++;
        }

        return String.valueOf(stringBuilder);
    }
}