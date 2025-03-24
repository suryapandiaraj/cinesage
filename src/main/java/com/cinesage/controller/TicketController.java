package com.cinesage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinesage.model.Ticket;
import com.cinesage.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private TicketService ticketService;

    // get ticket details by ticketId
    @GetMapping("/getTicket/{ticketId}")
    public Ticket getTicket(@PathVariable Long ticketId) throws Exception {
        return ticketService.getTicket(ticketId);
    }

}
