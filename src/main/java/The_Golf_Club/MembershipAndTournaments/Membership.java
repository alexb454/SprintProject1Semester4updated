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
    private String Name;
    private String Address;
    private String Email;
    private int PhoneNumber;
    private LocalDate StartDate;
    private LocalDate Duration;
    private String MembershipType;
    private String CurrentTournaments;
    private String PastTournaments;
    private String UpcomingTournaments;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getDuration() {
        return Duration;
    }

    public void setDuration(LocalDate duration) {
        Duration = duration;
    }

    public String getMembershipType() {
        return MembershipType;
    }

    public void setMembershipType(String membershipType) {
        MembershipType = membershipType;
    }

    public String getCurrentTournaments() {
        return CurrentTournaments;
    }

    public void setCurrentTournaments(String currentTournaments) {
        CurrentTournaments = currentTournaments;
    }

    public String getPastTournaments() {
        return PastTournaments;
    }

    public void setPastTournaments(String pastTournaments) {
        PastTournaments = pastTournaments;
    }

    public String getUpcomingTournaments() {
        return UpcomingTournaments;
    }

    public void setUpcomingTournaments(String upcomingTournaments) {
        UpcomingTournaments = upcomingTournaments;
    }
}
