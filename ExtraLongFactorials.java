import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class ExtraLongFactorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = BigInteger.valueOf(in.nextInt());
        System.out.println(factorial(n));
    }

    public static BigInteger factorial(BigInteger n){
        if(n.compareTo(BigInteger.valueOf(0)) == 0)
            return BigInteger.valueOf(1);
        return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
    }
}


