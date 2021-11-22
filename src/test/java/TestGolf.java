import java.time.LocalDate;
import java.time.LocalTime;

import The_Golf_Club.DataRest.Membership;
import The_Golf_Club.DataRest.Person;
import The_Golf_Club.DataRest.Tournament;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestGolf {
    @Test
    public void testMembership() {
        Membership actualMembership = new Membership();
        actualMembership.setCurrentTournaments("Bay Bulls Open");
        LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
        actualMembership.setDuration(ofEpochDayResult);
        actualMembership.setId(123L);
        actualMembership.setMembershipType("Pro");
        actualMembership.setPastTournaments("Mario Golf, Downtown Open");
        LocalDate ofEpochDayResult1 = LocalDate.ofEpochDay(1L);
        actualMembership.setStartDate(ofEpochDayResult1);
        actualMembership.setUpcomingTournaments("Badminton");
        assertEquals("Bay Bulls Open", actualMembership.getCurrentTournaments());
        assertSame(ofEpochDayResult, actualMembership.getDuration());
        assertEquals(123L, actualMembership.getId());
        assertEquals("Pro", actualMembership.getMembershipType());
        assertEquals("Mario Golf, Downtown Open", actualMembership.getPastTournaments());
        assertSame(ofEpochDayResult1, actualMembership.getStartDate());
        assertEquals("Badminton", actualMembership.getUpcomingTournaments());
    }

    @Test
    public void testMembershipNotRight() {
        Membership actualMembership = new Membership();
        actualMembership.setCurrentTournaments("Bay Bulls Open");
        LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
        actualMembership.setDuration(ofEpochDayResult);
        actualMembership.setId(123L);
        actualMembership.setMembershipType("Pro");
        actualMembership.setPastTournaments("Mario Golf, Downtown Open");
        LocalDate ofEpochDayResult1 = LocalDate.ofEpochDay(1L);
        actualMembership.setStartDate(ofEpochDayResult1);
        actualMembership.setUpcomingTournaments("Badminton");
        assertNotEquals("Bay Bulls Landmeet", actualMembership.getCurrentTournaments());
        assertSame(ofEpochDayResult, actualMembership.getDuration());
        assertNotEquals(567, actualMembership.getId());
        assertNotEquals("Rookie", actualMembership.getMembershipType());
        assertNotEquals("Mario Tennis", actualMembership.getPastTournaments());
        assertSame(ofEpochDayResult1, actualMembership.getStartDate());
        assertNotEquals("None", actualMembership.getUpcomingTournaments());
    }
    @Test
    public void testPerson() {
        Person actualPerson = new Person();
        actualPerson.setAddress("42 Main St");
        actualPerson.setEmail("josht@hotmail.com");
        actualPerson.setFirstName("Josh");
        actualPerson.setId(123L);
        actualPerson.setLastName("Tucker");
        actualPerson.setPhoneNumber(7772222);
        assertEquals("42 Main St", actualPerson.getAddress());
        assertEquals("josht@hotmail.com", actualPerson.getEmail());
        assertEquals("Josh", actualPerson.getFirstName());
        assertEquals(123L, actualPerson.getId());
        assertEquals("Tucker", actualPerson.getLastName());
        assertEquals(7772222, actualPerson.getPhoneNumber());
    }

    @Test
    public void testTournament() {
        Tournament actualTournament = new Tournament();
        LocalTime ofResult = LocalTime.of(1, 1);
        actualTournament.setEnd(ofResult);
        actualTournament.setFee(10.0);
        actualTournament.setId(123L);
        actualTournament.setLocation("Bay Bulls");
        actualTournament.setMembers("Jimmy, Josh, George");
        actualTournament.setPrize(30.0);
        actualTournament.setStandings("1.Josh, 2.Jimmy, 3.George");
        LocalTime ofResult1 = LocalTime.of(1, 1);
        actualTournament.setStart(ofResult1);
        assertSame(ofResult, actualTournament.getEnd());
        assertEquals(10.0, actualTournament.getFee());
        assertEquals(123L, actualTournament.getId());
        assertEquals("Bay Bulls", actualTournament.getLocation());
        assertEquals("Jimmy, Josh, George", actualTournament.getMembers());
        assertEquals(30.0, actualTournament.getPrize());
        assertEquals("1.Josh, 2.Jimmy, 3.George", actualTournament.getStandings());
        assertSame(ofResult1, actualTournament.getStart());
    }
}
