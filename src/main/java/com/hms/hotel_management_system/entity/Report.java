package com.hms.hotel_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "REPORT")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "bookingManager_id")
    private BookingManager bookingManager;

    @ManyToOne
    @JoinColumn(name = "HR_id")
    private HR hr;
}
