package The_Golf_Club.MembershipAndTournaments;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalTime Start;
    private LocalTime End;
    private String Location;
    private double Fee;
    private double Prize;
    private String Members;
    private String Standings;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalTime getStart() {
        return Start;
    }

    public void setStart(LocalTime start) {
        Start = start;
    }

    public LocalTime getEnd() {
        return End;
    }

    public void setEnd(LocalTime end) {
        End = end;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public double getFee() {
        return Fee;
    }

    public void setFee(double fee) {
        Fee = fee;
    }

    public double getPrize() {
        return Prize;
    }

    public void setPrize(double prize) {
        Prize = prize;
    }

    public String getMembers() {
        return Members;
    }

    public void setMembers(String members) {
        Members = members;
    }

    public String getStandings() {
        return Standings;
    }

    public void setStandings(String standings) {
        Standings = standings;
    }
}
