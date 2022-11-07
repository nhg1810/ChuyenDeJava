package com.chuyendejava.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@EqualsAndHashCode(of = {"MaCongViec"})
@Table(name = "CONG_VIEC")
@NoArgsConstructor
public class Job {
    @Id
    @Column(name ="MaCongViec")
    private String idJob;

    @Column(name ="TenCongViec")
    private String nameJob;

    @Column(name ="TenCongTy")
    private String nameCompany;

    @Column(name ="DiaChiCongTy")
    private String addressCompany;

    @Column(name ="ThoiGianLamViec")
    private Date timeJoinJob;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "MaNganhs")
    private Major major;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "SoCMND")
    private Student student;

    public Job(String nameJob, String nameCompany, String addressCompany, Date timeJoinJob, Major major, Student student) {
        this.nameJob = nameJob;
        this.nameCompany = nameCompany;
        this.addressCompany = addressCompany;
        this.timeJoinJob = timeJoinJob;
        this.major = major;
        this.student = student;
    }

    @PrePersist
    private void prePersist() {
        this.idJob = UUID.randomUUID().toString();
    }
}
