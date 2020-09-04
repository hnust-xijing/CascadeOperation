package com.shuang.entity;

import lombok.Data;

@Data
public class Students {
    private long id;
    private String name;
    private Classes classes;
}
