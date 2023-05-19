
import java.util.Random;

/**Michael Reed
 * ReedLab
 * @author Michael Reed
 */
public class SixSides {

    


    public static void main(String[] args) {
        
        Random rolledDice = new Random();
        int dice = 6;
        int shownSide = rolledDice.nextInt(dice) + 1;
        System.out.println("You rolled a: " + shownSide+"!");
   }

}
