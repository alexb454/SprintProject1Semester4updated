package The_Golf_Club.DataRest;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private Person person;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate startDate;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate duration;
    @OneToOne
    private MembershipType membershipType;
    @ManyToOne
    private CurrentTournament currentTournament;
    @ManyToOne
    private PastTournament pastTournament;
    @ManyToOne
    private UpcomingTournament upcomingTournament;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDuration() {
        return duration;
    }

    public void setDuration(LocalDate duration) {
        this.duration = duration;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public CurrentTournament getCurrentTournament() {
        return currentTournament;
    }

    public void setCurrentTournament(CurrentTournament currentTournament) {
        this.currentTournament = currentTournament;
    }

    public PastTournament getPastTournament() {
        return pastTournament;
    }

    public void setPastTournament(PastTournament pastTournament) {
        this.pastTournament = pastTournament;
    }

    public UpcomingTournament getUpcomingTournament() {
        return upcomingTournament;
    }

    public void setUpcomingTournament(UpcomingTournament upcomingTournament) {
        this.upcomingTournament = upcomingTournament;
    }
}