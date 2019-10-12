package pl.threecityfunzone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.threecityfunzone.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}

