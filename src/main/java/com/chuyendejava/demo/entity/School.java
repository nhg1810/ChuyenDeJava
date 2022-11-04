package com.chuyendejava.demo.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TRUONG")
@EqualsAndHashCode(of = {"MaTruong"})
public class School {
    @Id
    @Column(name = "MaTruong")
    private String idSchool;

    @Column(name = "TenTruong")
    private String nameSchool;

    @Column(name = "DiaChi")
    private String addrSchool;

    @Column(name = "SoDT")
    private int phoneSchool;
    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Graduation> graduation;
}
