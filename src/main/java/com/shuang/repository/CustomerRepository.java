package com.shuang.repository;

import com.shuang.entity.Customer;

public interface CustomerRepository {
    public Customer findById(long id);
}
