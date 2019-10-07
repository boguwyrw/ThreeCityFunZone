package pl.threecityfunzone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.threecityfunzone.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

