package magic8ball;
import java.util.Scanner;
public class AskQuestions {
    public static void main(String[] args) {
//Variables
    char uInput = 'Y';
    String question;
    String response;
    Magic8ball fortuneBall = new Magic8ball();
    
// Scanner
    Scanner kbd = new Scanner(System.in);
    
// Do While loop    
while ((uInput == 'Y') || (uInput == 'y')) {
    System.out.print("Enter Question: ");
    question = kbd.nextLine();
    System.out.println(fortuneBall.ask());
    System.out.print("Do you want to ask another question? (Y/N) ---> ");
    uInput = kbd.nextLine().charAt(0);
    }//Loop
System.out.println("Goodbye!");
    }
}

