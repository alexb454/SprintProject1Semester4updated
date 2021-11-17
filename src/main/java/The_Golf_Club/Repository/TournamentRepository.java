package The_Golf_Club.Repository;

import java.util.List;

import The_Golf_Club.MembershipAndTournaments.Tournament;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "tournament", path = "tournament")
public interface TournamentRepository extends PagingAndSortingRepository<Tournament, Long>{
    List<Tournament> findByStartOfTournament(@Param("Start") String Start);
    List<Tournament> findByEndOfTournament(@Param("End") String End);
    List<Tournament> findByLocationOfTournament(@Param("Location") String Location);
    List<Tournament> findByFeeOfTournament(@Param("Fee") String Fee);
    List<Tournament> findByPrizeOfTournament(@Param("Prize") String Prize);
    List<Tournament> findByMembersOfTournament(@Param("Members") String Members);
    List<Tournament> findByStandingsOfTournament(@Param("Standings") String Standings);
}
