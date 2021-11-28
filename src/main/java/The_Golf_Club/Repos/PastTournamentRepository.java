package The_Golf_Club.Repos;


import The_Golf_Club.DataRest.MembershipType;
import The_Golf_Club.DataRest.PastTournament;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDate;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "past", path = "past")
public interface PastTournamentRepository extends PagingAndSortingRepository<PastTournament, Long> {
    List<PastTournament> findByPastTournamentDate(@Param("pastTournametDate") LocalDate pastTournametDate);
    List<PastTournament> findPastTournamentByTournament(@Param("tournamet") LocalDate tournamet);
}
