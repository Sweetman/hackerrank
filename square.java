import java.io.*;
import java.util.Scanner;
public class square {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in);
        String coefficientLine = input.nextLine();
        String[] coeffStringArr = coefficientLine.split(",");
        double[] coeff = new double[coeffStringArr.length];
        // create an array of the coefficients
        for(int i = 0; i<coeff.length; i++){
            coeff[i] = Double.parseDouble(coeffStringArr[i]);
            System.out.println(coeff[i]);
        }
        // initial sum will always start at 1
        double sum = 1;
        int counter = 0;
        double currVal;
        while(input.hasNextDouble()){
            currVal = input.nextDouble();
            if(counter == coeff.length){
                System.out.println("sum" + sum);
                counter = 0;
                sum = 1;
            }
            sum += coeff[counter] * currVal;
            counter++;
        }
    }
}