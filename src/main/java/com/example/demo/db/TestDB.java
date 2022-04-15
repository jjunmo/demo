package com.example.demo.db;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TestDB {

    @Id
    @GeneratedValue
    private Integer idx;

    @Column
    private String title;

}
