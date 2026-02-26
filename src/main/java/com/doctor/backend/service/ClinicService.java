package com.doctor.backend.service;

import com.doctor.backend.model.Clinic;
import com.doctor.backend.repository.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClinicService {
    @Autowired
    private ClinicRepository repository;

    public List<Clinic> getAllClinics() {
        return repository.findAll();
    }

    public Clinic saveClinic(Clinic clinic) {
        return repository.save(clinic);
    }

    public void deleteClinic(Long id) {
        repository.deleteById(id);
    }
}
