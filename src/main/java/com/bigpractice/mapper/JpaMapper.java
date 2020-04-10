package com.bigpractice.mapper;

import com.bigpractice.pojo.Door;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @program: BigPractice
 * @author: fei
 * @description:
 * @create: 2020-04-10 15:36
 */

public interface JpaMapper extends JpaRepository<Door , Integer> {
    Door save(Door door);
    List<Door> findAll();
    Optional<Door> findById(Integer id);
}
