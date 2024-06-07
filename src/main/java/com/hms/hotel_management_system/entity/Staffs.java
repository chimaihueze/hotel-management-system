package com.hms.hotel_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Staff")
public class Staffs extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
