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
        int diag1 = 0;
        int diag2 = 0;
        int temp = 0;
        int result = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                temp = in.nextInt();
                if(i==j){
                    diag1+= temp;
                }
                if(i+j == n-1){
                    diag2+= temp;
                }
            }
        }
        System.out.println(Math.abs(diag1-diag2));
    }
}