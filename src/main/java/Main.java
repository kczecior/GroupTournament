import entity.HibernateDao;
import entity.Player;

/**
 * Created by RENT on 2017-09-19.
 */
public class Main {
    public static void main( String[] args ) {

        HibernateDao<Player> participantHibernateDao = new HibernateDao<>(Player.class);
    }
}
