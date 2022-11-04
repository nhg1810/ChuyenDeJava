package com.chuyendejava.demo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "SINHVIEN")
@NoArgsConstructor
public class Student {

    @Id
    @Column(name = "SoCMND")
    private int idStudent;
    @Column(name = "HoTen")
    private String name;
    @Column(name = "Email")
    private String email;
    @Column(name = "SoDT")
    private int phone;
    @Column(name = "DiaChi")
    private String address;

    public Student(int idStudent, String name, String email, int phone, String address) {
        this.idStudent = idStudent;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Graduation> graduation;
}
