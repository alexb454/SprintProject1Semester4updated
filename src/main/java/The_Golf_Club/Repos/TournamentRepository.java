package The_Golf_Club.Repos;

import java.time.LocalTime;
import java.util.List;

import The_Golf_Club.DataRest.Tournament;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tournament", path = "tournament")
public interface TournamentRepository extends PagingAndSortingRepository<Tournament, Long>{
    List<Tournament> findByStart(@Param("start") LocalTime start);
    List<Tournament> findByEnd(@Param("end") LocalTime end);
    List<Tournament> findByLocation(@Param("location") String location);
    List<Tournament> findByFee(@Param("fee") double fee);
    List<Tournament> findByPrize(@Param("prize") double prize);
    List<Tournament> findByMembers(@Param("members") String members);
    List<Tournament> findByStandings(@Param("standings") String standings);
}
