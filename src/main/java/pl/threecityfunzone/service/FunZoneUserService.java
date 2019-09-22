package pl.threecityfunzone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.threecityfunzone.model.FunZoneUser;
import pl.threecityfunzone.repository.FunZoneUserRepository;

import java.util.List;

@Service
public class FunZoneUserService {

    @Autowired
    private FunZoneUserRepository funZoneUserRepository;

    public void saveFunZoneUser(FunZoneUser funZoneUser){
        funZoneUserRepository.save(funZoneUser);
    }
/*
    public List<FunZoneUser> getFunZoneUser(){
        funZoneUserRepository.findAll();
    }
*/
}