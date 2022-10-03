package com.gharkakhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gharkakhana.entity.Contact;

public interface IContactRepository extends JpaRepository<Contact, Integer> {

}
