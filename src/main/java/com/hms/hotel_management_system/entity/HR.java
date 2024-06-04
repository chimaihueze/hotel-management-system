package com.hms.hotel_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "HR")
public class HR {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "HR", fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private List<Report> Reports;
}
