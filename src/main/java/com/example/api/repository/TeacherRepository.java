package com.example.api.repository;

import com.example.api.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity,String> {
//    Product findByName(String name);
}
