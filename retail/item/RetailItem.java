package retail.item;

/**
 *
 * @author c.tedd
 */
public class RetailItem {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    
// Create Items
        item Item1 = new item();
        item Item2 = new item();
        item Item3 = new item();
    
// Create Variables for three items.
    
    //Description
        String Description1;
        String Description2;
        String Description3;
    
    // Quantity
        int Quantity1;
        int Quantity2;
        int Quantity3;
    
    // Price
        double Price1;
        double Price2;
        double Price3;
           
// Set Item Description, Quantity, & Price.
    
    // Set item 1
        Item1.setDescription("Hammer");
        Item1.setQuantity(12);
        Item1.setPrice(25.99);
        
    // Set item 2
        Item2.setDescription("Circular Saw");
        Item2.setQuantity(40);
        Item2.setPrice(89.99);
        
    // Set item 3
        Item3.setDescription("Drill");
        Item3.setQuantity(25);
        Item3.setPrice(75.99);  
        
    // Show Item 1
    Description1 = Item1.findDescription();
    Quantity1 = Item1.findQuantity();
    Price1 = Item1.findPrice();
    System.out.println("--------------------------------");
    System.out.println("-----c.tedds shop inventory-----");
    System.out.println("--------------------------------"); 
    System.out.println("Item #1: " + Description1);
    System.out.println("Quantity on hand: " + Quantity1);
    System.out.println("Price: " + Price1);
    System.out.println("--------------------------------");
    
    // Show Item 2
    Description2 = Item2.findDescription();
    Quantity2 = Item2.findQuantity();
    Price2 = Item2.findPrice();
    System.out.println("Item #2: " + Description2);
    System.out.println("Quantity on hand: " + Quantity2);
    System.out.println("Price: " + Price2);
    System.out.println("--------------------------------");
    
        
    // Show Item 3
    Description3 = Item3.findDescription();
    Quantity3 = Item3.findQuantity();
    Price3 = Item3.findPrice();
    System.out.println("Item #3: " + Description3);
    System.out.println("Quantity on hand: " + Quantity3);
    System.out.println("Price: " + Price3);
    System.out.println("--------------------------------");
    }
}
