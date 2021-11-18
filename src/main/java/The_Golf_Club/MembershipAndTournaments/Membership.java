package The_Golf_Club.MembershipAndTournaments;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String address;
    private String email;
    private int phoneNumber;
    private LocalDate startDate;
    private LocalDate duration;
    private String membershipType;
    private String currentTournaments;
    private String pastTournaments;
    private String upcomingTournaments;

    public Membership(String name, String address, String email, int phoneNumber, LocalDate startDate,
                      LocalDate duration, String membershipType, String pastTournaments,
                      String currentTournaments, String upcomingTournaments) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.duration = duration;
        this.membershipType = membershipType;
        this.pastTournaments = pastTournaments;
        this.currentTournaments = currentTournaments;
        this.upcomingTournaments = upcomingTournaments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        phoneNumber = phoneNumber;
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
