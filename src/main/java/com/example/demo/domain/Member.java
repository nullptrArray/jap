package com.example.demo.domain;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Table(name="MEMBER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column(name = "NAME", nullable = false, length = 20)
    private String username;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Lob
    private String description;

    @Builder
    public Member(String name, RoleType type, String description) {
        this.username = name;
        this.roleType = type;
        this.description = description;
    }
}
