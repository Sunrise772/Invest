/**
 * Program to Calculate Investments
 * 
 * @author      Cody Stone
 * @version 1.0, February 6, 2020
 */
package hmwk05_06;
import java.util.Scanner;

public class Invest {
    /**
    * main - prompts the user for input of investment numbers
    * 
    * @param   args   command line arguments
    * @return  N/A
    */
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        float initialInvestment;
        float periodicInvestment;
        float apr;
        int numYears;
        String frequency;
        int periodWithinTheYear = 1;
        int outputYears = 1;
        float total = 0;
        
        
        //prompt user for input and store it
        System.out.print("I-P-R-Y-C? ");
        initialInvestment = input.nextFloat();
        periodicInvestment = input.nextFloat();
        apr = input.nextFloat();
        numYears = input.nextInt();
        frequency = input.next();
        System.out.println();
        
        //convert annual interest rate to percet
        apr = apr / 100;
        
        switch (frequency) {
            case "annual":
                total = initialInvestment;
                for (int i = 0; i < numYears; i++){
                    total += total * apr;
                    outputYears++;
                    System.out.printf("%02d-%02d          %.2f          %.2f", outputYears, periodWithinTheYear, initialInvestment, total);
                    System.out.println("");
                }
                break;
            case "monthly":
                total = initialInvestment;
                for (int i = 0; i < numYears; i++){
                    total += total * apr;
                    outputYears++;
                    System.out.printf("%02d-%02d          %.2f          %.2f", outputYears, periodWithinTheYear, initialInvestment, total);
                    System.out.println("");
                }
                break;
            case "semi":
                total = initialInvestment;
                for (int i = 0; i < numYears; i++){
                    total += total * apr;
                    outputYears++;
                    System.out.printf("%02d-%02d          %.2f          %.2f", outputYears, periodWithinTheYear, initialInvestment, total);
                    System.out.println("");
                }                
                break;         
        }
    }
}
