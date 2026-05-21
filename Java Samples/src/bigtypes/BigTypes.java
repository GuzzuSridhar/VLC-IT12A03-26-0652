package bigtypes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigTypes {
    public static void main(String[] args) {
        // BigInteger
        // BigDecimal

        // upper bound is the resource on the computer / server
        long max = Long.MAX_VALUE;
        System.out.println(max);
        BigInteger bigInteger = new BigInteger("9223372036854775808");
        System.out.println(bigInteger);
        // perform arithemetic (no operators allowed)
        System.out.println(bigInteger.add(bigInteger));

        // big decimal
        double dmax = Double.MAX_VALUE;
        System.out.println(dmax);
        BigDecimal bigDecimal = new BigDecimal(dmax + 1);
        System.out.println(bigDecimal);

    }
}
