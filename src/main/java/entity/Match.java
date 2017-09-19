package entity;

import entity.Player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int player1Score;
    private int getPlayer2Score;
    private boolean finished;
    private int round;
    private LocalDateTime occurenceDateTime;
    private Player player1;
    private Player player2;

    public Match() {
    }

    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
}
