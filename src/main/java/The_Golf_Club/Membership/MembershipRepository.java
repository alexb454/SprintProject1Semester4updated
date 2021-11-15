package The_Golf_Club.Membership;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Memberships", path = "Memberships")
public interface MembershipRepository extends PagingAndSortingRepository<Membership, Long> {
    List<Membership> findByMembershipName(@Param("Name") String Name);
}
