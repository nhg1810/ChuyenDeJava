package com.chuyendejava.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private long idStudent;
    @Column(name = "HoTen")
    private String name;
    @Column(name = "Email")
    private String email;
    @Column(name = "SoDT")
    private String phone;
    @Column(name = "DiaChi")
    private String address;

    public Student(long idStudent, String name, String email, String phone, String address) {
        this.idStudent = idStudent;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Graduation> graduation;

    @JsonIgnore
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    private List<Job> jobs;
}
