package The_Golf_Club.Repos;


import The_Golf_Club.DataRest.UpcomingTournament;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDate;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "current", path = "current")
public interface UpcomingTournamentRepository extends PagingAndSortingRepository<UpcomingTournament, Long> {
    List<UpcomingTournament> findByUpcomingTournamentDate(@Param("upcomingTournamentDate") LocalDate upcomingTournamentDate);
    List<UpcomingTournament> findUpcomingTournamentByTournament(@Param("tournament") LocalDate tournament);
}
