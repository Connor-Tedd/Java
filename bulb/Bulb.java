package bulb;
public class Bulb {
    
// Variables
    private boolean status;

    public Bulb() {                     // Constructor
        status = false;
    }
    
    public void setBulbON() {           // Bulb ON
        status = true;
    }

    public void setBulbOFF(){           // Bulb ON
        status = false;
    }

    public boolean getBulbStatus() {    // Bulb Status
        return status;
    }          
}