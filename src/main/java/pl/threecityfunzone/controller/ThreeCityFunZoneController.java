package pl.threecityfunzone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThreeCityFunZoneController {

    @GetMapping(path = "/")
    public String funZoneMainPage(Model model){
        return "FunZoneMainPage";
    }

    @GetMapping(path = "/RegisterLoginPage")
    public String registerLoginPage (Model model) {return "RegisterLoginPage";}

    @GetMapping(path = "/UsersRegisterLoginPage")
    public String usersRegisterLoginPage (Model model) {return "UsersRegisterLoginPage";}
}
