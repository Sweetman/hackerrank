import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double pos = 0;
        double neg = 0;
        double zero = 0;
        int temp = 0;
        for(int i = 0; i<n; i++){
            temp = in.nextInt();
            if(temp > 0)
                pos++;
            else if(temp < 0)
                neg++;
            else if(temp == 0)
                zero++;
        }
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zero/n);
    }
}