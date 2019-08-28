package pl.threecityfunzone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThreeCityFunZoneController {

    private String pageTitle = "";

    @GetMapping(path = "/")
    public String funZoneMainPage(Model model){
        pageTitle = "Three City Fun Zone";
        model.addAttribute("pageTitle", pageTitle);
        return "FunZoneMainPage";
    }

    @GetMapping(path = "/RegisterLoginPage")
    public String registerLoginPage (Model model) {
        pageTitle = "Register and Login Page";
        model.addAttribute("pageTitle", pageTitle);
        return "RegisterLoginPage";
    }

    @GetMapping(path = "/UsersRegisterLoginPage")
    public String usersRegisterLoginPage (Model model) {
        pageTitle = "Users Register and Login Page";
        model.addAttribute("pageTitle", pageTitle);
        return "UsersRegisterLoginPage";
    }

    @GetMapping(path = "/ImprovisationPage")
    public String improvisationPage (Model model) {
        pageTitle = "Theater Improvisation Page";
        model.addAttribute("pageTitle", pageTitle);
        return "ImprovisationPage";
    }

    @GetMapping(path = "/StandUpPage")
    public String standUpPage (Model model) {
        pageTitle = "Stand Up Page";
        model.addAttribute("pageTitle", pageTitle);
        return "StandUpPage";
    }

    @GetMapping(path = "/CabaretPage")
    public String cabaretPage (Model model) {
        pageTitle = "Cabaret Page";
        model.addAttribute("pageTitle", pageTitle);
        return "CabaretPage";
    }
}
