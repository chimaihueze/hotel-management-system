package com.hms.hotel_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PAYMENT")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String Customer_name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Booking booking;

}
