/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg1.restaurant.bill;

// Import Packages and Classes.
import java.util.Scanner;
import java.text.*;

/**
 *
 * @author c.tedd
 */
public class Assignment1RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables
        float spent, tax, tip, total;

        // Create Scanner Object To Read Keyboard Input
        Scanner keyboard = new Scanner(System.in);

        // Get Amount spent
        System.out.println("Input total dollar amount spent: ");
        spent = keyboard.nextFloat();

        // Calculate Tax (7.5%)
        tax = spent * 0.075F;

        // Calculate Tip (18%)
        tip = spent * 0.18F;

        // Calculate total
        total = spent + tax + tip;

        // Number Format
        NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();

        // Display Bill
        System.out.println("==========================");
        System.out.println("| Food:           " + fmtCurrency.format(spent) + " |");
        System.out.println("| Tax:            " + fmtCurrency.format(tax) + "  |");
        System.out.println("| Tip:            " + fmtCurrency.format(tip) + "  |");
        System.out.println("| Total:          " + fmtCurrency.format(total) + " |");
        System.out.println("==========================");
    }

}
