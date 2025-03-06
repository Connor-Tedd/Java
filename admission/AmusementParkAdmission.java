/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amusement.park.admission;

// Import packages
import java.util.Scanner;
/**
 *
 * @author conno
 */
public class AmusementParkAdmission {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    // Constants
	final double TICKET = 45.00;
	final double TAX = 0.05;
	final double FEE = 1.99;
	final double DISCOUNT = 10.00;

    // Variables
	int age;
        double feeAmt;
        double taxAmt;
	double price;
	double finalPrice;
        
    // Create scanner object to read keyboard input
        Scanner keyboard = new Scanner (System.in);
        
    // Ask user's age
        System.out.print("How old are you? ");
        age = keyboard.nextInt();   
        
    // Calculate admission fee
        if (age <= 5)
        {
                price = 0.00;
                feeAmt = 0.00;
                taxAmt = 0.00;
                finalPrice = 0.00;
        }
        
        else if (age < 18 || age >= 65)
        {       
                price = TICKET - DISCOUNT;
		feeAmt = FEE;
		taxAmt = (price+feeAmt)*TAX;
		finalPrice = price + feeAmt + taxAmt; 
        }
        
        else
        { 
                price = TICKET;
		feeAmt = FEE;
		taxAmt = (price+feeAmt)*TAX;
		finalPrice = price + feeAmt + taxAmt;
        }
        
    // Output Pricing
        System.out.println("-------------------------");
        System.out.printf("Base ticket: $%.2f\n", price);
        System.out.printf("Fee: $%.2f\n", feeAmt);
        System.out.printf("Surcharge: $%.2f\n", taxAmt);
        System.out.printf("Total Cost: $%.2f\n", finalPrice);
        System.out.println("-------------------------");
    }
    
}
