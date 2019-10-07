package pl.threecityfunzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.threecityfunzone.model.FunZoneUser;
import pl.threecityfunzone.model.FunZoneUserDTO;
import pl.threecityfunzone.model.Person;
import pl.threecityfunzone.service.FunZoneUserService;
import pl.threecityfunzone.service.PersonService;

@Controller
public class FunZoneUserController {

    private String pageTitle = "";

    @Autowired
    private FunZoneUserService funZoneUserService;

    @Autowired
    private PersonService personService;

    @GetMapping(path = "/UsersRegisterPage")
    public String usersRegisterPage (Model model) {
        pageTitle = "Users Register Page";
        model.addAttribute("pageTitle", pageTitle);
        Person person = new Person();
        model.addAttribute("person", person);
        FunZoneUserDTO funZoneUserDTO = new FunZoneUserDTO();
        model.addAttribute("funZoneUserDTO", funZoneUserDTO);
        return "UsersRegisterPage";
    }

    @PostMapping(path = "/UsersRegisterPage")
    public String usersRegisterPage(Model model, Person person, FunZoneUserDTO funZoneUserDTO){
        personService.savePerson(person);
        funZoneUserService.saveFunZoneUser(funZoneUserDTO);
        return "redirect:/UsersRegisterLoginPage";
    }

    @GetMapping(path = "/UsersLoginPage")
    public String usersLoginPage (Model model) {
        pageTitle = "Users Login Page";
        model.addAttribute("pageTitle", pageTitle);
        return "UsersLoginPage";
    }

}
