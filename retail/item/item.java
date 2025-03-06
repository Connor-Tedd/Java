package retail.item;

/**
 *
 * @author c.tedd
 */
public class item {
    
// Fields of the Class
    private String Description; // Description (name) of item
    private int Quantity;       // Quantity of item on hand
    private Double Price;       // Price of item
    
// Method Header
public void Item (String Des, int Quan, double Pri) 
        {    
        Description = Des;
        Quantity = Quan;
        Price = Pri;
        }

/**
 * Set commands
 * @author c.tedd
     * @param Des
 */

// Set Description
    public void setDescription(String Des) 
        {
        Description = Des;
        }
    
// Set Quantity
    public void setQuantity(int Quan) 
        {
        Quantity = Quan;
        }

// Set Price
    public void setPrice(Double Pri) 
        {
        Price = Pri;
        }

/**
 * Get Commands
 * @author c.tedd
 * @return 
 */
    
// Get Description
    public String findDescription()
        {
        return Description;
        }
    
// Get Quantity
    public int findQuantity()
        {
        return Quantity;    
        }
    
// Get Price
    public double findPrice() 
        {
        return Price;    
        }
}
