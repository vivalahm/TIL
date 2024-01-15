package com.vivalahm.springbootadminpage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * packageName    : springbootadminpage.entity
 * fileName       : Test
 * author         : hmchoi
 * date           : 2024-01-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-01-15        hmchoi       최초 생성
 */

@Entity
public class Test {
    @Id
    @GeneratedValue
    @Column(name = "test_id")
    private Long id;

    private String name;
}
