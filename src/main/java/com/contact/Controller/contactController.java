package com.contact.Controller;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class contactController {
    private static final Logger log = LoggerFactory.getLogger(contactController.class);
    @Autowired
    private ContactService contactservice;
    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId){
    return this.contactservice.getContactOfUser(userId);
    }

    @GetMapping("/user/stringOne")
    public String getString(){

        log.info("service 2 main method Called");
        return "hello ";
    }
}
