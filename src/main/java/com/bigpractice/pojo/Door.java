package com.bigpractice.pojo;

import javax.persistence.*;

/**
 * @program: BigPractice
 * @author: fei
 * @description:
 * @create: 2020-04-10 15:12
 */

@Entity
@Table(name = "db_door")
public class Door {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "tel")
    private String tel;

    @Column(name = "addr")
    private String addr;
}
