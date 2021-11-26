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
    List<Membership> findMembershipByMembershipTypeType(@Param("type") String type);
    List<Membership> findMembershipByCurrentTournamentId(@Param("currentId") Long id);
    List<Membership> findMembershipByPastTournamentId(@Param("pastId") Long id);
    List<Membership> findMembershipByUpcomingTournamentId(@Param("upcomingId") Long id);
}
