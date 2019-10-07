package pl.threecityfunzone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.threecityfunzone.model.FunZoneUser;
import pl.threecityfunzone.model.FunZoneUserDTO;
import pl.threecityfunzone.repository.FunZoneUserRepository;

@Service
public class FunZoneUserService {

    @Autowired
    private FunZoneUserRepository funZoneUserRepository;

    public void saveFunZoneUser(FunZoneUserDTO funZoneUserDTO){
        FunZoneUser funZoneUserCreated = new FunZoneUser();
        funZoneUserCreated.setFunUserName(funZoneUserDTO.getFunUserName());
        funZoneUserRepository.save(funZoneUserCreated);
    }

}
