package pl.threecityfunzone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.threecityfunzone.model.FunZoneUser;

public interface FunZoneUserRepository extends JpaRepository<FunZoneUser, Long> {
}

