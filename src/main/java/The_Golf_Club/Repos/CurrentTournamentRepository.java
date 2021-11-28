package The_Golf_Club.Repos;


import The_Golf_Club.DataRest.CurrentTournament;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDate;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "current", path = "current")
public interface CurrentTournamentRepository extends PagingAndSortingRepository<CurrentTournament, Long> {
    List<CurrentTournament> findByCurrentTournamentDate(@Param("currentTournametDate") LocalDate currentTournametDate);
    List<CurrentTournament> findCurrentTournamentByTournament(@Param("tournamet") LocalDate tournamet);
}
