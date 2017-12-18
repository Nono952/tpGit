import java.util.Scanner;
import org.apache.log4j.Logger;

public class Console {
    private final static Logger logger = Logger.getLogger(Console.class.getName());

    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(Console.class);
        
        int X = 5;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("X personnalisé ? y/n >> ");
        String choice = sc.nextLine();
        
        if(choice.equals("y")) {
            System.out.print("Entrez X : ");
            X = sc.nextInt();
        }
        
        logger.info("X vaut : " + X);
        
        for(int i=0; i<X; i++) {
        	System.out.print("Valeur fib " + Fibonacci.fib(i))
            logger.info("Valeur fib " + Fibonacci.fib(i));
        }
    }
}
