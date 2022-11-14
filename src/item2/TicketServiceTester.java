package item2;

import item2.beans.Ticket;
import item2.beans.TicketingService;

public class TicketServiceTester {

    public static void main(String[] args) {
        TicketingService ticketCart = new TicketingService();
        
        
        Ticket ticket1 = new Ticket("A001", 2.5F, 9);
        Ticket ticket2 = new Ticket("A002", 3.5F, 35);
        Ticket ticket3 = new Ticket("A003", 1.7F, 66);
        ticketCart.addTicket(ticket1);
        ticketCart.addTicket(ticket2);
        ticketCart.addTicket(ticket3);
        
        
        
        
    }

}
