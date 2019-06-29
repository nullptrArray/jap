package com.example.demo.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="MEMBER")
public class Member {

    @Id
    @GeneratedValue
    @Column(name="ID")
    private String id;

    @Column(name="NAME")
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;
}
