package com.hms.hotel_management_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "HR")
public class HR extends Staff {

    @Column
    private Customer customer;

    @OneToMany(mappedBy = "hr", fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private List<Report> reports;
}
