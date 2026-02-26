package com.doctor.backend.repository;

import com.doctor.backend.model.MedicalService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalServiceRepository extends JpaRepository<MedicalService, Long> {
}
