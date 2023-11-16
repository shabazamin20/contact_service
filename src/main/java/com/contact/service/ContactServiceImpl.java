package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{

    //dummy contact list

    List<Contact> list = List.of(
            new Contact(1L,"shabaz@gmail.com","shabaz",1311L),
            new Contact(2L,"faraz@gmail.com","faraz",1312L),
            new Contact(3L,"shoeb@gmail.com","shoeb",1313L),
            new Contact(4L,"uzma@gmail.com","uzma",1314L),
            new Contact(5L,"afshan@gmail.com","afshan",1315L),
            new Contact(6L,"shezan@gmail.com","shezan",1311L)
    );

    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return this.list.stream().filter(c -> c.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
