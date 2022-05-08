package com.wipro.Epassport.Controller;

import com.wipro.Epassport.Entity.Application;
import com.wipro.Epassport.Entity.Epassport;
import com.wipro.Epassport.Exception.UserAlreadyExistException;
import com.wipro.Epassport.Service.EpassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UiController {
    @Autowired
    private EpassportService service;
    @GetMapping("/")
    public String index()
    {
        return "Homepage";
    }
    @GetMapping("/registration_form")
    public String showRegistrationForm(Model model)
    {
        Epassport epassport = new Epassport();
        model.addAttribute("epassport",epassport);
        return "EpassportRegistrationForm";
    }
    @PostMapping("/save")
    public String saveEpassport(@ModelAttribute("epassport") Epassport registrationDto, Model model)
    {
        try{
            service.save(registrationDto);
            return "redirect:/registration_form?success";
        }
        catch(UserAlreadyExistException e)
        {
            model.addAttribute("errorMessage",e.getMessage());
            return "EpassportRegistrationForm";
        }
    }
    @GetMapping("/application_form")
    public String registrationForm(Model model)
    {
        Application application = new Application();
        model.addAttribute("application",application);
        return "application_form";
    }
    @PostMapping("/saveApplication")
    public String saveApplicationForm(@ModelAttribute("application") Application applicationDto, Model model)
    {
        try
        {
            service.saveApplication(applicationDto);
            return "redirect:/application_form?success";
        }
        catch(UserAlreadyExistException e)
        {
            model.addAttribute("errorMessage",e.getMessage());
            return "application_form";
        }
    }
    @GetMapping("/Signup")
    public String showSignupForm(Model model)
    {
        Epassport epassport = new Epassport();
        model.addAttribute("epassport",epassport);
        return "User_login";
    }
    @PostMapping("/login")
    public String loginEpassport(@ModelAttribute("epassport") Epassport registrationDto, Model model)
    {
        boolean result=service.login(registrationDto);
        if(result){
            return "redirect:/login_success";
        }
        else
        {
            model.addAttribute("errorMessage","Invalid Username or Password");
            return "User_login";
        }
    }
    @GetMapping("/login_success")
    public String loginSuccess()
    {
        return "user_login_success";
    }
    @GetMapping("/List_Of_EpassportDetails")
    public String listOfEpassportDetails(Model model,String email)
    {
        model.addAttribute("List_Of_EpassportDetails",service.getAllEpassportDetailsByEmailId(email));
        return "EpassportDetails";
    }
    @GetMapping("/view_user")
    public String userDetails(Model model)
    {
        Application application = new Application();
        model.addAttribute("application",application);
        return "view_user";
    }
    @PostMapping("/saveUser")
    public String viewUser(@ModelAttribute("application") Application applicationDto,Model model)
    {
        listOfEpassportDetails(model,applicationDto.getEmail());
        return "EpassportDetails";
    }
    @GetMapping("/List_Of_EpassportDocuments")
    public String listOfEpassportDocumentDetails(Model model,String email)
    {
        model.addAttribute("List_Of_EpassportDetails",service.getAllEpassportDetailsByEmailId(email));
        return "EpassportDocumentDetails";
    }
    @GetMapping("/view_userdocuments")
    public String userDocuments(Model model)
    {
        Application application = new Application();
        model.addAttribute("application",application);
        return "view_userdocuments";
    }
    @PostMapping("/saveDocuments")
    public String viewDocuments(@ModelAttribute("application") Application applicationDto,Model model)
    {
        listOfEpassportDetails(model,applicationDto.getEmail());
        return "EpassportDocumentDetails";
    }
    @GetMapping("/request_for_appointment")
    public String requestAppointment()
    {
        return "Request_for_appointment";
    }
    @GetMapping("/change_appointment")
    public String changeAppointment()
    {
        return "change_appointment";
    }
}
