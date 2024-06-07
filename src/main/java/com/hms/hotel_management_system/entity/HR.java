package com.hms.hotel_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "HR")
public class HR extends Staffs{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Customer customer;

    @OneToMany(mappedBy = "hr", fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private List<Report> Reports;
}
