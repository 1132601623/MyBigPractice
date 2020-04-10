package com.bigpractice.service.impl;

import com.bigpractice.mapper.JpaMapper;
import com.bigpractice.pojo.Door;
import com.bigpractice.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @program: BigPractice
 * @author: fei
 * @description:
 * @create: 2020-04-10 15:39
 */

@Service
public class JpaServiceImpl implements JpaService {

    @Autowired
    JpaMapper jpaMapper;
    @Override
    public List<Door> findAll() {
        return jpaMapper.findAll();
    }

    @Override
    public Door findById(Integer id) {
        Optional<Door> door = jpaMapper.findById(id);
        return door.get();
    }

}
