package The_Golf_Club.Controllers;

import The_Golf_Club.MembershipAndTournaments.Membership;
import The_Golf_Club.Repository.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;

@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/api")
public class MembershipController {
    @Autowired
    private MembershipRepository membershipRepository;

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByName(@RequestParam(required = false) String Name) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(Name == null)
                membershipRepository.findByMembershipName(Name).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByAddress(@RequestParam(required = false) String Address) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(Address == null)
                membershipRepository.findByMembershipAddress(Address).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByEmail(@RequestParam(required = false) String Email) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(Email == null)
                membershipRepository.findByMembershipEmail(Email).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByPhoneNumber(@RequestParam(required = false) int PhoneNumber) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(PhoneNumber == 0)
                membershipRepository.findByMembershipPhoneNumber(PhoneNumber).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByStartDate(@RequestParam(required = false) LocalDate StartDate) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(StartDate == null)
                membershipRepository.findByMembershipStartDate(StartDate).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByDuration(@RequestParam(required = false) LocalDate Duration) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(Duration == null)
                membershipRepository.findByMembershipDuration(Duration).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByDuration(@RequestParam(required = false) String MembershipType) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(MembershipType == null)
                membershipRepository.findByMembershipType(MembershipType).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByTournaments(@RequestParam(required = false) String CurrentTournaments, String PastTournaments) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(CurrentTournaments == null & PastTournaments == null)
                membershipRepository.findAll().forEach(memberships::add);
            else if(CurrentTournaments == null)
                membershipRepository.findByMembershipCurrentTournaments(CurrentTournaments).forEach(memberships::add);
            else
                membershipRepository.findByMembershipPastTournaments(PastTournaments).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByUpcomingTournaments(@RequestParam(required = false) String UpcomingTournaments) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(UpcomingTournaments == null)
                membershipRepository.findByMembershipUpcomingTournaments(UpcomingTournaments).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*@PostMapping("/members")
    public ResponseEntity<Membership> postMembership(@RequestBody Membership membership) {
        try {
            Membership _membership = membershipRepository;
                    .save(new Membership(membership.getName(), membership.getAddress(), membership.getEmail(), membership.getPhoneNumber(),
                            membership.getStartDate(), membership.getDuration(), membership.getMembershipType(), membership.getPastTournaments(),
                    membership.getCurrentTournaments(), membership.getUpcomingTournaments()));
            return new ResponseEntity<>(_membership, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/
}
