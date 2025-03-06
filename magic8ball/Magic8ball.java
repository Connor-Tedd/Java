package magic8ball;
import java.util.Random;
public class Magic8ball {
    private String[] ans = new String[12]; 
    
public Magic8ball() {
    //Array assignment
    ans[0] = "Yes, of course!";
    ans[1] = "Without a doubt, yes.";
    ans[2] = "You can count on it.";
    ans[3] = "For sure!";
    ans[4] = "Ask me again later.";
    ans[5] = "It is not looking good.";
    ans[6] = "I cannot tell you right now.";       
    ans[7] = "I am having trouble seeing the future.";       
    ans[8] = "I will tell you after my nap.";       
    ans[9] = "No way!";
    ans[10] = "I do not this so.";         
    ans[11] = "The answer is clearly NO!";
}

public String ask(){
    // variables, arrays, & constants.
    int ranNum;
    String answer;
    final int MIN = 0;
    final int MAX = 11;

    // Generate random number
    Random generator = new Random();
    ranNum = generator.nextInt(MAX) + MIN;
    answer = ans[ranNum];

return answer;
    }
}

