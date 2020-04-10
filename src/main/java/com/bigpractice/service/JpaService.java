package com.bigpractice.service;

import com.bigpractice.pojo.Door;

import java.util.List;

/**
 * @program: BigPractice
 * @author: fei
 * @description:
 * @create: 2020-04-10 15:37
 */

public interface JpaService {
    //List<Door> queryList();

    List<Door> findAll();

    Door findById(Integer id);
}
