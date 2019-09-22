package pl.threecityfunzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.threecityfunzone.model.FunZoneUser;
import pl.threecityfunzone.service.FunZoneUserService;

@Controller
//@RequestMapping(path = "/UsersRegisterLoginPage")
public class FunZoneUserController {

    private String pageTitle = "";

    @Autowired
    private FunZoneUserService funZoneUserService;

    @GetMapping(path = "/UsersRegisterLoginPage/UsersRegisterPage")
    public String usersRegisterPage (Model model) {
        pageTitle = "Users Register Page";
        model.addAttribute("pageTitle", pageTitle);
        return "UsersRegisterPage";
    }

    @PostMapping(path = "/UsersRegisterLoginPage/UsersRegisterPage")
    public String usersRegisterPage(Model model, FunZoneUser funZoneUser){
        funZoneUserService.saveFunZoneUser(funZoneUser);
        return "redirect:/UsersRegisterLoginPage";
    }

    @GetMapping(path = "/UsersRegisterLoginPage/UsersLoginPage")
    public String usersLoginPage (Model model) {
        pageTitle = "Users Login Page";
        model.addAttribute("pageTitle", pageTitle);
        return "UsersLoginPage";
    }

}
