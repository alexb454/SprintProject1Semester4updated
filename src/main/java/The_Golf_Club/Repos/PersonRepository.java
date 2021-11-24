package The_Golf_Club.Repos;

import java.util.List;

import The_Golf_Club.DataRest.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
    List<Person> findByFirstName(@Param("firstName") String firstName);
    List<Person> findByLastName(@Param("lastName") String lastName);
    List<Person> findByAddress(@Param("address") String address);
    List<Person> findByEmail(@Param("email") String email);
    List<Person> findByPhoneNumber(@Param("phoneNumber") int phoneNumber);
}
