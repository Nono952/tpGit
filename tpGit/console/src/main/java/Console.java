import java.util.Scanner;
import org.apache.log4j.Logger;
import twitter4j.*;
import java.util.List;


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
        	System.out.println("Valeur fib " + Fibonacci.fib(i));
            logger.info("Valeur fib " + Fibonacci.fib(i));
        }
        
        System.out.println("Voici les differents tweets avec '#fibonacci'");
        Twitter twitter = new TwitterFactory().getInstance();
        try {
            Query query = new Query("#fibonacci");
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    String t = "@" + tweet.getUser().getScreenName() + " - " + tweet.getText();
                    System.out.println(t);
                    logger.info(t);
                }
            } while ((query = result.nextQuery()) != null);
            System.exit(0);
        } catch (TwitterException te) {
            logger.error(te.getStackTrace());
            System.out.println("Exception" + te.getMessage());
            System.exit(-1);
        }

        
    }
}
