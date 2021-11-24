package The_Golf_Club.DataRest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "membership", path = "membership")
public interface MembershipRepository extends PagingAndSortingRepository<Membership, Long> {
    List<Membership> findMembershipByPersonFirstName(@Param("firstName") String firstName);
    List<Membership> findMembershipByPersonLastName(@Param("lastName") String lastName);
    List<Membership> findMembershipByPersonAddress(@Param("address") String address);
    List<Membership> findMembershipByPersonEmail(@Param("email") String email);
    List<Membership> findMembershipByPersonPhoneNumber(@Param("phoneNumber") int phoneNumber);
    List<Membership> findByStartDate(@Param("startDate") LocalDate startDate);
    List<Membership> findByDuration(@Param("duration") LocalDate duration);
    List<Membership> findMembershipByMembershipTypeType(@Param("type") String type);
    List<Membership> findMembershipByCurrentTournamentId(@Param("id") Long id);
    List<Membership> findMembershipByPastTournamentId(@Param("id") Long id);
    List<Membership> findMembershipByUpcomingTournamentId(@Param("id") Long id);
}
