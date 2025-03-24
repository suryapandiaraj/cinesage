package com.cinesage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinesage.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
