package item2.beans;

import java.util.ArrayList;
import java.util.List;

public class TicketingService {
    private List<Ticket> tickets;
    
    public TicketingService() {
        tickets = new ArrayList<>();
    }
    
    public void addTicket(Ticket ticket) {
        if (ticket == null) {
            throw new IllegalArgumentException("Ticket should exist.");
        }
        this.tickets.add(ticket);
    }
    
    public void removeTicket(Ticket ticket) {
        if (ticket == null) {
            throw new IllegalArgumentException("Ticket should exist.");
        }
    }
    
    public float getTotalAmount() {
        float totalAmount = 0F;
        for (Ticket ticket : tickets) {
            totalAmount += ticket.getPrice();
        }
        return totalAmount;
    }
    
    public void checkOut(List<Ticket> tickets) {
        for (Ticket ticket: tickets) {
            System.out.println(ticket.getCode());
        }
    }
    
    
    
    
}
