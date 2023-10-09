package com.example.api.controller;

import com.example.api.entity.TeacherEntity;
import com.example.api.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
public class TeacherController {
    private TeacherService service;
    public TeacherController(TeacherService service) {
        this.service = service;
    }
    @PostMapping("/teacher")
    public TeacherEntity addProduct(@RequestBody TeacherEntity product) {
        return service.createTeacher(product);
    }

    @GetMapping("/teachers")
    public List<TeacherEntity> findAllProducts() {
        return service.indexTeacher();
    }

    @GetMapping("/teacher/{id}")
    public TeacherEntity findProductById(@PathVariable int id) {
        return service.geIdTeacher(id);
    }

//    @GetMapping("/teacher/{name}")
//    public Optional<TeacherEntity> findProductByName(@PathVariable String firstName) {
//        return service.geNameTeacher(firstName);
//    }

    @PutMapping("/teacher/{id}")
    public TeacherEntity updateProduct(@RequestBody TeacherEntity product) {
        return service.updateTeacher(product);
    }

    @DeleteMapping("/teacher/{id}")
    public String deleteProduct(@PathVariable String id) {
        return service.deleteTeacher(id);
    }
}