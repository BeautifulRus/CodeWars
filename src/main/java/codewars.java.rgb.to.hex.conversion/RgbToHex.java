package codewars.java.rgb.to.hex.conversion;

import java.util.HexFormat;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {

        r = Math.min(255,Math.max(0, r));
        g = Math.min(255,Math.max(0, g));
        b = Math.min(255,Math.max(0, b));

        String red = Integer.toHexString(r);
        String green = Integer.toHexString(g);
        String blue = Integer.toHexString(b);

        red = red.length()<2?"0"+red:red;
        green = green.length()<2?"0"+green:green;
        blue = blue.length()<2?"0"+blue:blue;

        return red.toUpperCase()+green.toUpperCase()+blue.toUpperCase();



    }













    public static String hexDecimal (int a){
        if (a == 0) return "00";
        StringBuilder result = new StringBuilder();
        int iterator = -1;
        for (;16*iterator+1 <a;){
        iterator++;
        }
        if (16*iterator != 0){
            hexDecimal(16*iterator);

            if (a-16*iterator >= 0 & a-16*iterator <=9) {
                result.append(a - 16 * iterator);
            }
            else switch (a - 16*iterator) {
                        case (10):
                            result.append("A");
                        case (11):
                            result.append("B");
                        case (12):
                            result.append("C");
                        case (13):
                            result.append("D");
                        case (14):
                            result.append("E");
                        case (15):
                            result.append("F");
                        default:
                            throw new IllegalStateException("Unexpected value: ");
                    }

        }else return result.toString();
return "оно ничего не должно было возвращать";

//если вышло из цикла, значит a уже больше. Мы должны достать итератор и умножить его на 16,
        // это будет результат первого деления. a - 16*iterator будет остаток.
        //после этого, нам нужно 16*iterator запустить этот же цикл с новой a
        //если a-16*iterator = 0, добавляем остаток как 16-ную систему, и выходим из рекурсии




        /*
        1000 / 16 = 62 (остаток 8)
        62 / 16 = 3 (остаток 14, в шестнадцатеричной системе – E)
        3 / 16 = 0 (остаток 3)
*/




    }

}
