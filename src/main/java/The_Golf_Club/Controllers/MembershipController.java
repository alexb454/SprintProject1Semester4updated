/*package The_Golf_Club.Controllers;

import The_Golf_Club.Repository.Membership;
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
    MembershipRepository repo;

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByStartDate(@RequestParam(required = false) LocalDate startDate) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(startDate == null)
                repo.findByMembershipStartDate(startDate).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByDuration(@RequestParam(required = false) LocalDate duration) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(duration == null)
                repo.findByMembershipDuration(duration).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByMembershipType(@RequestParam(required = false) String membershipType) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(membershipType == null)
                repo.findByMembershipType(membershipType).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByTournaments(@RequestParam(required = false) String currentTournaments, String pastTournaments) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(currentTournaments == null & pastTournaments == null)
                repo.findAll().forEach(memberships::add);
            else if(currentTournaments == null)
                repo.findByMembershipCurrentTournaments(currentTournaments).forEach(memberships::add);
            else
                repo.findByMembershipPastTournaments(pastTournaments).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/members")
    public ResponseEntity<List<Membership>> getAllMembershipsByUpcomingTournaments(@RequestParam(required = false) String upcomingTournaments) {
        try{
            List<Membership> memberships = new ArrayList<Membership>();
            if(upcomingTournaments == null)
                repo.findByMembershipUpcomingTournaments(upcomingTournaments).forEach(memberships::add);
            return new ResponseEntity<>(memberships, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/members")
    public ResponseEntity<Membership> postMembership(@RequestBody Membership membership) {
        try {
            Membership membership1 = (Membership) repo
                    .save(new Membership(membership.getPerson(), membership.getStartDate(), membership.getDuration(), membership.getMembershipType(), membership.getPastTournaments(),
                    membership.getCurrentTournaments(), membership.getUpcomingTournaments()));
            return new ResponseEntity<>(membership1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/members/{id}")
    public ResponseEntity<Membership> updatedMembership(@PathVariable("id") long id, @RequestBody Membership membership) {
        Optional<Membership> membershipInfo = repo.findById(id);
        if (membershipInfo.isPresent()) {
            Membership membership1 = membershipInfo.get();
            membership1.setPerson(membership.getPerson());
            membership1.setStartDate(membership.getStartDate());
            membership1.setDuration(membership.getDuration());
            membership1.setMembershipType(membership.getMembershipType());
            membership1.setCurrentTournaments(membership.getCurrentTournaments());
            membership1.setPastTournaments(membership.getPastTournaments());
            membership1.setUpcomingTournaments(membership.getUpcomingTournaments());
            return new ResponseEntity<>(repo.save(membership1), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/members/{id}")
    public ResponseEntity<Membership> deletedMembership(@PathVariable("id") long id){
        try{
            repo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
*/