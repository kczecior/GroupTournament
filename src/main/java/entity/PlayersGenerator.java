package entity;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class PlayersGenerator {

    private static HibernateDao<Player> hd;

    public PlayersGenerator(HibernateDao<Player> hd) {
        this.hd = hd;
    }

    public static void generate(int numberOfPlayers) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            hd.add(new Player("playerName" + i, "PlayerLastName" + i, "defaultUserName" + i));
        }
    }

}
