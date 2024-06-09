package com.hms.hotel_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Staff")
public class Staff extends User {

    @Column
    private String department;

    @Column
    private Double Salary;
}
