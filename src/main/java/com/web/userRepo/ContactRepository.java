package com.web.userRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.entity.ContactForm;

@Repository
public interface ContactRepository extends CrudRepository<ContactForm, Long> {
	// The ContactRepository interface extends CrudRepository for basic CRUD
	// operations on ContactForm entities

	// Additional methods for custom database interactions can be added here, if
	// needed
}
