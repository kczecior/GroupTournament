package entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "`Match`")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int player1Score;
    private int player2Score;
    @ManyToOne
    private Player player1;
    @ManyToOne
    private Player player2;
    private boolean finished;

    private LocalDateTime occurrenceDateTime;
    private int round;

    public Match() {}

    public Match(Player player1, Player player2, int round) {
        this.player1 = player1;
        this.player1.addMatchAsPlayer1(this);
        this.player2 = player2;
        this.player2.addMatchAsPlayer2(this);
        this.round = round;
        this.finished = false;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public LocalDateTime getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    public int getRound() {
        return round;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinalScore(int player1Score, int player2Score) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.finished = true;
        this.occurrenceDateTime = LocalDateTime.now();
    }
}
