package com.learnhub.internship.controller;

import com.learnhub.internship.model.Internship;
import com.learnhub.internship.repository.InternshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/internships")
public class InternshipController {

    @Autowired
    private InternshipRepository internshipRepository;

    @PostMapping
    public Internship createInternship(@RequestBody Internship internship) {
        return internshipRepository.save(internship);
    }

    @GetMapping
    public List<Internship> getAllInternships() {
        return internshipRepository.findAll();
    }
}
