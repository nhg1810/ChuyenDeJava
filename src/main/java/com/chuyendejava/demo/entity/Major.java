package com.chuyendejava.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "NGANH")
@NoArgsConstructor
public class Major {
    @Id
    @Column(name = "MaNganh")
    private int idMajor;
    @Column(name = "TenNganh")
    private String nameMajor;
    @Column(name = "LoaiNganh")
    private String majorType;


    public Major(int idMajor, String nameMajor, String majorType) {
        this.idMajor = idMajor;
        this.nameMajor = nameMajor;
        this.majorType = majorType;
    }
    @OneToMany(mappedBy = "major", cascade = CascadeType.ALL)
    private List<Graduation> graduation;
}
