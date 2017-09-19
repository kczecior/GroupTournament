package entity;

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
        player1.setMatch(this);
        player2.setMatch(this);
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public int getGetPlayer2Score() {
        return getPlayer2Score;
    }

    public void setGetPlayer2Score(int getPlayer2Score) {
        this.getPlayer2Score = getPlayer2Score;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public LocalDateTime getOccurenceDateTime() {
        return occurenceDateTime;
    }

    public void setOccurenceDateTime(LocalDateTime occurenceDateTime) {
        this.occurenceDateTime = occurenceDateTime;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
}
