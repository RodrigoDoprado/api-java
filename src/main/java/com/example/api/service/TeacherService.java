package com.example.api.service;

import com.example.api.entity.TeacherEntity;
import com.example.api.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class TeacherService {

    private TeacherRepository repository;

    public TeacherService(TeacherRepository repository) {
        this.repository = repository;
    }

    public TeacherEntity createTeacher(TeacherEntity product) {
        return repository.save(product);
    }

    public List<TeacherEntity> indexTeacher() {
        return repository.findAll();
    }

    public TeacherEntity geIdTeacher(int id) {
        return repository.findById(String.valueOf(id)).orElse(null);
    }

//    public Optional<TeacherEntity> geNameTeacher(String firstName) {
//        return repository.findby(firstName);
//    }

    public TeacherEntity updateTeacher(TeacherEntity product) {
        return repository.save(product);
    }
    public String deleteTeacher(String id) {
        repository.deleteById(String.valueOf(id));
        return "product removed !! " + id;
    }

    public String entollTeacher() {
        Calendar cal = GregorianCalendar.getInstance();
        var anoAtual = cal.get(Calendar.YEAR);
        var mesAtual = cal.get(Calendar.MONTH);
        if (mesAtual <= 6) {
            mesAtual = 1;
        } else {
            mesAtual = 2;
        }
        var siglaCurso = "PROF";
        var numeros = (int) (Math.random()*100);
        String enroll;
        return enroll = anoAtual+mesAtual+siglaCurso+numeros;
    }

}