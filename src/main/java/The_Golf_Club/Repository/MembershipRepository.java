package The_Golf_Club.Repository;

import java.util.List;

import The_Golf_Club.MembershipAndTournaments.Membership;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "members", path = "members")
public interface MembershipRepository extends PagingAndSortingRepository<Membership, Long> {
    List<Membership> findByMembershipName(@Param("Name") String Name);
    List<Membership> findByMembershipAddress(@Param("Address") String Address);
    List<Membership> findByMembershipEmail(@Param("Email") String Email);
    List<Membership> findByMembershipPhoneNumber(@Param("PhoneNumber") String PhoneNumber);
    List<Membership> findByMembershipStartDate(@Param("StartDate") String StartDate);
    List<Membership> findByMembershipDuration(@Param("Duration") String Duration);
    List<Membership> findByMembershipMembershipType(@Param("MembershipType") String MembershipType);
    List<Membership> findByMembershipCurrentTournaments(@Param("CurrentTournaments") String CurrentTournaments);
    List<Membership> findByMembershipPastTournaments(@Param("PastTournaments") String PastTournaments);
    List<Membership> findByMembershipUpcomingTournaments(@Param("UpcomingTournaments") String UpcomingTournaments);
}
