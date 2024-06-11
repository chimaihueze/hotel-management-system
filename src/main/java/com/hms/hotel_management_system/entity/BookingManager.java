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
@Table(name = "BOOKING_MANAGER")
public class BookingManager extends Staff {

    @Column
    private Customer customer;

    @OneToMany(mappedBy = "bookingManager", fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private List<Booking> bookings;

    @OneToMany(mappedBy = "bookingManager", fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private List<Report> reports;
}
