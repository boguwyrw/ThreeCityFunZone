package pl.threecityfunzone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.threecityfunzone.model.FunZoneUser;

@Repository
public interface FunZoneUserRepository extends JpaRepository<FunZoneUser, Long> {
}

