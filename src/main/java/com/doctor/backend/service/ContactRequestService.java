package com.doctor.backend.service;

import com.doctor.backend.model.ContactRequest;
import com.doctor.backend.repository.ContactRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContactRequestService {
    @Autowired
    private ContactRequestRepository repository;

    public List<ContactRequest> getAllRequests() {
        return repository.findAll();
    }

    public ContactRequest saveRequest(ContactRequest request) {
        return repository.save(request);
    }
}
