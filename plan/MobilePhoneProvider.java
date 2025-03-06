package phone.plan;
public class MobilePhoneProvider {

//Variables    
    private final double BASEA = 39.99;
    private final double BASEB = 59.99;
    private final double BASEC = 69.99;
    private final double MINA = 0.45;
    private final double MINB = 0.40;
    private char userPlan; // User's Plan
    private int min; //User's minutes
    double userTotal; // User's Total
    double Total;

    public void customer(char up, int mn, double ut) {
        userPlan = up;
        min = mn;
        Total = ut;
    }

// User's total calculation
    public double PlanPrice() {

        double minCost; // Users cost of minutes
// Logic test
        if (userPlan == 'A' || userPlan == 'a') {
            if (min > 450) {
                minCost = (min - 450) * MINA;
                Total = BASEA + (minCost);
            } else {
                Total = BASEA;
            }

        } else if (userPlan == 'B' || userPlan == 'b') {
            if (min > 900) {
                minCost = (min - 900) * MINB;
                Total = BASEB + (minCost);
            } else {
                Total = BASEB;
            }

        } else if (userPlan == 'C' || userPlan == 'c') {
            Total = BASEC;
        }
        return Total;
    }

// Setters
    public void setMins(int userMin) {
        min = userMin;
    }

    public void setPlan(char phonePlan) {
        userPlan = phonePlan;
    }

    public void setTotal(double userTotal) {
        Total = userTotal;
    }

// Getters
    public char getPlan() {
        char plan;
        plan = userPlan;
        return plan;
    }
    public int getMin() {
        int Min;
        Min = min;
        return Min;
    }
// End
}
