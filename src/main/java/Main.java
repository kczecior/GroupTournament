import entity.Match;
import entity.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by RENT on 2017-09-19.
 */
public class Main {
    public static void main( String[] args ) {

        SessionFactory sessionFactory = SessionFactoryManager.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Player player1 = new Player("a","b","ab");
        Player player2 = new Player("q","w","qw");
        Player player3 = new Player("t","y","ty");
        Player player4 = new Player("n","m","nm");

        Match match1 = new Match(player1,player2);

        session.save(player1);
        session.save(player2);
        session.save(player3);
        session.save(player4);
        session.save(match1);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
