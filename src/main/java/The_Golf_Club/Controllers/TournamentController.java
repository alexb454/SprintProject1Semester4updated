package The_Golf_Club.Controllers;

import The_Golf_Club.MembershipAndTournaments.Membership;
import The_Golf_Club.MembershipAndTournaments.Tournament;
import The_Golf_Club.Repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3306")
@RestController
@RequestMapping("/api")
public class TournamentController {
    @Autowired
    private TournamentRepository tournamentRepository;

    @GetMapping("/tournament")
    public ResponseEntity<List<Tournament>> getAllTournamentsByTime(@RequestParam(required = false) LocalTime Start, LocalTime End) {
        try{
            List<Tournament> tournaments = new ArrayList<Tournament>();
            if(Start == null & End == null)
                tournamentRepository.findAll().forEach(tournaments::add);
            else if (Start == null)
                tournamentRepository.findByStartOfTournament(Start).forEach(tournaments::add);
            else
                tournamentRepository.findByEndOfTournament(End).forEach(tournaments::add);
            return new ResponseEntity<>(tournaments, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/tournament")
    public ResponseEntity<List<Tournament>> getAllTournamentsByLocation(@RequestParam(required = false) String Location) {
        try{
            List<Tournament> tournaments = new ArrayList<Tournament>();
            if(Location == null)
                tournamentRepository.findByLocationOfTournament(Location).forEach(tournaments::add);
            return new ResponseEntity<>(tournaments, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/tournament")
    public ResponseEntity<List<Tournament>> getAllTournamentsByFee(@RequestParam(required = false) double Fee) {
        try{
            List<Tournament> tournaments = new ArrayList<Tournament>();
            if(Fee == 0)
                tournamentRepository.findByFeeOfTournament(Fee).forEach(tournaments::add);
            return new ResponseEntity<>(tournaments, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/tournament")
    public ResponseEntity<List<Tournament>> getAllTournamentsByPrize(@RequestParam(required = false) double Prize) {
        try{
            List<Tournament> tournaments = new ArrayList<Tournament>();
            if(Prize == 0)
                tournamentRepository.findByPrizeOfTournament(Prize).forEach(tournaments::add);
            return new ResponseEntity<>(tournaments, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/tournament")
    public ResponseEntity<List<Tournament>> getAllTournamentsByMembers(@RequestParam(required = false) String Members) {
        try{
            List<Tournament> tournaments = new ArrayList<Tournament>();
            if(Members == null)
                tournamentRepository.findByMembersOfTournament(Members).forEach(tournaments::add);
            return new ResponseEntity<>(tournaments, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/tournament")
    public ResponseEntity<List<Tournament>> getAllTournamentsByStandings(@RequestParam(required = false) String Standings) {
        try{
            List<Tournament> tournaments = new ArrayList<Tournament>();
            if(Standings == null)
                tournamentRepository.findByStandingsOfTournament(Standings).forEach(tournaments::add);
            return new ResponseEntity<>(tournaments, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping ("/tournament")
    public ResponseEntity<Tournament> postTournament(@RequestBody Tournament tournament) {
        try{
            Tournament tournament1 = (Tournament) tournamentRepository
                    .save(new Tournament(tournament.getStart(), tournament.getEnd(), tournament.getLocation(), tournament.getFee(),
                            tournament.getPrize(), tournament.getMembers(), tournament.getStandings()));
            return new ResponseEntity<>(tournament1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/tournament/{id}")
    public ResponseEntity<Tournament> updatedMembership(@PathVariable("id") long id, @RequestBody Tournament tournament) {
        Optional<Tournament> tournamentInfo = tournamentRepository.findById(id);
        if (tournamentInfo.isPresent()) {
            Tournament tournament1 = tournamentInfo.get();
            tournament1.setStart(tournament1.getStart());
            tournament1.setEnd(tournament1.getEnd());
            tournament1.setLocation(tournament1.getLocation());
            tournament1.setFee(tournament1.getFee());
            tournament1.setPrize(tournament1.getPrize());
            tournament1.setMembers(tournament1.getMembers());
            tournament1.setStandings(tournament1.getStandings());
            return new ResponseEntity<>(tournamentRepository.save(tournament1), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/tournament/{id}")
    public ResponseEntity<Tournament> deletedTournament(@PathVariable("id") long id){
        try{
            tournamentRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
