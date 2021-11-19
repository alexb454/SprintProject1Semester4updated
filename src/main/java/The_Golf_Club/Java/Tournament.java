package The_Golf_Club.Java;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalTime start;
    private LocalTime end;
    private String location;
    private double fee;
    private double prize;
    @OneToOne
    @JoinColumn(name = "members_id")
    private Membership members;
    private String Standings;

    public Tournament(LocalTime start, LocalTime End, String Location, double Fee, double Prize,
                      Membership Members, String Standings){
        this.start = start;
        this.end = End;
        this.location = Location;
        this.fee = Fee;
        this.prize = Prize;
        this.members = Members;
        this.Standings = Standings;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public Membership getMembers() {
        return members;
    }

    public void setMembers(Membership members) {
        this.members = members;
    }

    public String getStandings() {
        return Standings;
    }

    public void setStandings(String standings) {
        Standings = standings;
    }
}
