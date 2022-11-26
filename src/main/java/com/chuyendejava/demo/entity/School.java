package com.chuyendejava.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TRUONG")
@NoArgsConstructor
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

    public School(String idSchool, String nameSchool, String addrSchool, int phoneSchool) {
        this.idSchool = idSchool;
        this.nameSchool = nameSchool;
        this.addrSchool = addrSchool;
        this.phoneSchool = phoneSchool;
    }

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Graduation> graduation;

}
