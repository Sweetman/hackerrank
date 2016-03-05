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
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}