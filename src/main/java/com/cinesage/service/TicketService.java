package com.cinesage.service;

import org.springframework.stereotype.Service;

import com.cinesage.model.Ticket;
import com.cinesage.repository.TicketRepository;

@Service
public class TicketService {

    private TicketRepository ticketRepository;

    // get ticket by ticketId
    public Ticket getTicket(Long ticketId) throws Exception {
        try {
            return ticketRepository.findById(ticketId).get();
        } catch (Exception e) {
            throw new Exception("Ticket not found!");
        }
    }

}
