package com.shuang.repository;

import com.shuang.entity.Goods;

public interface GoodsRepository {
    public Goods findById(long id);
}
