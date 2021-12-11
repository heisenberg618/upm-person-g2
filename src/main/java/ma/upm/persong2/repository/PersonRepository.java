package ma.upm.persong2.repository;

import ma.upm.persong2.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Elattar Saad
 * @version 1.0
 * @since 11/12/2021
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
