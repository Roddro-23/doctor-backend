package com.doctor.backend.service;

import com.doctor.backend.model.Testimonial;
import com.doctor.backend.repository.TestimonialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestimonialService {
    @Autowired
    private TestimonialRepository repository;

    public List<Testimonial> getAllTestimonials() {
        return repository.findAll();
    }

    public Testimonial saveTestimonial(Testimonial testimonial) {
        return repository.save(testimonial);
    }

    public void deleteTestimonial(Long id) {
        repository.deleteById(id);
    }
}
