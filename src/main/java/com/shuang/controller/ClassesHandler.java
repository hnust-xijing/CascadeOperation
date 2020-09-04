package com.shuang.controller;

import com.shuang.entity.Classes;
import com.shuang.repository.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassesHandler {

    @Autowired
    private  ClassesRepository classesRepository;
    @GetMapping("/findById/{id}")
    public Classes findById(@PathVariable("id") Long id){
        return classesRepository.findById(id);

    }

}
