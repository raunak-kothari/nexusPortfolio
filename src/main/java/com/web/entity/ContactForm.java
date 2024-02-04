package com.web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactForm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String mobile;
    private String message;

    // Default constructor required by JPA
    public ContactForm() {
        super();
    }

    // Parameterized constructor for creating a ContactForm instance with values
    public ContactForm(Long id, String name, String email, String mobile, String message) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.message = message;
    }

    // Getter and setter methods for the ContactForm fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // toString method for debugging and logging purposes
    @Override
    public String toString() {
        return "ContactForm [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", message="
                + message + "]";
    }
}
