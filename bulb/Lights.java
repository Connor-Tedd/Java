package bulb;
import java.util.Scanner;
public class Lights {
public static void main(String[] args) {

// Variables
int userin = 0;
Bulb lightBulb = new Bulb();
boolean status;

// Scanner
Scanner kbd = new Scanner(System.in);
    
// MENU
    System.out.println("======================");
    System.out.println("1.      Turn light on.");
    System.out.println("2.     Turn light off.");
    System.out.println("3.       Light Status.");
    System.out.println("4.               Exit.");
    System.out.println("======================");

// MENU logic
while (userin != 4) {                                       //While Statement
    System.out.println("Enter choice: ");                 // Prompt User
    userin = kbd.nextInt();
    
    if (userin == 1) {         // Light ON
        lightBulb.setBulbON();
    } // IF 1
    
    else if (userin == 2) {    // Light OFF
        lightBulb.setBulbOFF();
    } // IF 2
    
    else if (userin == 3) {    // Status
        status = lightBulb.getBulbStatus();
        if (status == false)
            System.out.println("The Light is OFF");
        else 
            System.out.println("The Light is ON");
    } // IF 3
    
    else if (userin <= 0 || userin >= 5){
        System.out.println("Please enter a valid input."); // Invalid Input
    } // IF userin=/= 1-4
} // While
System.out.println("Goodbye!");                            // Goodbye Message
    }
    
}
