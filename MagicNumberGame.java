
import java.util.Scanner;
/**
 *
 * @author Joe
 */
public class MagicNumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("What is your number?");
        int num = in.nextInt();
        FindNum f = new FindNum(num, "");
        String answer = f.findTheNumber();
        System.out.println("The magic number is: " + answer);
        // TODO code application logic here
    }
    
}