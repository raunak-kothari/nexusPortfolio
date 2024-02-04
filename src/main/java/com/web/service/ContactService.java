package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.ContactForm;
import com.web.userRepo.ContactRepository;

@Service
public class ContactService {

    // Autowiring the ContactRepository bean for dependency injection
    @Autowired
    private ContactRepository contactRepository;

    // Method to save contact form data using the ContactRepository
    public void saveContact(ContactForm contactForm) {
        contactRepository.save(contactForm);  // Uses the save method from ContactRepository to persist the contactForm
    }
}
