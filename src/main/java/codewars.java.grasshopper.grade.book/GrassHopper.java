package codewars.java.grasshopper.grade.book;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        int avg = (s1+s2+s3)/3;



        {
            if (90 <= avg) {
                return 'A';
            }
            if (80 <= avg) {
                return 'B';
            }
            if (70 <= avg) {
                return 'C';
            }
            if (60 <= avg) {
                return 'D';
            }
            return 'F';

        }

        }

    }

