package The_Golf_Club.Repos;

import java.time.LocalDate;
import java.util.List;

import The_Golf_Club.DataRest.Membership;
import The_Golf_Club.DataRest.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "membership", path = "membership")
public interface MembershipRepository extends PagingAndSortingRepository<Membership, Long> {
    List<Membership> findMembershipByPersonId(@Param("personId") Long id);
    List<Membership> findByStartDate(@Param("startDate") LocalDate startDate);
    List<Membership> findByDuration(@Param("duration") LocalDate duration);
    List<Membership> findMembershipByMembershipTypeId(@Param("membershiptypeId") Long id);
    List<Membership> findMembershipByCurrentTournamentId(@Param("currenttournamentId") Long id);
    List<Membership> findMembershipByPastTournamentId(@Param("pasttournamentId") Long id);
    List<Membership> findMembershipByUpcomingTournamentId(@Param("upcomingtournamentId") Long id);
}
