package com.bigpractice.pojo;

import lombok.*;

import javax.persistence.*;

/**
 * @program: BigPractice
 * @author: fei
 * @description:
 * @create: 2020-04-10 15:12
 */

@Entity
@Table(name = "tb_door")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
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
