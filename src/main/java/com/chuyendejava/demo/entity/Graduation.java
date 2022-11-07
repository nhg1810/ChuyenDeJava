package com.chuyendejava.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "TOT_NGHIEP")
@EqualsAndHashCode(of = {"MaTotNghiep"})
public class Graduation {
    @Id
    @Column(name = "MaTotNghiep")
    private String idGraduation;

    @Column(name = "HeTN")
    private String greduationSystem;
    @Column(name = "NgayTN")
    private Date dateGreduation;
    @Column(name = "LoaiTN")
    private String greduationType;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "MaTruong")
    private School school;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "SoCMND")
    private Student student;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "MaNganh")
    private Major major;

    @PrePersist
    private void prePersist() {
        this.idGraduation = UUID.randomUUID().toString();
    }
}
