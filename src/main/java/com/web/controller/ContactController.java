package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.entity.ContactForm;
import com.web.service.ContactService;

@Controller
public class ContactController {

    // Autowiring the ContactService bean for dependency injection
    @Autowired
    private ContactService contactService;

    // Handler method for the home page
    @GetMapping("/")
    public String homePage() {
        return "home";  // Returns the view name for the home page
    }
    
    // Handler method for the contact page
    @GetMapping("/contact")
    public String contactPage(Model model) {
        // Adds an empty ContactForm object to the model for form binding
        model.addAttribute("contactForm", new ContactForm());
        return "contact";  // Returns the view name for the contact page
    }

    // Handler method for submitting the contact form
    @PostMapping("/submitContact")
    public String submitContact(@ModelAttribute("contactForm") ContactForm contactForm) {
        // Calls the ContactService to save the contact form data
        contactService.saveContact(contactForm);
        return "redirect:/";  // Redirects to the home page after form submission
    }
}
