package com.example.backendwebfinal.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "laboratory")
public class Laboratory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private User user;

    @Column(name = "lab_name")
    private String labName;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private int phoneNo;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "laboratory")
    private List<Donor> donor;

    public Laboratory() {
    }

    public Laboratory(User user, String labName, String address, int phoneNo, List<Donor> donor) {
        this.user = user;
        this.labName = labName;
        this.address = address;
        this.phoneNo = phoneNo;
        this.donor = donor;
    }
}
