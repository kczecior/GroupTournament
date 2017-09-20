package entity;

import javax.persistence.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String username;

    @OneToMany(mappedBy = "player1")
    private Set<Match> matchesAsPlayer1 = new HashSet<>();
    @OneToMany(mappedBy = "player2")
    private Set<Match> matchesAsPlayer2 = new HashSet<>();

    public Player() {}

    public Player(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    void addMatchAsPlayer1(Match match) {
        matchesAsPlayer1.add(match);
    }

    void addMatchAsPlayer2(Match match) {
        matchesAsPlayer2.add(match);
    }

    public Set<Match> getMatches() {
        Set<Match> matches = new HashSet<>();
        matches.addAll(matchesAsPlayer1);
        matches.addAll(matchesAsPlayer2);
        return Collections.unmodifiableSet(matches);
    }
}
