package The_Golf_Club.Java;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
    private LocalDate startDate;
    private LocalDate duration;
    private String membershipType;
    private String currentTournaments;
    private String pastTournaments;
    private String upcomingTournaments;

    public Membership(Person person, LocalDate startDate, LocalDate duration, String membershipType, String pastTournaments,
                      String currentTournaments, String upcomingTournaments) {
        this.person = person;
        this.startDate = startDate;
        this.duration = duration;
        this.membershipType = membershipType;
        this.pastTournaments = pastTournaments;
        this.currentTournaments = currentTournaments;
        this.upcomingTournaments = upcomingTournaments;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        startDate = startDate;
    }

    public LocalDate getDuration() {
        return duration;
    }

    public void setDuration(LocalDate duration) {
        duration = duration;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        membershipType = membershipType;
    }

    public String getCurrentTournaments() {
        return currentTournaments;
    }

    public void setCurrentTournaments(String currentTournaments) {
        currentTournaments = currentTournaments;
    }

    public String getPastTournaments() {
        return pastTournaments;
    }

    public void setPastTournaments(String pastTournaments) {
        pastTournaments = pastTournaments;
    }

    public String getUpcomingTournaments() {
        return upcomingTournaments;
    }

    public void setUpcomingTournaments(String upcomingTournaments) {
        upcomingTournaments = upcomingTournaments;
    }
}