package The_Golf_Club.Repository;

import java.util.List;


import The_Golf_Club.Java.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
    List<Person> findByName(@Param("name") String name);
    List<Person> findByAddress(@Param("address") String address);
    List<Person> findByEmail(@Param("email") String email);
    List<Person> findByPhoneNumber(@Param("phoneNumber") int phoneNumber);
}
