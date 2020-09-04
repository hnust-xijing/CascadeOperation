package com.shuang.controller;

import com.shuang.entity.Goods;
import com.shuang.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class Goodshandler {
    @Autowired
    private GoodsRepository goodsRepository;

    @GetMapping("/findById/{id}")
    public Goods findById(@PathVariable("id") long id){
        return goodsRepository.findById(id);
    }

}
