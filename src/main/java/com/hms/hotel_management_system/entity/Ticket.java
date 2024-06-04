package com.hms.hotel_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "TICKET")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String subject;

    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
