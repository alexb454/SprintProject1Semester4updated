package The_Golf_Club.Repository;

import java.time.LocalDate;
import java.util.List;

import The_Golf_Club.Java.Membership;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "members", path = "members")
public interface MembershipRepository extends PagingAndSortingRepository<Membership, Long> {
    List<Membership> findByMembershipStartDate(@Param("startDate") LocalDate startDate);
    List<Membership> findByMembershipDuration(@Param("duration") LocalDate duration);
    List<Membership> findByMembershipType(@Param("membershipType") String membershipType);
    List<Membership> findByMembershipCurrentTournaments(@Param("currentTournaments") String currentTournaments);
    List<Membership> findByMembershipPastTournaments(@Param("pastTournaments") String pastTournaments);
    List<Membership> findByMembershipUpcomingTournaments(@Param("upcomingTournaments") String upcomingTournaments);
}
