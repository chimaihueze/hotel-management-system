package com.hms.hotel_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "BOOKING_MANAGER")
public class BookingManager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Customer customer;

    @OneToMany(mappedBy = "bookingManager", fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private List<Booking> Bookings;

    @OneToMany(mappedBy = "bookingManager", fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private List<Report> Reports;
}
