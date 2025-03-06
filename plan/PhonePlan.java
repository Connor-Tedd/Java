package phone.plan;
import java.util.Scanner; //Import Scanner
public class PhonePlan {
    
    public static void main(String[] args) {

// Variables
        int userMin;
        char userPlan;
        double userT1;
        double userT2;
        char userP1;
        char userP2;
        int userM1;
        int userM2;

// Create two customers
        MobilePhoneProvider customer1 = new MobilePhoneProvider();
        MobilePhoneProvider customer2 = new MobilePhoneProvider();

// Display plans
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("--------------------------------- Service Plans ---------------------------------");
        System.out.println("-- a. $39.99 per month for 450 minutes, each extra minute(s) $0.45 per minute.");
        System.out.println("-- b. $59.99 per month for 900 minutes, each extra minute $0.40 per minute. -----");
        System.out.println("-- c. $69.99 per month for unlimited minutes. -----------------------------------");
        System.out.println("---------------------------------------------------------------------------------");
// Customer 1 data
        Scanner kbd = new Scanner(System.in);
        System.out.println("Customer 1, which plan?");
        userPlan = kbd.next().charAt(0);
        customer1.setPlan(userPlan);
        System.out.println("Customer 1, How many minutes?");
        userMin = kbd.nextInt();
        customer1.setMins(userMin);

// Customer 2 data
        System.out.println("Customer 2, which plan?");
        userPlan = kbd.next().charAt(0);
        customer2.setPlan(userPlan);
        System.out.println("Customer 2, How many minutes?");
        userMin = kbd.nextInt();
        customer2.setMins(userMin);

// Break
        System.out.println("------------------------------------------");        
        
// Display customer 1 total
        userT1 = customer1.PlanPrice();
        userP1 = customer1.getPlan();
        userM1 = customer1.getMin();
        System.out.println("Customer 1, you selected plan: " + userP1);
        System.out.println("Customer 1, minutes used: " + userM1);
        System.out.println("Customer 1, your total is: $" + userT1);

// Break
        System.out.println("------------------------------------------");

// Display customer 2 total
        userT2 = customer2.PlanPrice();
        userP2 = customer2.getPlan();
        userM2 = customer2.getMin();
        System.out.println("Customer 2, you selected plan: " + userP2);
        System.out.println("Customer 2, minutes used: " + userM2);
        System.out.println("Customer 2, your total is: $" + userT2);
        
// Break
        System.out.println("------------------------------------------");
    }

}
