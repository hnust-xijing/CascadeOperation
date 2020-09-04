package com.shuang.controller;



import com.shuang.entity.Students;
import com.shuang.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class Studentshandler {
    @Autowired
    private StudentsRepository studentsRepository;
    @GetMapping("/findById/{id}")
    public Students findById(@PathVariable("id") Long id){
        return studentsRepository.findById(id);
    }
}
