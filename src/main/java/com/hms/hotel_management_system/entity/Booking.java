package com.hms.hotel_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "BOOKING")
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long order_id;

    @Column
    private Date order_date;

    @Column
    private Date dateStart;

    @Column
    private Date dateEnd;

    @ManyToOne
    @joinColumn(name = "customer_id")
    private Customer customer;



}
