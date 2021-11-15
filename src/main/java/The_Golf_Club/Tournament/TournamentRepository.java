package The_Golf_Club.Tournament;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Tournaments", path = "Tournaments")
public interface TournamentRepository extends PagingAndSortingRepository<Tournament, Long>{
    List<Tournament> findByNextTournament(@Param("Start") String Start);
}
