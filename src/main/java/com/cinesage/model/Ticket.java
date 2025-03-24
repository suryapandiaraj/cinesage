package com.cinesage.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ticketId;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @Column
    private LocalDateTime bookingDate;

    @Column
    private LocalDateTime showTiming;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private int count;

    @Column
    private String category;

    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private Theatre theatre;

}
