import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	String startDate = in.nextLine();
    	String endDate = in.nextLine();

        int[] date1 = convertDate(startDate);
        int[] date2 = convertDate(endDate);

        String result = "0";

        // if actual day > expected day
        if(date1[1] == date2[1] && date1[0] > date2[0]){
            int diff = date1[0] - date2[0];
            result = "" + diff*15;
        } else if(date1[2] == date2[2] && date1[1] > date2[1]){
            int diff = date1[1] - date2[1];
            result = "" + diff*500;
        } else if(date1[2] > date2[2]){
            result = "10000";
        }
        System.out.println(result);
    }

    public static int[] convertDate(String date){
        Scanner input = new Scanner(date);
        int[] result = new int[3];
        for(int i=0 ; i<3; i++){
            result[i] = input.nextInt();
        }
        return result;
    }
}


