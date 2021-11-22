package The_Golf_Club.DataRest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "membership", path = "membership")
public interface MembershipRepository extends PagingAndSortingRepository<Membership, Long> {
    List<Membership> findByStartDate(@Param("startDate") LocalDate startDate);
    List<Membership> findByDuration(@Param("duration") LocalDate duration);
    List<Membership> findByMembershipType(@Param("membershipType") String membershipType);
    List<Membership> findByCurrentTournaments(@Param("currentTournaments") String currentTournaments);
    List<Membership> findByPastTournaments(@Param("pastTournaments") String pastTournaments);
    List<Membership> findByUpcomingTournaments(@Param("upcomingTournaments") String upcomingTournaments);
}
