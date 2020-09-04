package com.shuang.repository;
import com.shuang.entity.Students;

public interface StudentsRepository {
    public Students findById(long id);
}
