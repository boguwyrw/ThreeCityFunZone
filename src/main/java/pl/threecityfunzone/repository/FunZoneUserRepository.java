package pl.threecityfunzone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.threecityfunzone.model.FunZoneUser;

import java.util.Optional;

public interface FunZoneUserRepository extends JpaRepository<FunZoneUser, Long> {

    //Optional<FunZoneUser> findFunZoneUserByFunUserName(String funUserName);

}

