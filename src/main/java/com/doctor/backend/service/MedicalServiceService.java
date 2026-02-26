package com.doctor.backend.service;

import com.doctor.backend.model.MedicalService;
import com.doctor.backend.repository.MedicalServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicalServiceService {
    @Autowired
    private MedicalServiceRepository repository;

    public List<MedicalService> getAllServices() {
        return repository.findAll();
    }

    public MedicalService saveService(MedicalService service) {
        return repository.save(service);
    }

    public void deleteService(Long id) {
        repository.deleteById(id);
    }
}
