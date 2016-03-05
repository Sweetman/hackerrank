import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt(); 
        in.nextLine();
        String code = in.nextLine();
        int rotate = in.nextInt();
        StringBuilder result = new StringBuilder("");
        int curr = ' ';

        //curr = (((curr-97) + 2) % 25) + 97;
        for(int i = 0; i < length; i++){
            curr = code.charAt(i);
            if(curr >= 97 && curr <= 122){
                curr = (((curr-97) + rotate) % 26) + 97;
            }
            else if(curr >= 65 && curr <= 90){
                curr = (((curr-65) + rotate) % 26) + 65;
            }
            result.append((char)curr);
        }

        System.out.println(result.toString());
    }
}


