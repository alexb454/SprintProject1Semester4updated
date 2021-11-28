package The_Golf_Club.Repos;

import The_Golf_Club.DataRest.Membership;
import The_Golf_Club.DataRest.MembershipType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "membershiptype", path = "membershiptype")
public interface MembershipTypeRepository extends PagingAndSortingRepository<MembershipType, Long> {
    List<MembershipType> findByType(@Param("type") String type);
    List<MembershipType> findByFamilyPlan(@Param("familyPlan") String familyPlan);
    List<MembershipType> findMembershipTypeByMember(@Param("member") Membership member);
}
